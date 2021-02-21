package com.lowes.codingtest.pojos.output;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Output implements Serializable {
    private static final long serialVersionUID = 1726665136496893440L;
    private List<Quiz> quiz;

}
