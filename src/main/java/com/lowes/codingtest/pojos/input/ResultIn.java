package com.lowes.codingtest.pojos.input;

import lombok.Data;

import java.util.List;

@Data
public class ResultIn {

    private String category;
    private String type;
    private String difficulty;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;

}
