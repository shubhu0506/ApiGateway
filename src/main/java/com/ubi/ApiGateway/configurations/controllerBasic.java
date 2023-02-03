package com.ubi.ApiGateway.configurations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerBasic {

    @GetMapping("/gate")
    public String getStr() {
        return "stirng hello";
    }
}
