package com.nullbeans.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myservice")
public class MyRestServiceController {

    @GetMapping("test")
    public String test(){
        return "Hello from docker";
    }


}
