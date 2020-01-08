package com.testcase;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
//import org.apache.log4j.BasicConfigurator;

public class TestLogger {

	final static Logger log = Logger.getLogger(TestLogger.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("./properties/log4j.properties");
		// BasicConfigurator.configure();

		try {

//			throw new Exception("Test exception");

			log.trace("This is TRACE ");

			log.debug("This is DEBUG ");

			log.info("This is INFO ");

			log.warn("This is WARN ");

			log.error("This is ERROR ");

			log.fatal("This is FATAL ");

		} catch (Exception e) {
			log.error(e);
			// log.error(e, e);
		} finally {
			// TODO Pending code
		}

	}

}
