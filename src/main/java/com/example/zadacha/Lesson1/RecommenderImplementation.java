package com.example.zadacha.Lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies(String movie){
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results  = filter.getRecommendations("Finding Dory");
        return results;
    }
}
