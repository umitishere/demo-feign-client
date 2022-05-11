package com.example.demofeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignController {

  @Autowired
  private FeignService feignService;

  @GetMapping("/user-id")
  public String getUserID() {
    return feignService.getID();
  }

  @GetMapping("/user-name")
  public String getUserName() {
    return feignService.getUsername();
  }

  @GetMapping("/user-email")
  public String getUserEmail() {
    return feignService.getEmail();
  }

}
