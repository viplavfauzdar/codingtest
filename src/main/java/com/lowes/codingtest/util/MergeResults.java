package com.lowes.codingtest.util;

import com.lowes.codingtest.pojos.input.Category;
import com.lowes.codingtest.pojos.input.ResultIn;
import com.lowes.codingtest.reader.ReadSources;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Class to merge the responses from the two urls
 */
@Slf4j
@Component
public class MergeResults {

    @Autowired
    ReadSources readSources;

    public List<ResultIn> merge(){

        //Read url sources
        Category category11 = readSources.readCategory11();
        Category category12 = readSources.readCategory12();

        List<ResultIn> resultIns11 = category11.getResults();
        List<ResultIn> resultIns12 = category12.getResults();

        //combine the results from the two
        log.info("Before: {}", resultIns11);
        resultIns11.addAll(resultIns12);
        log.info("Combined: {}", resultIns11);

        return resultIns11;

    }
}
