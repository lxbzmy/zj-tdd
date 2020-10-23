package tdd.example;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tdd.spring.BaseJUnit;
import tdd.example.HelloController;

public class HelloControllerTest extends BaseJUnit {

  @Autowired
  HelloController sut;
  
  @Test
  public void eq_hello_world() throws Exception {
    String result = sut.hello("world");
    assertEquals(result,"Hello world");
  }
 
}
