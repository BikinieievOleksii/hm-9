package ua.goit.module9;

import java.util.Objects;

public class MyQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];
    private int size;

    // adds an element to the end
    public void add(T value) {
        increaseInSide();
        elements[size] = value;
        size++;
    }

    private void increaseInSide() {
        if (elements.length == size) {
            Object[] increase = new Object[elements.length * 2];
            System.arraycopy(elements, 0, increase, 0, size);
            elements = increase;
        }
    }

    // removes element at index
    public void remove(int index) {
        Objects.checkIndex(index, size);
        System.arraycopy(elements, index + 1, elements, index, size - index);
        size--;
    }

    // clears the collection
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    // returns the size of the collection
    public int size() {
        return size;
    }

    // returns the first element in the queue (FIFO)
    public T peek() {
        try {
            return (T) elements[size - 1];
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException("array is empty");
        }
    }

    // returns the first element in the queue and removes it from the collection
    public T poll() {
        T element = peek();
        elements[size - 1] = null;
        size--;
        return element;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();

        for (Object element : elements) {
            if (element == null) {
                break;
            }
            builder.append(element);
        }
        return builder.toString();
    }
}