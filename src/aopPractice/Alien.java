package aopPractice;

import org.springframework.stereotype.Component;

//This is a bean class
@Component
public class Alien  {
	
	public void show()
	{
		System.out.println("Show the Alien");
	}

}
