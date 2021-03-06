package com.borris.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class TestAspect {


    @Before("PointcutConfig.allControllerMethod() && PointcutConfig.allService()")
    public void beforeAllPublicMethod(JoinPoint joinPoint) {
        System.out.println(" beforeAllPublicMethod 111");
    }

    @Before("PointcutConfig.allService()")
    public void beforeAllPublicMethodService(JoinPoint joinPoint) {
        System.out.println(" beforeAllPublicMethod Service");
    }

    @Around("PointcutConfig.allControllerMethod() && PointcutConfig.allService()")
    public Object aroundAllPublicMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(" aroundAllPublicMethod 111");
        return pjp.proceed();
    }
    @Around("PointcutConfig.allControllerMethod() && PointcutConfig.allService()")
    public Object aroundAllPublicMethod2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(" aroundAllPublicMethod 111");
        return pjp.proceed();
    }


}
