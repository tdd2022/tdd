package com.sqli.train.models;

import java.util.logging.Logger;

import com.sqli.train.communs.constantes.MsgConstants;

public class Restaurant extends Wagon {
	static Logger logger = Logger.getLogger(Restaurant.class.getName());

	public Restaurant() {
		super();

	}

	@Override
	public String toString() {
		return MsgConstants.RESTAURANT;
	}

}
