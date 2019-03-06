package com.zipcodewilmington.looplabs;

import org.junit.Test;

import static org.junit.Assert.*;

public class DavisListTest {

    @Test
    public void getNumberOfOccurrences() {
        //Given
        DavisList davisList = new DavisList(new Object[]{1, 1, 1, 2, 3, 4, 5});

        //When
        Integer numberOfOccurences = davisList.getNumberOfOccurrences(1);

        //Then
        System.out.println(numberOfOccurences);

    }

    @Test
    public void remove() {
        //Given
        DavisList davisList = new DavisList(new Object[]{1, 2, 3, 4, 5});

        //When
        davisList.remove(2);
        Object[] answer = davisList.toArray();

        //Then
        for (Object object : answer) {
            System.out.println(object);
        }
    }

    @Test
    public void toArray() {
    }

    @Test
    public void removeAll() {
        DavisList davisList = new DavisList(new Object[]{1, 1, 2, 3, 4, 5});

        davisList.removeAll(1);
        Object[] answer = davisList.toArray();

        for (Object object : answer) {
            System.out.println(object);
        }
    }
}