package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map((val)->val*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return this.array.stream().map((val)->{
            char newVal=(char)(val+96);
            return String.valueOf(newVal);
        }).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        return this.array.stream().map((val)->{
            String result = "";
            int multiple =val/26;
            int remainder =val%26;
            if(remainder ==0){
                remainder=26;
                multiple--;
            }
            result+=multiple<1?"":String.valueOf((char)('a'+multiple-1));
            result+=String.valueOf((char)('a'+remainder-1));
            return result;
        }).collect(Collectors.toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted().collect(Collectors.toList());
    }
}
