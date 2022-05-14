package com.sqli.train.models;

import java.util.logging.Logger;

import com.sqli.train.communs.constantes.MsgConstants;

public class Cargo extends Wagon {
	static Logger logger = Logger.getLogger(Cargo.class.getName());

	public boolean isEmpty() {
		return isEmpty;
	}

	public Cargo() {
		super();

	}

	@Override
	public String toString() {

		if (!isEmpty)
			return MsgConstants.EMPTY_CARGO;
		else
			return MsgConstants.FILLED_CRAGO;
	}

}
