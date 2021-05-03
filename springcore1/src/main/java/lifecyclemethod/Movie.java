package lifecyclemethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Movie {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecyclemethod/Configure.xml");
		Popcorn p=(Popcorn) context.getBean("pop");
		Pepsi p1=(Pepsi) context.getBean("pep");
		

		System.out.println(p);
		System.out.println(p1);

		context.registerShutdownHook();
	}

}
