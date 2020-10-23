package tdd.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;

import tdd.domain.Account;

public class AssertStudyCase {

  ObjectMapper mapper = new ObjectMapper();

  public String hello() {
    return "hello world";
  }

  public List<Account> queryAccount() {
    return Arrays.asList(new Account("张三"));
  }

  public String accountComment() {
    try {
      return mapper.writeValueAsString(new Account("张三"));
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public List<Account> orderAccountByName() {
    return Arrays.asList(new Account("李四"), new Account("张三"));
  }

  public Map<String, Object> queryAccountAsMap() {
    return ImmutableMap.of("username", "张三");
  }

}
