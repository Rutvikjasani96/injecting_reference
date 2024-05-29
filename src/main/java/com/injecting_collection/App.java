package com.injecting_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("referenceconfig.xml");
        A aref = (A) context.getBean("aref");
        System.out.println(aref.getX());
        System.out.println(aref.getOb().getY());

        A arefSimple = (A) context.getBean("arefSimple");
        System.out.println(arefSimple.getX());
        System.out.println(arefSimple.getOb().getY());
    }
}
