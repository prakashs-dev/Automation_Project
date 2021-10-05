package org.Log4j_File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Info {
	//------->factory design pattern
	static Logger log = Logger.getLogger(Logger_Info.class);
	
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure(".\\log4j\\log4j.properties");
		
		log.debug("Debug");
		
		log.fatal("Fatal Message");
		
		log.warn("Warning"); 
		
		log.info("Information");
		
		log.error("Error");
		
	}

}
