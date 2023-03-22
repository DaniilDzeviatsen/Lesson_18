package by.teachmeskills.dzeviatsen.homework18;

public class IntLinkedNode {
    public int element;
    public IntLinkedNode nextNode;

    public IntLinkedNode(int element, IntLinkedNode nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public IntLinkedNode() {

    }

    public int getElement() {
        return this.element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    IntLinkedNode getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(IntLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return String.valueOf(element);
    }
}
