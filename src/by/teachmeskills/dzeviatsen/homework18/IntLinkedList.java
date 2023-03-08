package by.teachmeskills.dzeviatsen.homework18;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;

    public IntLinkedList() {
        headNode = null;
    }

    @Override
    public int get(int index) {
        int counter = 0;
        while (counter != index) {
            if (headNode.getNextNode() == null) {
                throw new IllegalArgumentException("Index out of bounds");
            }
            headNode = headNode.getNextNode();
            counter++;
        }
        return headNode.getElement();
    }

    @Override
    public int set(int index, int element) {
        if (index > size() || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int returnedElement = 0;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                returnedElement = headNode.getElement();
                headNode.setElement(element);
            }
            headNode=headNode.getNextNode();
        }
        return returnedElement;
    }

    @Override
    public int size() {
        int size = 0;
        while (headNode.getNextNode() != null) {
            size = size + 1;
            headNode=headNode.getNextNode();
        }
        return size;
    }

    @Override
    public void add(int element) {
        IntLinkedNode node = new IntLinkedNode();
        node.setElement(element);
        if (headNode == null) {
            headNode = node;
        } else {
            while (headNode.getNextNode() != null) {
                headNode = headNode.getNextNode();
            }
            headNode.getNextNode().setNextNode(node);
        }
    }

    public int remove(int index) {
        int removedNum = 0;
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        for (int i = 0; i <= index; i++) {
            headNode.getNextNode();
            if (i + 1 == index) {
                removedNum = headNode.getElement();
                headNode.setNextNode(headNode.getNextNode().getNextNode());
                headNode = headNode.getNextNode();
                return removedNum;
            }
        }
        return removedNum;
    }

    public int lastIndexOf(int element) {
        int lastIndex = 0;
        for (int i = 0; i < size(); i++) {
            headNode.getNextNode();
            if (headNode.getElement() == element) {
                lastIndex = i;
            }
            headNode = headNode.getNextNode();
        }
        return lastIndex;
    }
}
