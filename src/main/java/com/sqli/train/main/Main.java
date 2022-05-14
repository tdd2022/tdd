package com.sqli.train.main;

import java.util.logging.Logger;

import com.sqli.train.models.Train;

public class Main {
	static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		Train train = new Train("HRP");
		logger.info("train.print" + train.print());

	}

}
