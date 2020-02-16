package aopPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopMain {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) 
	
	{

		
		applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Alien al=(Alien) applicationContext.getBean("alien");
		al.show();
		

	}

}
