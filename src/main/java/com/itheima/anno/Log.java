package com.itheima.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//用于aop里的切入点表达式
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//当你在Java代码中使用 @interface 关键字时，你就在定义一个自定义注解。
public @interface Log {
}
