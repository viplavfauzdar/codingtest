package com.lowes.codingtest.pojos.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.io.Serializable;


@Data
public class ResultIn implements Serializable {
    private static final long serialVersionUID = 1726665136496893440L;

    private String category;
    private String type;
    private String difficulty;
    private String question;
    @JsonProperty("correct_answer")
    private String correctAnswer;
    @JsonProperty("incorrect_answers")
    private List<String> incorrectAnswers;

}
