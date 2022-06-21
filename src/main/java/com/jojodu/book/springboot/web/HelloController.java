package com.jojodu.book.springboot.web;

import com.jojodu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다. 예전의 @ResponsBody 를 각 메소드마다 선언한것을 한방에!!!
public class HelloController {

    @GetMapping("/hello") //Get 의 요청을 받을 수 있는 API
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,@RequestParam("amount") int amount){
        //RequestParam => 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션 => 여기서는 name이란 이름으로 넘긴 파라미터를 name 에 저장한다.
        return new HelloResponseDto(name, amount);
    }
}
