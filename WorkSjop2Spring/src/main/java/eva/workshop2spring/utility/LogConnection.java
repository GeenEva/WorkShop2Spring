package eva.workshop2spring.utility;

import java.util.logging.*;
import java.io.*;

public class LogConnection {


	private final static Logger logger = Logger.getLogger(LogConnection.class.getName());

	public LogConnection() {
	}

	public static void initLogger() {

		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		FileHandler fileHandler = null;
		SimpleFormatter simpleFormatter = new SimpleFormatter();

		try {
			fileHandler = new FileHandler("log.xml"); 

			fileHandler.setLevel(Level.ALL);
			fileHandler.setFormatter(simpleFormatter);
			
			logger.addHandler(fileHandler);
			
		} catch (SecurityException ex) {
			
			logger.log(Level.WARNING, "Security error ocured", ex.getMessage());

		} catch (IOException e) {
			
			logger.log(Level.SEVERE, "IO exception occured, check log.xml", e.getMessage());

		}

	}
	

	public static Logger getLogger() {

		initLogger();
		return logger;
	}

}
