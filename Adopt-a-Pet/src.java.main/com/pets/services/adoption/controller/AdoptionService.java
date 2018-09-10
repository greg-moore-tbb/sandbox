package com.pets.services.adoption.controller;

import java.util.List;

public interface AdoptionService {
	
	public boolean loadRecords(String filePath);
	
	public List<String> searchRecords(String val1, String val2, String val3);

}
