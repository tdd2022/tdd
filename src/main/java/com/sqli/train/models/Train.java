package com.sqli.train.models;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.sqli.train.communs.constantes.MsgConstants;
import com.sqli.train.communs.helper.WagonFactory;

public class Train {

	Logger logger = Logger.getLogger(Train.class.getName());
	List<Wagon> wagons = new ArrayList<>();

	public Train(String structure) {

		for (int i = 0; i < structure.length(); i++) {
			Wagon wagon = WagonFactory.createWagon(String.valueOf(structure.charAt(i)));
			this.wagons.add(wagon);

		}
		this.wagons.get(this.wagons.size() - 1).setLast(true);

	}

	public String print() {
		return this.wagons.stream().map(p -> p.toString()).collect(Collectors.joining(MsgConstants.SEPARATOR));
	}

	public void detachEnd() {
		this.wagons.remove(wagons.size() - 1);
	}

	public void detachHead() {
		this.wagons.remove(0);
	}

	public boolean fill() {
		boolean existEmptyCargo = Boolean.TRUE;
		List<Wagon> wagonsChanged = new ArrayList<>();
		for (Wagon wagon : this.wagons) {
			if (wagon instanceof Cargo && !wagon.isEmpty) {

				wagon.setEmpty(true);
				wagonsChanged.add(wagon);
				return existEmptyCargo;

			} else {
				wagonsChanged.add(wagon);
			}
		}
		this.wagons = wagonsChanged;
		existEmptyCargo = Boolean.FALSE;
		return existEmptyCargo;

	}
}
