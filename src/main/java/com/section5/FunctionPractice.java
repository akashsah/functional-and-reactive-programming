/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author akashk
 */
public class FunctionPractice {
    public static<T,R> List<R> mapList(List<T> list,Function<T,R> func){
        List<R> returnList=new ArrayList<>();
        for(T t:list){
            returnList.add(func.apply(t));
        }
        return returnList;
    }
    public static void main(String[] args) {
        List<String> list=List.of("ash","rahul","rohan");
        Function<String,Integer> func=e->e.length();
        List<Integer> result=mapList(list, func);
        System.out.println(result);
    }
}
