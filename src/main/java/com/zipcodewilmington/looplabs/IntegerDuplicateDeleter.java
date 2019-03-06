package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        DavisList davisList = new DavisList(array);
        for (Object object : array) {
            if (davisList.getNumberOfOccurrences(object) >= maxNumberOfDuplications){
                davisList.removeAll(object);
            }
        }
        return (Integer[]) davisList.toArray();
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        DavisList davisList = new DavisList(array);
        for (Object object : array) {
            if (davisList.getNumberOfOccurrences(object).equals(exactNumberOfDuplications)){
                davisList.removeAll(object);
            }
        }
        return (Integer[]) davisList.toArray();
    }
}
