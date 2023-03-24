package by.teachmeskills.dzeviatsen.homework18;

public interface IntList extends Iterable<Integer> {
    Integer get(int index);
    int set(int index, int element);
    int size();
    void add(int element);
    int remove(int index);
    int lastIndexOf(int element);
}
