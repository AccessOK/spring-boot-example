package org.accessok.modules.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //声明这是一个切面类
@Component //注入Bean,当前类对象必须交给Spring进行管理。不给Spring管理，Spring就不能增强
public class Demo01AppAspect {
    /**
     * 方法上加的注解：@Around("切入点表达式")，用于选择对哪些方法进行增强
     * @param joinPoint 目标方法的信息，被增强的那个方法
     * @return
     */

    /**
     *  整个表达式可以分为五个部分：
     *  1、execution(): 表达式主体。
     *  2、第一个*号：表示返回类型，*号表示所有的类型。
     *  3、包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.sample.service.impl包、子孙包下所有类的方法。
     *  4、第二个*号：表示类名，*号表示所有的类。
     *  5、*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
     */
    @Around("execution(public * org.accessok.modules.service..*.*(..))")
    public Object executeTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature().getName() + ": " + (end - start));
        return result;
    }
}
