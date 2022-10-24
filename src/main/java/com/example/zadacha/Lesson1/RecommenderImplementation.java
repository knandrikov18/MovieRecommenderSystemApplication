package com.example.zadacha.Lesson1;

import com.example.zadacha.lesson2.Filter;
public class RecommenderImplementation {

    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String [] recommendMovies(String movie){
        System.out.println("The name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
