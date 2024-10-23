package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class callController {

    /**
     * 사번조회
     *
     * @param 
     * @return 82222190
     */
    @GetMapping(value = "/user")
    public String getId() {
        return "82222190";
    }

}
