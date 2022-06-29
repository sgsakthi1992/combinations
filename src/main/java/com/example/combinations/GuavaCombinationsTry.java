package com.example.combinations;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GuavaCombinationsTry {
    public static void main(String[] args) {

        List<Set<String>> listOfSets = new ArrayList<>();
        listOfSets.add(Set.of("Original Soup", "Spicy Soup", "Watercress Soup", "Thai Spicy Soup", "Malaysia Spicy Soup"));
        listOfSets.add(Set.of("Udon", "Ramen", "Egg Noodle", "Flat Rice Noodle", "Vermicelli", "Instant Noodle"));
        listOfSets.add(Set.of("Fish Cube", "Fish Ball", "Ham", "Squid", "Seaweed"));

        Set<List<String>> combo = Sets.cartesianProduct(listOfSets);
        combo.forEach(System.out::println);
    }
}
