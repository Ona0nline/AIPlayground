package com.onaonline.lami.lami_backend.rideoptions.home;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/home")
    public String displayHomePage(){
        return "Hello tester API";
    }
}
