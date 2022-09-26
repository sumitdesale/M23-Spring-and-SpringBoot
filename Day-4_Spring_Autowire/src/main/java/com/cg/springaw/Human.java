package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	//Dependency in terms of object
	private Heart heart;
	
	
	//Achieving  DI using setters
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}



	//Achieving  DI using setters
	@Autowired
	@Qualifier("humanheart")
	public void setHeart(Heart heart) {
		
		this.heart = heart;
	}


	



	public void pupming() 
	{
		heart.pump();
		System.out.println("name of the animal is: "+heart.getNameofAnimal()+"\n"+
				" no. of heart is: "+heart.getNoofHeart());
	}


//default constructor
	public Human() {
		this.heart=heart;
	}
	
	
}
