package by.teachmeskills.dzeviatsen.homework18;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;
    private IntLinkedNode zeroNode;

    public IntLinkedList() {
        zeroNode = null;
    }

    @Override
    public int get(int index) {
        int listLength=size();
        if(index<0||index>=listLength){
            throw new IllegalArgumentException("Index is out of bounds");
        }
        int counter = 0;
        headNode = zeroNode;
        while (counter != index) {
            if (headNode.getNextNode() == null) {
                return headNode.getElement();
            }
            headNode = headNode.getNextNode();
            counter++;
        }
        return headNode.getElement();
    }

    @Override
    public int set(int index, int element) {
        int listLength = size();
        if (index >= listLength || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int returnedElement = get(index);
        headNode = zeroNode;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                returnedElement = headNode.getElement();
                headNode.setElement(element);
            }
            headNode = headNode.getNextNode();
        }
        return returnedElement;
    }

    @Override
    public int size() {
        int size = 0;
        headNode = zeroNode;
        while (headNode != null) {
            size = size + 1;
            headNode = headNode.getNextNode();
        }
        return size;
    }

    @Override
    public void add(int element) {
        IntLinkedNode node = new IntLinkedNode();
        node.setElement(element);
        headNode = zeroNode;
        if (zeroNode == null) {
            zeroNode = node;

        } else {
            while (headNode.getNextNode() != null) {
                headNode = headNode.getNextNode();
            }
            headNode.setNextNode(node);
        }
    }

    public int remove(int index) {
        int listLength=size();
        if (index<0||index>=listLength){
            throw new IllegalArgumentException("Index is out of bounds");
        }
        int removedNum=get(index);
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        headNode = zeroNode;
        for (int i = 0; i <= index; i++) {
            headNode.getNextNode();
            if (i == index) {
                removedNum = headNode.getNextNode().getElement();
                headNode.setNextNode(headNode.getNextNode().getNextNode());
                headNode = headNode.getNextNode();
                return removedNum;
            }
        }
        return removedNum;
    }

    public int lastIndexOf(int element) {
        int listLength = size();
        headNode = zeroNode;
        for (int i = 0; i < listLength; i++) {
            headNode.getNextNode();
            if (headNode.getElement() == element) {
                return i;
            }
            headNode = headNode.getNextNode();
        }
        return -1;
    }

    public String toString() {
        return String.valueOf(headNode);
    }

    public void printList() {
        headNode = zeroNode;
        while (headNode != null) {
            System.out.print(headNode.toString());
            headNode = headNode.getNextNode();
        }
        System.out.println();
    }
}
