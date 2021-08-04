package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        //throw new NotImplementedException();
        return numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> filterEndWithS(List<String> words) {
        //throw new NotImplementedException();
        return words
                .stream()
                .filter(word -> word.charAt(word.length()-1) == 's')
                .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        //throw new NotImplementedException();
        return numbers
                .stream()
                //.filter(number -> anotherNumbers.contains(number))
                .filter(anotherNumbers::contains)
                .collect(Collectors.toList());
    }


}
