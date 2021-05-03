package com.springcore.springcore1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )   
    {
    	        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/springcore1/Configure.xml");
    	        
    	        Student stud1=(Student)context.getBean("Stud");
    	        System.out.println(stud1.getId());
    	        System.out.println(stud1.getParents());
    	        System.out.println(stud1.getPhones());
    	        System.out.println(stud1.getSubject());
     }
}
    
