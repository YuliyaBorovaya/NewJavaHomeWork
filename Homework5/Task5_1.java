// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> telList = new HashMap<>();
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);
        while(true) {
            System.out.print("Введите номер и ФИО или q для выхода: ");
            String str = iScanner.nextLine();
            if(str.equals("q")){
                break;
            } else {
                String[] telPers = str.split(" ");
                telList.put(Integer.parseInt(telPers[0]), telPers[1]);
            }
        }
            
            
        for (var el : telList.entrySet()) {
            System.out.println(el.getKey()+" "+el.getValue());
        }
        System.out.println();
        for (var el : telList.entrySet()) {
            if(el.getValue().equals("Иванов"))
            System.out.println(el.getKey()+" "+el.getValue());
        }
        iScanner.close();
    }
}

