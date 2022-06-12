package com.jojodu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다. 예전의 @ResponsBody 를 각 메소드마다 선언한것을 한방에!!!
public class HelloController {

    @GetMapping("/hello") //Get 의 요청을 받을 수 있는 API 생성
    public String hello(){
        return "hello";
    }
}