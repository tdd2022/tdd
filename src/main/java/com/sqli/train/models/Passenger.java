package com.sqli.train.models;

import java.util.logging.Logger;

import com.sqli.train.communs.constantes.MsgConstants;

public class Passenger extends Wagon {
	static Logger logger = Logger.getLogger(Passenger.class.getName());

	public Passenger() {
		super();
	}

	@Override
	public String toString() {
		return MsgConstants.PASSENGER;
	}

}
