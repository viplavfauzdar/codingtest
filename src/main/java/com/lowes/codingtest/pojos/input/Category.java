package com.lowes.codingtest.pojos.input;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Category implements Serializable {

    private static final long serialVersionUID = 1726665136496893440L;

    private int responseCode;
    private List<ResultIn> results;
}
