public class LinkedStack<T> implements StackInterface<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> first;
    private int size;

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = first.data;
        first = first.next;
        size--;
        return data;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    @Override
    public void push(T elem) throws NullPointerException {
        if (elem == null) {
            throw new NullPointerException("Can't add null element to the stack!");
        }
        first = new Node<>(elem, first);
        size++;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
