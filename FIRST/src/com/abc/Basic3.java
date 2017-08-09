package com.abc;

import java.awt.print.Book;

public class Basic3 {

	private static getRateOfInterest getRateOfInterest;

	public static int main(String[] args) {
		// TODO Auto-generated method stub
		getRateOfInterest =  getRateOfInterest();
		{return 0;}  
	}  
	  
	private static com.abc.getRateOfInterest getRateOfInterest() {
		return getRateOfInterest;
		// TODO Auto-generated method stub
		
	}

	class SBI extends Book{  
	int getRateOfInterest(){return 8;}  
	}  
	  
	class ICICI extends Book{  
	int getRateOfInterest(){return 7;}  
	}  
	class AXIS extends Book{  
	int getRateOfInterest(){return 9;}  
	}  
	  
	class Test2{  
	public void main(String args[]){  
	SBI s=new SBI();  
	ICICI i=new ICICI();  
	AXIS a=new AXIS();  
	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}  
	}

}
