package com.lowes.codingtest.pojos.input;

import lombok.Data;

import java.util.List;

@Data
public class Category {

    private int responseCode;
    private List<ResultIn> results;
}
