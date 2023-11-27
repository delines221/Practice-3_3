import javax.lang.model.element.Element;

public class  MyQueue<T> {
    private MyLinkedList<T> list;

    public void offer(T element){
        list.addLast(element);
    }
    public T peek(){
        return list.get(0);
    }
    public T pool() {
        T element;
        element = list.getFirst();
        list.removeLast();
        return element;
    }
}
