package com.lowes.codingtest.controller;

import com.lowes.codingtest.pojos.output.Output;
import com.lowes.codingtest.util.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Response {

    @Autowired
    Transformer transformer;

    @GetMapping("/coding/exercise/quiz")
    public Output quiz(){
        return transformer.transform();
    }

}
