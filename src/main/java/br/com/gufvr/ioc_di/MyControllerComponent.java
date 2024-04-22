package br.com.gufvr.ioc_di;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/component")
public class MyControllerComponent {

  @Autowired
  MyComponent myComponent;

  
  @GetMapping("/")
  public String callingComponent() {
      var result = myComponent.CallMyComponent();
      return result;
  }
}
