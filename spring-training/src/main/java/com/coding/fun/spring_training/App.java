package com.coding.fun.spring_training;

import com.coding.fun.ioc.OneInterface;
import com.coding.fun.ioc.OneInterfaceImpl;

public class App 
{
    public static void main( String[] args )
    {

		OneInterface inter = new OneInterfaceImpl();
		System.out.println(inter.say("World"));
    }
}
