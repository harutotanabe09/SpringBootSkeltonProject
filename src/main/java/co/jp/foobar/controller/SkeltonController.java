package co.jp.foobar.controller;

import co.jp.foobar.entity.Staff;
import co.jp.foobar.service.SkeltonService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkeltonController {

  @Autowired SkeltonService service;

  @GetMapping("/skelton")
  public String index(Model model) {
    Optional<Staff> data = service.findOne(1);
    model.addAttribute("msg", "get::" + data.get().getFirstName());
    return "index";
  }
}
