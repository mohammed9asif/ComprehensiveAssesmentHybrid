package com.assesment.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {
	Logger logs;
	
	public Logs() {
		logs=LogManager.getLogger(Logs.class.getName());
	}
	
	public void info(String message) {
		logs.info(message);
	}
	
	public void debug(String message) {
		logs.debug(message);
	}
	
	public void error(String message) {
		logs.error(message);
	}
	
	public void fatal(String message) {
		logs.fatal(message);
	}
	
	public void warn(String message) {
		logs.warn(message);
	}
}
