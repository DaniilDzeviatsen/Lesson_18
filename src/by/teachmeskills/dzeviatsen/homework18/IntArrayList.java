package by.teachmeskills.dzeviatsen.homework18;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] list;

    public IntArrayList() {
        this.list = new int[]{};
    }

    public IntArrayList(int[] list) {

        this.list = Arrays.copyOf(list, list.length);
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    @Override
    public int get(int index) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return list[index];
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public int set(int index, int element) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int a = list[index];
        list[index] = element;
        return a;
    }

    @Override
    public void add(int element) {
        int[] arr = new int[list.length + 1];
        System.arraycopy(list, 0, arr, 0, list.length);
        arr[list.length] = element;
        list = arr;
    }

    @Override
    public int remove(int index) {
        if (index > list.length - 1 || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int excluded = list[index];
        int[] newArr = new int[list.length - 1];
        System.arraycopy(list, 0, newArr, 0, index);

        System.arraycopy(list, index + 1, newArr, index, newArr.length - index);
        list = newArr;

        return excluded;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || startIndexInclusive > endIndexExclusive || endIndexExclusive > list.length) {
            throw new IllegalArgumentException("Indexes are out of bounds or incorrect");
        }
        int[] shortlist = new int[endIndexExclusive - startIndexInclusive];
        System.arraycopy(list, startIndexInclusive, shortlist, 0, endIndexExclusive - startIndexInclusive);

        return new IntArrayList(shortlist);
    }

    public IntList sublist(int startIndexInclusive) {
        return subList(startIndexInclusive, list.length);
    }

    @Override
    public int lastIndexOf(int element) {
        for (int i = list.length - 1; i > -1; i--) {
            if (list[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        int tempr;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    tempr = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tempr;
                }
            }

        }
    }

}

