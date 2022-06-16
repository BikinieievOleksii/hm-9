package ua.goit.module9;

import java.util.Objects;

public class MyLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    // adds an element to the end
    public void add(Object value) {
        Node node = new Node(value);
        if (size == 0) {
            first = last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    // removes element at index
    public void remove(int index) {
        Node<T> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.next == null) {
            current.prev.next = null;
        } else if (current.prev == null) {
            current.next.prev = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // clears the collection
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    // returns the size of the collection
    public int size() {
        return size;
    }

    // returns the element at index
    public Object get(int index) {
        Objects.checkIndex(index, size);
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private class Node<T> {
        T element;
        Node<T> prev;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        } else {
            StringBuilder builder = new StringBuilder().append("[").append(first.element).append("]");
            Node<T> current = first;
            for (int i = 0; i < size; i++) {
                if (current.next != null) {
                    current = current.next;
                    builder.append("[").append(current.element).append("]");
                }
            }
            return builder.toString();
        }
    }
}
