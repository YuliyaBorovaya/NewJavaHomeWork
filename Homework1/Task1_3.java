package Homework1;
import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите математичексое действие: ");
        sc.nextLine();
        String action = sc.nextLine();
        sc.close();
        if (action.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (action.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (action.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (action.equals("/") && num2 != 0) {
            System.out.println(num1 / num2);
        }
        else{
            System.out.print("Это какой-то неправильный знак, введите верный");
        }
    }
}


