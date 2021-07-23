package com.ampu.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingSample {
	private static final Logger LOGGER = LogManager.getLogger(LoggingSample.class);

	public static void main(String[] args) {
		LOGGER.debug("This will be printed on debug");
		LOGGER.info("This will be printed on info");
		LOGGER.warn("This will be printed on warning");
		LOGGER.error("This will be printed on error");
		LOGGER.fatal("This will be printed on fatal");
		LOGGER.info("Appending string: {}.", "Hello, World");
		
		LOGGER.debug("debug - printing");
		LOGGER.info("info - printing");

	}

}
