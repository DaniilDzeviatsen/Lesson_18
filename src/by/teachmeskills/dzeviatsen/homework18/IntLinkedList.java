package by.teachmeskills.dzeviatsen.homework18;

public class IntLinkedList implements IntList {
    private IntLinkedNode headNode;
    private IntLinkedNode zeroNode;

    public IntLinkedList() {
        zeroNode = null;
    }


    @Override
    public int get(int index) {
        return getNode(index).getElement();
    }

    @Override
    public int set(int index, int element) {
        int returnedElement = get(index);
        headNode.setElement(element);
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

    public int lastIndexOf(int element) {
        headNode = zeroNode;
        int i = 0;
        int lastIndex = -1;
        while (headNode != null) {
            if (headNode.getElement() == element) {
                lastIndex = i;
            }
            headNode = headNode.getNextNode();
            i++;
        }

        return lastIndex;
    }


    @Override
    public String toString() {
        String list = "[";
        headNode = zeroNode;
        if (zeroNode == null) {
            return "[]";
        }
        while (headNode != null) {
            if (headNode.getNextNode() == null) {
                list = list + headNode;
            } else {
                list = list + headNode + ", ";

            }
            headNode = headNode.getNextNode();

        }
        list = list + "]";
        return list;
    }

    private IntLinkedNode getNode(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();
        headNode = zeroNode;
        int i = 0;
        while (i < index && headNode != null) {
            headNode = headNode.nextNode;
            i++;
        }
        if (headNode == null) throw new IndexOutOfBoundsException();
        return headNode;
    }

    public int remove(int index) {

        if (zeroNode == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            int removed = zeroNode.element;
            zeroNode = zeroNode.getNextNode();
            return removed;

        } else {
            IntLinkedNode preRemovedNode = getNode(index - 1);
            IntLinkedNode removedNode = preRemovedNode.nextNode;
            if (removedNode == null) {
                throw new IndexOutOfBoundsException();
            }
            preRemovedNode.nextNode = removedNode.nextNode;
            return removedNode.element;
        }
    }
}
