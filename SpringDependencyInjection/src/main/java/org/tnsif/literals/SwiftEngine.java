package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	//DI in the form of literals
   private String  company;
    private double cost;
   
public double cost() {
	// TODO Auto-generated method stub
	return cost;
}
public String display() {
	// TODO Auto-generated method stub
	return "America";
}


//DI using Constructor
public SwiftEngine(String company, double cost) {
	super();
	this.company = company;
	this.cost = cost;
}
//DI  using  SETTERS METHOD
public void setCompany(String company) {
	this.company = company;
}

public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return"Origin of company: "+company+" "+ fuel;
}

  
}
