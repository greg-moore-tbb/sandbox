package com.pets.services.adoption.model;

public class PetRecord {
	
	private int location;
	private Pet pet;
	private int id;
	public static final String ls = System.getProperty("line.separator");
	
	public PetRecord(int id, Pet pet, int location) {
		this.id = id;
		this.location = location;
		this.pet = pet;
	}
	
	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		
		return "Location: " + location + ls + pet;
	}

	

}
