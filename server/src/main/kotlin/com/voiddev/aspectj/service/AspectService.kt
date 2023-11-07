package com.voiddev.aspectj.service

import com.voiddev.aspectj.aspects.MetricAnnotation
import org.springframework.stereotype.Service

@Service
class AspectService {
  @MetricAnnotation
  fun randomFunction(): String {
    return "Hello Aspect"
  }
}
