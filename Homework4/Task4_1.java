package Homework4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
import java.util.LinkedList;

public class Task4_1 {
    public static void main(String[] args){
        LinkedList<String> ll=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add("Элемент "+i);
        }
        System.out.println(ll);     
        System.out.println(flipList(ll));
    }
    public static LinkedList<String> flipList(LinkedList<String> someList) {
        LinkedList<String> ll=new LinkedList<>();
        for (int i = someList.size()-1; i > -1; i--) {
            ll.add(someList.get(i));
        }
      
        return ll;
    }
}
