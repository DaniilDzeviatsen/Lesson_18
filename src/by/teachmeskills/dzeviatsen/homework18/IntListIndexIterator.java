package by.teachmeskills.dzeviatsen.homework18;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (!this.hasNext()) throw new NoSuchElementException();
        Integer element = list.get(i);
        i++;
        return element;
    }
}
