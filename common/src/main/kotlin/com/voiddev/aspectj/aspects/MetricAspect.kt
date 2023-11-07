package com.voiddev.aspectj.aspects

import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect

@Aspect
class MetricAspect {
  @After("@annotation(metricAnnotation) && execution(* *(..))")
  fun after(metricAnnotation: MetricAnnotation) {
    println("MetricAspect: ${metricAnnotation.javaClass.simpleName}")
  }
}
