package com.example.i18ndemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

/**
 * 演示接口
 */
@Controller
public class IndexController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(value = "/")
    public String index(ModelMap model){
        Locale locale = LocaleContextHolder.getLocale();
        //手动取值
        model.addAttribute("copyrightMsg", messageSource.getMessage("system.copyright", null, locale));
        return "home";
    }
}
