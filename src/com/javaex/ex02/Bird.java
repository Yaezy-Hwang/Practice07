package com.javaex.ex02;

public abstract class Bird {
    protected String name;

    public void setName(String name) {
    	this.name = name;
    }
    
    protected String getName(String name) {
    	return name;
    }
    
    public abstract void fly();
    
    public abstract void sing();
    
    public void showName() {
    	System.out.println("새의 이름은"+name);
    }
    
    

}
