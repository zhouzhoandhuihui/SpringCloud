package cn.yh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String  hello(@RequestParam String name){
        return "hello "+name+"，this is first messge,peer2";
    }

}
