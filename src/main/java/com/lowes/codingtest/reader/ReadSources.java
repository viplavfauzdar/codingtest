package com.lowes.codingtest.reader;

import com.lowes.codingtest.pojos.input.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Class to read the quiz urls
 */

@Service
@Slf4j
public class ReadSources {

    @Value("${category11.url}")
    private String CATEGORY11_URL;

    @Value("${category12.url}")
    private String CATEGORY12_URL;

    /**
     * Method to read category11 url asynchronously
     * @return Category11
     */
    @Async
    public Category readCategory11(){
        RestTemplate restTemplate = new RestTemplate();
        Category category = restTemplate.getForObject(CATEGORY11_URL, Category.class);
        log.info("Category11 {}", category);
        return category;
    }

    /**
     * Method to read category12 url asynchronously
     * @return Category12
     */
    @Async
    public Category readCategory12(){
        RestTemplate restTemplate = new RestTemplate();
        Category category = restTemplate.getForObject(CATEGORY12_URL, Category.class);
        log.info("Category12 {}", category);
        return category;
    }

}
