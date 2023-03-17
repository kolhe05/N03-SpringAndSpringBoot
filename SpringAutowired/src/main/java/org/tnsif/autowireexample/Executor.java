package org.tnsif.autowireexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
        Scholarship b=c.getBean("scholarship",Scholarship.class);
        b.caste();
        
       
	}

}


/*OUTPUT
Autowire Using Constructor
Fees Depends on Caste
Last day to Fill the Scholarship form is 30th March 2023 .Adani foundation gave 20 lakhs Scholarship to the poor Students 
*/