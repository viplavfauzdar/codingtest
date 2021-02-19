package com.lowes.codingtest.pojos.output;

import lombok.Data;

import java.util.List;

@Data
public class ResultOut {

    private String type;
    private String difficulty;
    private String question;
    private List<String> allAnswers;
    private String correctAnswer;
}
