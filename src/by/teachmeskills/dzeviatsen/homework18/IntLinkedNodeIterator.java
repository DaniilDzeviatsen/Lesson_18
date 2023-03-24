package by.teachmeskills.dzeviatsen.homework18;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntLinkedNodeIterator implements Iterator<Integer> {
    private IntLinkedNode headNode;

    public IntLinkedNodeIterator(IntLinkedNode zeroNode) {
        this.headNode = zeroNode;
    }

    @Override
    public boolean hasNext() {
        return headNode != null;
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new NoSuchElementException();
        Integer returnedElement = headNode.element;
        headNode = headNode.getNextNode();
        return returnedElement;
    }
}
