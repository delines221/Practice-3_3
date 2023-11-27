public class MyStack <T> {
    private MyLinkedList<T> list;

    public void push(T element){
        list.addLast(element);
    }
    public T pop(){
       return list.removeFirst();
    }
}
