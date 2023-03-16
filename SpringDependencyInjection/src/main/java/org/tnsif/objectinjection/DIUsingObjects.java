package org.tnsif.objectinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory f=new ClassPathXmlApplicationContext("web.xml");
		Cellphone e=f.getBean("c2",Cellphone.class);
		e.accept(); 
	

		
		
	} 

}


/*output
OnePlus 850 C-type

*/