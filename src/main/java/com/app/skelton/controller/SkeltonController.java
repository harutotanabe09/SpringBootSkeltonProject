package com.app.skelton.controller;

import com.app.skelton.service.SkeltonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkeltonController {

  @Autowired SkeltonService service;

  @RequestMapping("/skelton")
  public String index() {
    Long l = 1L;
    service.findOne(l);
    return "Greetings from Spring Boot!";
  }
}
