package com.pets.services.adoption.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class AdoptionServiceBasic implements AdoptionService {
	
	private List<String> records;
	
	public AdoptionServiceBasic() {
		
	};
	
	
	public boolean loadRecords(String filePath) {
		
		try {
			this.records = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
					
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public List<String> searchRecords(String val1, String val2, String val3) {
		
			   return this.records.stream()
					   .filter(line -> (line.toLowerCase().contains(String.valueOf(val1).toLowerCase())
							   || line.toLowerCase().contains(String.valueOf(val2).toLowerCase())
							   || line.toLowerCase().contains(String.valueOf(val3).toLowerCase())))
					   .collect(Collectors.toList());			  
			   
	}
	
	public static void main(String ... args) {
		
		if (args.length < 2) {
			System.out.println("Please enter a file name and at 1 to 3 search parameters");
			return;
		}
		if (args.length > 4) {
			System.out.println("Please enter a file name and a max of 3 search parameters");
			return;
		}
		
		String filePath = args[0];
		String var1 = args[1];
		String var2 = null;
		String var3 = null;
		if (args.length == 3) 
			var2 = args[2];
		
		if (args.length == 4) 
			var3 = args[3];
		
		
		AdoptionService service = new AdoptionServiceBasic();
		if (service.loadRecords(filePath)) {
			List<String> records = service.searchRecords(var1, var2, var3);
			records.stream().forEach(record -> System.out.println(record.replace(",", " ")));
		}
		else {
			System.out.println("Error reading data file!");
		}
	}

}
