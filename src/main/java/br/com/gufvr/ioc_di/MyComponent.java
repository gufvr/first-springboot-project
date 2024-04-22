package br.com.gufvr.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MyComponent {
  public String CallMyComponent() {
    return "Chamando meu componente.";
  } 
}
