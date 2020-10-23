package tdd.groovy

import org.junit.jupiter.api.Test
import tdd.FizzBuzz

class FizzBuzzTest {

  @Test
  void 输入1返回1(){
    assert new FizzBuzz().fizzBuzz(1) == '1';
  }
}
