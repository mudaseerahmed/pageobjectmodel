package com.qa.abstractcomponent;

public class Singleton {
	private static Singleton singleton_instance=null;
	public String str;
	private Singleton() {
		
		str="i am using singleton class";
	}

	
	public static Singleton getinstance() {
		
		if(singleton_instance==null) 
			singleton_instance=new Singleton();
			
			
			
		
		
		return singleton_instance;
	}
	public static void main(String[]args) {
		Singleton x=Singleton.getinstance();
		Singleton y=Singleton.getinstance();
		Singleton z=Singleton.getinstance();
	x.str=(x.str).toUpperCase();
	System.out.println(x.str);

	System.out.println(y.str);
	System.out.println(z.str);
	System.out.println(x.hashCode());
	System.out.println(y.hashCode());
	
	z.str=(z.str).toLowerCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
		
	}
}
