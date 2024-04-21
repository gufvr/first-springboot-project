package br.com.gufvr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;



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

  @PostMapping("/headersParamsMethod")
  public String headersParamsMethod(@RequestHeader("name") String name) {
      return "headersParamsMethod " + name;
  }

  @PostMapping("/headersListParamsMethod")
  public String headersListParamsMethod(@RequestHeader Map<String, String> headers) {
      return "headersListParamsMethod " + headers.entrySet();
  }

  @GetMapping("/responseEntityMethod/{id}")
  public ResponseEntity<Object> responseEntityMethod(@PathVariable Long id) {
    var user = new User("GuFvr");

    if(id > 5){

      return ResponseEntity.status(HttpStatus.OK).body(user);
    }
    return ResponseEntity.badRequest().body("Número menor que 5");
  }

  record User(String username){
  }

}
