package com.lowes.codingtest.pojos.output;

import lombok.Data;

import java.util.List;

@Data
public class Quiz {

    private String category;
    private List<ResultOut> results;
}
