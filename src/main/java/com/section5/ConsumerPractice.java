/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.section5;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author akashk
 */
public class ConsumerPractice {

    public static <T> void printValue(List<T> list, Consumer<T> consume) {
        for (T t : list) {
            consume.accept(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Consumer<Integer> consume = l -> System.out.println(l);
        printValue(list, consume);
    }

}
