package com.myslyv4uk.simpleaop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SayServiceAspect {

  @Before("execution(* com.myslyv4uk.simpleaop.service.SayService.*(..))")
  public void before(JoinPoint joinPoint) {
    System.out.print("Before ");
    System.out.print(joinPoint.getSignature().getName() + " called with arguments ");
    System.out.println(Arrays.toString(joinPoint.getArgs()));
  }


  @After("execution(* com.myslyv4uk.simpleaop.service.SayService.*(..))")
  public void after(JoinPoint joinPoint) {
    System.out.print("After ");
    System.out.println(joinPoint.getSignature().getName());
  }

}
