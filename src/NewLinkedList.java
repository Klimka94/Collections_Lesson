public class NewLinkedList<E>{
    private Node<E> head;

    public void addFirst(E e){
        Node<E> firstNode = new Node<>(e);
        firstNode.next = head;
        head = firstNode;
    }

    public void addLast(E e){
        if (head == null){
            head = new Node<>(e);
            return;
        }
        Node<E> currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode = new Node<>(e);
    }

    public int get(E e){
        if (head == null) {
            return -1;
        }
        if (head.value == e){
            return 0;
        }
        Node<E> currentNode = head;
        int result = 0;
        while (currentNode.next != null){
            result++;
            if (currentNode.next.value == e){
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }


    public void remove(E e) {
        if (head == null){
            return;
        }
        if (head.value == e) {
            head = head.next;
            return;
        }
        Node<E> currentNode = head;
        while (currentNode.next != null){
            if (currentNode.next.value == e) {
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "NewLinkedList{" +
                "head=" + head +
                '}';
    }

    private static class Node<E>{
        private final E value;
        private Node<E> next;

        private Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
