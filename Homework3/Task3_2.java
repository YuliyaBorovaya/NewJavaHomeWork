package Homework3;

//  удалиить из произвольного списка четные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        Integer len=sc.nextInt();
        sc.close();
        ArrayList<Integer> numbers = createArr(len);
        System.out.println(numbers);
        numbers = delEvenNumb(numbers);        
        System.out.println(numbers);
    }
    public static ArrayList<Integer> createArr(int sizeArr) {
        ArrayList<Integer> array=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < sizeArr; i++) {
            array.add(rnd.nextInt(0, 100));
        }        
        return array;
    }
    public static ArrayList<Integer> delEvenNumb (ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%2 == 0){
                numbers.remove(i);
                i--;
            }            
        }
        return numbers;
    }
}

