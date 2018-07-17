package com.gg3083.tb.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "error")
public class ConfigController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "404";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }
}
