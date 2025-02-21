package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {

        return this.array.stream().filter((val)->{
            return val%2==0;
        }).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return this.array.stream().filter((val)->{
            return val%3==0;
        }).collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return this.array.stream().filter((val)->{
            return secondList.contains(val);
        }).collect(Collectors.toList());
    }

    public List<Integer> getDifferentElements() {
        return this.array.stream().distinct().collect(Collectors.toList());
    }
}