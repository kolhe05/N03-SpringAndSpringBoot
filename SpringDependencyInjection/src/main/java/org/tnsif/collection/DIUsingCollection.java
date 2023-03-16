package org.tnsif.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DIUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("collect.xml");
        CollectionDemo d= c.getBean("collection",CollectionDemo.class);
        d.display();
	}

}
/*OUTPUT
List of ContactNo :
986563244
985632741
967582144

Set of Books :
Alice in the Wonderland
Twilight
Harry Potter
*/