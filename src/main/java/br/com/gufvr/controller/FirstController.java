package br.com.gufvr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/firstController")
public class FirstController {

  @GetMapping("/firstMethod")
  public String firstMethod() {
      return "Primeira rota criada!";
  }
  

}
