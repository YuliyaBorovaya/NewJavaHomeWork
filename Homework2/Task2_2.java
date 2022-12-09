package Homework2;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task2_2 {
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
        int res = 0;
        if (action.equals("+")) {
            res = num1 + num2;
        }
        else if (action.equals("-")) {
            res = num1 - num2;
        }
        else if (action.equals("*")) {
            res = num1 * num2;
        }
        else if (action.equals("/") && num2 != 0) {
            res = num1 / num2;
        }
        else{
            System.out.print("Это какой-то неправильный знак, введите верный");
        }
        System.out.println(num1+action+num2+"="+res);
        logging(num1, action, num2, res);
    }
    public static void logging(int a, String act, int b, int res) {
        String fileName = "loggingCalc.txt";
        try {
            FileWriter wr=new FileWriter(fileName, true);  
            if (b==0 && act.equals("/")){
                wr.write(LocalDateTime.now()+": Ошибка, на ноль делить нельзя!");
            }    
            else {
                wr.write(LocalDateTime.now()+": "+a+act+b+"="+res);
            }                  
            wr.append("\n");
            wr.flush();
            wr.close();
            }
        catch(Exception ex){
            System.out.println(ex);
        }        
    }
}

