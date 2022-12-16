// Реализовать алгоритм пирамидальной сортировки (HeapSort)
package Homework5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        sc.close();
        ArrayList<Integer> numbers = createArr(len);  
        System.out.println("Исходный массив: "+ numbers);
        ArrayDeque<Integer> result=makeSort(numbers);
        System.out.println("Отсортированный массив: "+ result);
    }   
    public static ArrayList<Integer> createArr(int sizeArr) {
        ArrayList<Integer> array=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < sizeArr; i++) {
            array.add(rnd.nextInt(0, 100));
        }        
        return array;
    }
    public static ArrayDeque<Integer> makeSort(ArrayList<Integer> arr) {
        ArrayDeque<Integer> sortedArr = new ArrayDeque<Integer>();
        while(arr.size()>0){
            int max=arr.get(0);
            int index=0;
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)>max){
                    max=arr.get(i);
                    index=i;
                }
            }
            sortedArr.addFirst(max);
            arr.remove(index);
        }
        return sortedArr;
    }
}

