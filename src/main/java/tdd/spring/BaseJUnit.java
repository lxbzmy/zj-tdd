package tdd.spring;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

import tdd.example.HelloController;
 
/**
 * 单元测试基础类
 *
 */
@ContextConfiguration(classes = BaseJUnit.SimpleBeanContext.class, 
initializers = ConfigFileApplicationContextInitializer.class)
public class BaseJUnit {
 
    @Rule
    public ExpectedException assertException = ExpectedException.none();
 
    @Rule
    public SpringMethodRule springMethodRule = new SpringMethodRule();
 
    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();
 
    public static class SimpleBeanContext {
      @Bean
      HelloController a() {
        return new HelloController();
      }
 
    }
 
}
