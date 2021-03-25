package com.company;

import java.io.FileInputStream;
import java.util.Properties;

public class MyFactory {
    public static Object getInstance(String objName){
        FileInputStream file = null;
        try{
            file = new FileInputStream("MiFactory.properties");
            Properties properties = new Properties();
            properties.load(file);
            String nombreClase = properties.getProperty(objName);

            //Class c1 = Class.forName(nombreClase);
            return Class.forName(nombreClase).newInstance();
        }catch (Exception e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
}
