package com.java.FirstSpringmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=  new ClassPathXmlApplicationContext("spring.xml");
    	
    	Student s=ctx.getBean(Student.class);
    	
    	Employee e=(Employee) ctx.getBean("e1");
    	
    	System.out.println(s.toString());
        System.out.println( "Hello World!" );
        
        e.work();
        System.out.println(e.toString());
    }
}
