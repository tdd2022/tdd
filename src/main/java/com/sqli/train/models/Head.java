package com.sqli.train.models;

import java.util.logging.Logger;

import com.sqli.train.communs.constantes.MsgConstants;

public class Head extends Wagon {
	static Logger logger = Logger.getLogger(Head.class.getName());

	public Head() {
		super();

	}

	@Override
	public String toString() {

		if (!isLast)
			return MsgConstants.FIRST_WAGON;
		else
			return MsgConstants.LAST_WAGON;

	}

}
