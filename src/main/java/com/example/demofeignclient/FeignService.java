package com.example.demofeignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feignDemo", url="http://localhost:8084/account")
public interface FeignService {

  @GetMapping("/id")
  String getID();

  @GetMapping("/username")
  String getUsername();

  @GetMapping("/email")
  String getEmail();

}
