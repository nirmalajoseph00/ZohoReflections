package com.zohocorp.zohoreflections;

interface Person {
	   public void display();
	}

public class MyClass implements Person
{
	  private String name;
	  public int age;

	  public MyClass(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  public void hello() {
	    System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
	  }

	@Override
	public void display() {
		System.out.println("I am a Student");
		   
	}
	}