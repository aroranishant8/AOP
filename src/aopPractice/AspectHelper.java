package aopPractice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/*Aspect: The class which implements the JEE application cross-cutting concerns
 * (transaction, logger etc) is known as the aspect. 
 * It can be normal class configured through XML configuration or 
 * through regular classes annotated with @Aspect.*/
// This class is anotated with @Aspect 
// and will contain advices.
@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectHelper {
	
	/*Weaving: The process of linking Aspects with an Advised Object. 
	 * It can be done at load time, compile time or at runtime time. 
	 * Spring AOP does weaving at runtime*/

	@Pointcut("execution(public void show())")
	public void pointcutForAround()  {
		
		System.out.println("Before Step");
	}
	
	/*Around advice is declared using the @Around annotation.
	 *  The first parameter of the advice method must be of type ProceedingJoinPoint. 
	 *  Within the body of the advice, calling proceed() on the ProceedingJoinPoint 
	 *  causes the underlying method to execute. The proceed method may also be called passing in an Object[] - 
	 * the values in the array will be used as the arguments to the method execution when it proceeds.*/
	// Passing a JoinPoint Object 
    // into parameters of the method 
    // with the annotated advice 
    // enables to print the information 
    /// when the advice is executed 
    // with the help of toString() method 
    // present in it. 
	@Around("pointcutForAround()")
	public Object loggingadvice1(ProceedingJoinPoint pjp) throws Throwable {
	
		System.out.println("Before Step");
		return pjp.proceed();
	}
	
	

}
