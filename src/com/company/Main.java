package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(List.of(5, 678, 378, 14, 12345, 9872, 1846, 10));

        nums.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);
    }
}


