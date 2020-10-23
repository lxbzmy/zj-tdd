package tdd.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloControllerTest extends BaseJUnit {

  @Autowired
  HelloController sut;
  
  @Test
  public void eq_hello_world() throws Exception {
    String result = sut.hello("world");
    assertEquals(result,"Hello world");
  }
 
}
