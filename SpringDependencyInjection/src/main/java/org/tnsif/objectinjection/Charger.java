package org.tnsif.objectinjection;

public class Charger {
	//private data members
	private String brand;
	private int voltage;
	private String type;

	//DI USING SETTERS
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		this.type = type;
		
	
	}
	
	public void power() {
		
		// TODO Auto-generated method stub
		System.out.println(brand+" "+voltage+" "+type);
		
	}
	

}
