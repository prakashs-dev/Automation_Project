package com.Helper;

public class File_Reader_Manager {

	private File_Reader_Manager() {
		//retrisct to create object in a another class
	}
	
	public static File_Reader_Manager getInstance() {
	File_Reader_Manager reader = new File_Reader_Manager();
	return reader;
	
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
	Configuration_Reader reader = new Configuration_Reader();
	return reader;
	
	}
}
