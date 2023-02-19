package com.fastcampus.springpractice.controller;

import com.fastcampus.springpractice.service.SortService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// Cannot run program "apache-tomcat-10.1.5/bin/catalina.sh" (in directory "apache-tomcat-10.1.5/bin"): error=13, Permission denied
// chmod +x /Users/woochoi/Study/apache-tomcat-10.1.5/bin/catalina.sh

@RestController
public class MainController {

  private final SortService sortService;

  public MainController(SortService sortService) {
    this.sortService = sortService;
  }

  @GetMapping("/")
  public String hello(@RequestParam List<String> list) {
    return sortService.doSort(list).toString();
  }


}
