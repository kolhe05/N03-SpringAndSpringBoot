package org.tnsif.objectinjection;

public class Cellphone {
//DEPENDENCY INJECTION IN THE FORM OF OBJECTS
	Charger charger;

	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
	public void accept()
	{
		charger.power();
	}

}
