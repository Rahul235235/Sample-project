package com.abc;

class Thread{  
	 int id;  
	 String name;  
	}  
	class TestStudent2{  
	 public static void main(String args[]){  
	  Thread s1=new Thread();  
	  s1.id=101;  
	  s1.name="Sonoo";  
	  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
	 }  
	}   