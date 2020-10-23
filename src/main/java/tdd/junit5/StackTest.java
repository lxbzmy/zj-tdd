package tdd.junit5;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Stack;



public class StackTest {

  Stack<Object> stack = new Stack<>();

  @Test
  public void 空堆栈的size是0() throws Exception {
    assertEquals(0, stack.size());
  }

  @Test
  public void 放入一个对象后size加1() throws Exception {
    //TODO
  }

  @Test
  public void pop一个对象后size减1() throws Exception {
    //TODO
  }
  
  @Test
  public void 空栈pop报异常() throws Exception {
    //TODO assertThrows(null, null);
  }
}
