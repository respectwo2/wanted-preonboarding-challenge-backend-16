package com.wanted.preonboarding.ticket.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class TestController {
    @GetMapping("/mappingtest")
    public void testMapping() {
    	System.out.println("테스트하고싶어요");
    	
    }
	
}
