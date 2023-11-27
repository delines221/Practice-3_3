import java.util.Objects;

public class MyLinkedList<T> {

    public class Node<T>{
        T element;
        Node<T> next;
        Node<T> previous;
        public Node (T element){
            this.element = element;
    }

    }
    private Node<T> head;
    private Node<T> current;
    private int size;

    public void add(T element){
        Node<T> newNode = new Node<T>(element);
        if(head == null)
            head = newNode;
        while (current != null){
            current = current.next ;
        }
        current.next = newNode;
        newNode.previous = current;
        size++;
    }

    public void add(int index, T element) {
        Node<T> newNode = new Node<T>(element);
        if(head == null){
            head = current = newNode;
        }else {
            Node find = this.head;
            for (int i = 0; i < index; i++) {
                find = find.next;
            }
            find.next = newNode;
            newNode.previous = find;
        }
        size++;
    }

    public void addFirst(T element){
        add(0, element);
    }
    public void addLast(T element){
        add(size - 1, element);
    }

    public T get(int index){
        Objects.checkIndex(index , size+1);
        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current=current.next;
        }
        return current.element;
    }

    public T getFirst(){
        if(head != null) {
            return get(0);
        }
        return null;
    }
    public  T getLast(){
        if(head != null){
            return get(size - 1);

        }
        return null;
    }
    public T remove(int index){
        Objects.checkIndex(index, size);
        T element;
        Node<T> findprev = this.head;
        if(index == 0) {
            element = head.element;
            head = head.next;
        }if(head == null) {
            head = current = null;
        }

        for (int i = 0; i < index - 1; i++) {
            findprev = findprev.next;
        }
        element = findprev.element;
        findprev.next = findprev.next.next;
        size--;
        return element;
    }
    public T removeFirst(){
        return remove(0);
    }
    public T removeLast(){
        return remove(size - 1);
    }

    public int getSize(){
        return size;
    }

}
