package com.nt.ioc;
import java.util.Date;

public class WishGenerator {
	
	private Date dt;
	
	public WishGenerator() {
		System.out.println("WishGenerator Constructor");
	}
	
	public void setDt(Date d) {
		this.dt = d;
	}
	
	public void generateMsg(String name) {
		
		int hour = dt.getHours();
		
		if(hour < 12) {
			System.out.println("Good Morning " + name);
		} else {
			System.out.println("Good Evening " + name);
		}
	}

}
