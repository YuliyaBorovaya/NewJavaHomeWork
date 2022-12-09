package Homework1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int res = 0;
        int res_2 = 1;
        for(int i = 1; i <= num; i++) {
            res += i;
            res_2 *=i;
        }
        System.out.println("Треугольное число равно: " +res);
        System.out.println("Факториал числа равен: " +res_2);
        
    }
}
