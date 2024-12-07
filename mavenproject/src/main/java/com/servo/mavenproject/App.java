package com.servo.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
//        Vehicle obj = (Vehicle) context.getBean("bike");
//        obj.drive();
//        Car t = (Car) context.getBean("car");
//        System.out.println(t);
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung obj = factory.getBean(Samsung.class);
    	obj.details();
    }
}
