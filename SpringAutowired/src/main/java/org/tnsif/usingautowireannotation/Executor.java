package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext ("web.xml");
		Remote r=c.getBean("remote",Remote.class);
		r.remote();

	}

}
/*OUTPUT
Default constructor for Cell
Default constructor for Remote
Company of a Cell:Everyday
Size of Cell is:small
*/