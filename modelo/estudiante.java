// Java Program of JavaBean class 
package com.javacodegeeks.javabean; 
public class Student implements java.io.Serializable 
{ 
private int id; 
private String name; 
public Student() 
    { 
    } 
public void setId(int id) 
    { 
        this.id = id; 
    } 
public int getId() 
    { 
        return id; 
    } 
public void setName(String name) 
    { 
        this.name = name; 
    } 
public String getName() 
    { 
        return name; 
    } 
}