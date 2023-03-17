package org.tnsif.autowireexample;

public class Fees {
	 Scholarship b;

	/*public void setB(Scholarship b) {
		this.b = b;

	}*/
public void accept()
  {
	  b.caste();
  }
//DI USING CONSTRUCTOR
public Fees(Scholarship b) {
		super();
		this.b = b;

		System.out.println("Autowire Using Constructor");
}

}
