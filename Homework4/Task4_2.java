package Homework4;
import java.util.LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task4_2 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            enqueue("number " + i, ll);            
        }
        System.out.println(ll);
        System.out.println(dequeue(ll));
        System.out.println(ll);
        System.out.println(first(ll));
        System.out.println(ll);
    }
    public static LinkedList<String> enqueue(String elem, LinkedList<String> list) {
        list.add(elem);
        return list;
    }
    public static String dequeue(LinkedList<String> list) { 
        return list.remove(0);
    }
    public static String first(LinkedList<String> list) { 
        return list.get(0);
    }
}

