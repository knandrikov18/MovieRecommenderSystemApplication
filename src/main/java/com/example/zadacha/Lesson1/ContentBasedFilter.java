package com.example.zadacha.Lesson1;


import com.example.zadacha.lesson2.Filter;


public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Happy feet" , "Ice age" , "Shark Tale"};
    }

}
