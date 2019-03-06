package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        DavisList davisList = new DavisList(array);
        for (Object object : array) {
            if (davisList.getNumberOfOccurrences(object) >= maxNumberOfDuplications){
                davisList.removeAll(object);
            }
        }
        return (String[]) davisList.toArray();
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        DavisList davisList = new DavisList(array);
        for (int i = 0; i < array.length; i++) {
            if (davisList.getNumberOfOccurrences(array[i]) == exactNumberOfDuplications){
                davisList.removeAll(array[i]);
                i--;
            }
        }
        return (String[]) davisList.toArray();
    }
}
