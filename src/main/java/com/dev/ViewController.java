package com.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class ViewController {
    @RequestMapping("/")
    public String react() {
        return "index";
    }
}
