/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.section5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author akashk
 */
public class PredicatePractice {
    public static<T> List<T> filterTest(List<T> list,Predicate<T> pred){
        List<T> l=new ArrayList<>();
        for(T t:list){
            if(pred.test(t)){
                l.add(t);
            }
        }
        return l;
        
    }
    public static void main(String[] args) {
        List<Integer> l=List.of(1,2,3,4,5,6);
        Predicate<Integer> even=e->e%2==0;
        List<Integer> result=filterTest(l, even);
        System.out.println(result);
        
    }
    
}
