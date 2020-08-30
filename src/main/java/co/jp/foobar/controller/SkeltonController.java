package co.jp.foobar.controller;

import co.jp.foobar.entity.Staff;
import co.jp.foobar.service.SkeltonService;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class SkeltonController {

  @Autowired SkeltonService service;

  @GetMapping("/skelton")
  public String index(Model model) {
    Optional<Staff> data = service.findOne(100);
    if (data.isPresent()) {
      model.addAttribute("msg", "get::" + data.get().getFirstName());
    } else {
      log.error("massage is null");
    }
    return "index";
  }
}
