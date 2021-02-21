package com.lowes.codingtest.util;

import com.lowes.codingtest.pojos.input.Category;
import com.lowes.codingtest.pojos.input.ResultIn;
import com.lowes.codingtest.pojos.output.Output;
import com.lowes.codingtest.pojos.output.Quiz;
import com.lowes.codingtest.pojos.output.ResultOut;
import com.lowes.codingtest.reader.ReadSources;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Class to transform from the two urls
 */

@Service
@Slf4j
public class Transformer {

    /**
     * Method to transform the sources to combine them as per the contract
     * @return output of the contract
     */
    public Output transform(List<ResultIn>  resultIns) {

        List<Quiz> quizList = new ArrayList<>();

        //get distinct categories
        Set<String> distinctCategories = new HashSet<>();
        for(ResultIn resultIn: resultIns){
            distinctCategories.add(resultIn.getCategory());
        }

        //loop through each category and resultIn and add the result for each
        for(String category: distinctCategories){
            Quiz quiz = new Quiz();
            quiz.setCategory(category);
            List<ResultOut> resultOutList = new ArrayList<>();
            for(ResultIn resultIn: resultIns){
                if(category.equals(resultIn.getCategory())){
                    ResultOut resultOut = new ResultOut();
                    resultOut.setType(resultIn.getType());
                    resultOut.setDifficulty(resultIn.getDifficulty());
                    resultOut.setQuestion(resultIn.getQuestion());
                    List<String> allAnswers = new ArrayList<>();
                    allAnswers.add(resultIn.getCorrectAnswer());
                    List<String> incorrectAnswers = resultIn.getIncorrectAnswers();
                    if(incorrectAnswers!=null) {
                        for (String incorrectAnswer : incorrectAnswers) {
                            allAnswers.add(incorrectAnswer);
                        }
                    }
                    resultOut.setAllAnswers(allAnswers);
                    resultOut.setCorrectAnswer(resultIn.getCorrectAnswer());
                    resultOutList.add(resultOut);
                    quiz.setResults(resultOutList);
                }
            }
            quizList.add(quiz);
        }

        Output output = new Output();
        output.setQuiz(quizList);

        log.info("Output: {}", output);
        return output;
    }

}
