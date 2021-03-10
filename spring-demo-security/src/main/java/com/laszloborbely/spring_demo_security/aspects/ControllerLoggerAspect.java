package com.laszloborbely.spring_demo_security.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ControllerLoggerAspect {
    @Around("execution(* com.laszloborbely.spring_demo_security.controllers.*.*(..))")
    public Object logAroundAllMethods(ProceedingJoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().toString());
        try {
            Object returns = joinPoint.proceed();
            System.out.println("After: " + joinPoint.getSignature().toString());
            return returns;
        } catch (Throwable error) {
            return error;
        }
    }
}