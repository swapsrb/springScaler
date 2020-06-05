package edu.scalerSpring.webapp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogger
{
    @Before("execution(* edu.scalerSpring.webapp.HelloController.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint)
    {
        System.out.println("Hello : " + joinPoint.getSignature().getName());
    }
    @After("execution(* edu.scalerSpring.webapp.HelloController.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint)
    {
        System.out.println("Bye : " + joinPoint.getSignature().getName());
    }
}
