package by.teachmeskills.dzeviatsen.homework18;

import java.util.Iterator;

public class IntListIndexIterator implements Iterator<Integer> {
    private IntList list;
    private int i;

    public IntListIndexIterator(IntList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public Integer next() {
        Integer element=list.get(i);
        i++;
        return element;
    }
}
