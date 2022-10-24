package com.example.zadacha;

import com.example.zadacha.Lesson1.ContentBasedFilter;
import com.example.zadacha.Lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {

        RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
        String[] results = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results));
        SpringApplication.run(MovieRecommenderSystemApplication.class, args);
    }

}
