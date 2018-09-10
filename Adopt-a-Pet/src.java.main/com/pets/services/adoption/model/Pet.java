package com.pets.services.adoption.model;

public class Pet {

	private String name;
	private String type;
	private String gender;
	
	public Pet(String name, String type, String gender) {
		this.name = name;
		this.type = type;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		
		return "Name: " + name + " Type: " + type + " Gender: " + gender;
	}

	
}
