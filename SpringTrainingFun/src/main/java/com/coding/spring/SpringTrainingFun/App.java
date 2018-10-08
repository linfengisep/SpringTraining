package com.coding.spring.SpringTrainingFun;

import java.io.IOException;
import java.util.Properties;

import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Properties vProp = new Properties();
    	InputStream vInputStream = null;
    	try {
    		vInputStream = (InputStream) App.class.getResourceAsStream("/info.properties");
    		vProp.load(vInputStream);
    	} finally {
    		if(vInputStream !=null) {
    			vInputStream.close();
    		}
    	}
        System.out.println( "Application version:"+vProp.getProperty("com.coding.spring.version","?"));
    }
}
