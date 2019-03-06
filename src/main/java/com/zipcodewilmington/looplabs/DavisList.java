package com.zipcodewilmington.looplabs;

import java.util.Arrays;

public class DavisList {

    Object[] objectArray;

    public DavisList(Object[] objectArray){
        this.objectArray = objectArray;
    }

    public Integer getNumberOfOccurrences(Object input) {
        Integer counter = 0;
        for (Object object : objectArray) {
            if (object.equals(input)){
                counter++;
            }
        }
        return counter;
    }

    public void remove(int input){
        Object valToRemove = objectArray[(Integer) input];
        for (int i = input + 1; i < objectArray.length; i++) {
            objectArray[i-1] = objectArray[i];
        }
        objectArray[objectArray.length - 1] = valToRemove;
        objectArray = Arrays.copyOf(objectArray, objectArray.length - 1);
    }

    public Object[] toArray(){
        return objectArray;
    }

    public void removeAll(Object input){
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(input)){
                remove(i);
                i--;
            }
        }
    }
}
