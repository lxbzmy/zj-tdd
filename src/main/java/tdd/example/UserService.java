package tdd.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import tdd.domain.Account;

@Service
public class UserService {

  public List<Account> findAll() {
    return Arrays.asList(new Account("张三"), new Account("李四"));
  }

  public Account find(String username) {
    if ("alex".equals(username)) {
      return new Account("alex");
    }
    return null;
  }

  public Account save(Account a) {
    return a;
  }
}
