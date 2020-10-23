package tdd.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.support.StaticApplicationContext;

public class CodingApplicationContext {
  
  @Autowired
  HelloController controller;

  @Test
  public void staticApplicationContext() throws Exception {
    StaticApplicationContext spring = new StaticApplicationContext();
    AnnotationConfigUtils.registerAnnotationConfigProcessors(spring);
    spring.getBeanFactory().registerSingleton("helloController",
        new HelloController());
    spring.refresh();
    spring.start();
    spring.getAutowireCapableBeanFactory().autowireBean(this);
    
    assertEquals("Hello world", controller.hello("world"));
    
    spring.close();
  }
}
