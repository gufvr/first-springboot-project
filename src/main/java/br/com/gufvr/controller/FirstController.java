package br.com.gufvr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/firstController")
public class FirstController {

  @GetMapping("/firstMethod/{id}")
  public String firstMethod(@PathVariable String id) {
      return "O parâmetro é " + id;
  }
  
  @GetMapping("/queryParamsMethod")
  public String queryParamsMethod(@RequestParam String id) {
    return "O parâmetro com queryParamsMethod é " + id;
  }

  @GetMapping("/queryParamsMethod2")
  public String queryParamsMethod2(@RequestParam Map<String, String> allParams) {
    return "O parâmetro com queryParamsMethod é " + allParams.entrySet();
  }

  @PostMapping("/bodyParamsMethod")
  public String bodyParamsMethod(@RequestBody User user) {
      return "bodyParamsMethod " + user.username();
  }

  record User(String username){
  }

}
