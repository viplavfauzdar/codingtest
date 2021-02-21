package com.lowes.codingtest.pojos.output;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResultOut implements Serializable {
    private static final long serialVersionUID = 1726665136496893440L;
    private String type;
    private String difficulty;
    private String question;
    private List<String> allAnswers;
    private String correctAnswer;
}
