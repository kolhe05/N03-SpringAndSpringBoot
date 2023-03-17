package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
//DI in the form  of objects
	private Cell cell;
	

//DI using setters
	@Autowired
//To Achieve Autowiring using Setters
	@Qualifier("c1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	public Remote() {
		System.out.println("Default constructor for Remote");
		
	}
//Injecting the object of cell class
	public void remote() {
		cell.power();
	}

}
