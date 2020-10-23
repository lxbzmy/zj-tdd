package tdd.groovy

import spock.lang.Specification
import tdd.FizzBuzz

class FizzBuzzSpec extends Specification {


  def 输入1返回1() {
    given:
    FizzBuzz sut = new FizzBuzz();
    when:
    String result = sut.fizzBuzz(1);
    then:
    result == "1"
  }
}
