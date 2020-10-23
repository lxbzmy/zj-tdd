package tdd.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.google.common.base.Objects;

import tdd.domain.Account;

public class UserController {

  @Autowired
  protected UserService service;

  @GetMapping
  public Account findByUsername(String username) {
    return service.find(username);
  }
  
  @PostMapping
  public Map<String,Object> login(String username,String password){
    Map<String, Object> map = new HashMap<String, Object>();
    if(isValid(username, password)) {
      map.put("status", 200);
      map.put("success", true);
      map.put("username", "张三");
    }else {
      map.put("status", 400);
      map.put("success", false);
    }
    return map;
  }

  @PostMapping
  public Account save(Account a) {
    return service.save(a);
  }
  
  
  private boolean isValid(String name,String password) {
    return Objects.equal(name, password);
  }

}
