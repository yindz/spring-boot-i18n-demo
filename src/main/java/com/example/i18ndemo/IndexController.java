package com.example.i18ndemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 演示接口
 */
@Controller
public class IndexController {

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }
}
