package com.zohocorp.zohoreflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class JavaReflectionsExample 
{
  public static void main(String[] args)
  {
    try 
    {
    		Class testObj=Class.forName( "java.lang.String" );//takes the name of the class as an argument and returns the Class object
    		 System.out.println("Is String class primitive? "+testObj.isPrimitive());
    		 
		      // Create an object of MyClass
		      MyClass obj = new MyClass("John", 17);
		
		      // Get the class object
		      Class myCls = obj.getClass(); //object myCls of java.lang.Class
		
		      // Print the class name
		      System.out.println("Class name: " + myCls.getName());
		      
		      // get the superclass of MyClass
		      Class superClass = myCls.getSuperclass();
		      System.out.println("Superclass of MyClass Class: " + superClass.getName());
		      
		      Class[] objInterface = myCls.getInterfaces();
		      System.out.println("Interfaces:");
		      for(Class citem : objInterface) 
		      {
		          System.out.println("Interface Name: " + citem.getName());
		      }
		      
		      Constructor[] constructors = myCls.getDeclaredConstructors();
		      System.out.println("Constructors:");
	           for(Constructor c : constructors) 
	               System.out.println("Constructor Name: " + c.getName());
	           Constructor c=constructors[0];
	           int modifier = c.getModifiers();
               System.out.print ("Modifier: " + Modifier.toString(modifier) + "  ");
 
           // get the number of parameters in constructors
               System.out.println("Parameters: " + c.getParameterCount());
		
		
		      // Get the declared fields-public & private
		      Field[] fields = myCls.getDeclaredFields();
		      Field[] fields1 = myCls.getFields();
		
		      System.out.println("Declared fields:");
		      for (Field field : fields) 
		      {
		        System.out.println("  " + field.getName() + " - " + field.getType());
		      }
		      System.out.println("Public fields:");
		      for (Field field : fields1) 
		      {
		        System.out.println("  " + field.getName() + " - " + field.getType());
		      }
		      
		
		      // Get the declared methods-public & private
		      Method[] methods = myCls.getDeclaredMethods();
		      System.out.println("Declared methods:");
		      for (Method method : methods) 
		      {
		        System.out.println("  " + method.getName() + " - " + Arrays.toString(method.getParameterTypes()));
		      }
		      
		
		      // Invoke hello method
		      Method helloMethod = myCls.getDeclaredMethod("hello"); //NoSuchMethodException  can occur
		      helloMethod.invoke(obj);
		      
		      System.out.println("Return Type: " + helloMethod.getReturnType());
		      
		      Field studentAge = myCls.getField("age");
		      studentAge.set(obj, 18);
		      helloMethod.invoke(obj);
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  }
}
