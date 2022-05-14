package com.sqli.train.communs.helper;

import java.util.logging.Logger;

import com.sqli.train.communs.constantes.MsgConstants;
import com.sqli.train.models.Cargo;
import com.sqli.train.models.Head;
import com.sqli.train.models.Passenger;
import com.sqli.train.models.Restaurant;
import com.sqli.train.models.Wagon;

public final class WagonFactory {

	private WagonFactory() {
	}

	static Logger logger = Logger.getLogger(WagonFactory.class.getName());

	public static Wagon createWagon(String wagonPrefix) {

		switch (wagonPrefix) {
			case MsgConstants.HEAD_PREFIX:
				return new Head();
			case MsgConstants.PASSENGER_PREFIX:
				return new Passenger();
	
			case MsgConstants.RESTAURANT_PREFIX:
				return new Restaurant();
	
			case MsgConstants.CARGO_PREFIX:
				return new Cargo();
	
			default:
				return null;

		}
	}
}
