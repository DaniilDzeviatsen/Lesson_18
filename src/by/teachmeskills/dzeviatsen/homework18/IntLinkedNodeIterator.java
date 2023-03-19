package by.teachmeskills.dzeviatsen.homework18;

import java.util.Iterator;

public class IntLinkedNodeIterator implements Iterator <Integer> {
    private IntLinkedNode headNode;

    public IntLinkedNodeIterator(IntLinkedNode zeroNode) {
        this.headNode = zeroNode;
    }

    @Override
    public boolean hasNext() {
        return headNode!=null;
    }

    @Override
    public Integer next() {
        if (hasNext()){
            Integer returnedElement=headNode.getElement();
            headNode=headNode.getNextNode();
            return returnedElement;
        }
        return null;
    }
}
