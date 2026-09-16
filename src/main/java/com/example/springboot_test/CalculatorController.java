package com.example.springboot_test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final Calculator calculator;
    private final MemberService memberService;

    @RequestMapping("/")
    String save(){
        memberService.save();
        return "Success";
    }
    @RequestMapping("/health")
    String health(){
        return "OK";
    }
}
