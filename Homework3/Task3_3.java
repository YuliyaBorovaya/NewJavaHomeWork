package Homework3;
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        int len=sc.nextInt();
        sc.close();
        ArrayList<Integer> numbers = createArr(len);
        System.out.println(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);
        int average = findAverage(numbers);
        System.out.printf("Минимальное значение: %d\n", min);
        System.out.printf("Максимальное значение: %d\n", max);
        System.out.printf("Среднее значение: %d\n", average);
    }

    public static ArrayList<Integer> createArr(int sizeArr) {
        ArrayList<Integer> array=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < sizeArr; i++) {
            array.add(rnd.nextInt(0, 100));
        }        
        return array;
    }

    public static int findMin(ArrayList<Integer> array) {
        int minNumb = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)<minNumb){
                minNumb=array.get(i);
            }
        }

        return minNumb;
    }

    public static int findMax(ArrayList<Integer> array) {
        int maxNumb = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if(array.get(i)>maxNumb){
                maxNumb=array.get(i);
            }

        }

        return maxNumb;
    }

    public static int findAverage(ArrayList<Integer> array) {
        int average = 0;
        for (int integer : array) {
            average += integer;
        }

        average = average / array.size();
        int diff = Math.abs(array.get(0)-average);
        int number = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if(Math.abs(array.get(i)-average)<diff){
                diff=Math.abs(array.get(i)-average);
                number = array.get(i);
            }
        }
        return number;
    }
}

