package com.sqli.train.models;

import java.util.logging.Logger;

public class Wagon {
	protected boolean isLast;
	protected boolean isEmpty;
	static Logger logger = Logger.getLogger(Wagon.class.getName());

	public Wagon() {
		this.isLast = false;
		this.isEmpty = false;
	}

	public boolean isLast() {
		return isLast;
	}

	public void setLast(boolean isLast) {
		this.isLast = isLast;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;

	}

}
