// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
package Homework6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task6_1 {
    public static void main(String[] args) throws Exception {
        Laptop laptop1=new Laptop(78786868, "Asus", 13, 120, 16);
        laptop1.color = "grey";
        laptop1.os = "Windows";
        laptop1.price = 60000;

        Laptop laptop2=new Laptop(123456, "Aser", 15, 256, 8);
        laptop2.color = "black";
        laptop2.os = "Windows";
        laptop2.price = 50000;

        Laptop laptop3=new Laptop(234567, "HP", 14, 165, 32);
        laptop3.color = "white";
        laptop3.os = "Linux";
        laptop3.price = 40000;

        Laptop laptop4=new Laptop(456788, "Dell", 14, 120, 16);
        laptop4.color = "black";
        laptop4.os = "Windows";
        laptop4.price = 45000;

        Set<Laptop> notebooks = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4));
        makeFilter(notebooks);
    }
    public static void makeFilter(Set<Laptop> set) {
        Map<Integer, String> userFilters = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Введите цифру, соответствующую критерию фильтра:\n1 - Фирма \n2 - Диагональ экрана\n3 - Объем жесткого диска\n4 - Цвет\n5 - Объем оперативной памяти\n6 - Операционная система\n7 - Цена\n0 - перейти к отфильтрованному списку ");
            int filter = sc.nextInt();
            if (filter == 0){
                break;
            }
            System.out.println("Введите минимальное значение для указанного критерия: ");
            sc.nextLine(); 
            String value = sc.nextLine();
            userFilters.put(filter, value);
        }
        sc.close();

        if(userFilters.size()==0){
            System.out.println("Критериев для фильтрации не задано.");
        }
        else {
            System.out.println("Введены критерии фильтрации:");
            System.out.println(userFilters);
            Set<Laptop> filterNotebooks = new HashSet<>();
            for (Laptop laptop : set) {
                if(isFiltAll(userFilters, laptop)){
                    filterNotebooks.add(laptop);
                }
            }
            if(filterNotebooks.size()==0){
                System.out.println("Ноутбуков с сочетанием указанных критериев не найдено.");
            }
            else {
                System.out.println("Найдено ноутбуков: "+filterNotebooks.size());
                System.out.println(filterNotebooks);
            }
        }


    }
    public static Boolean isFiltOne(Integer f, String v, Laptop laptop) {
        if(f == 1){
            if(laptop.getbrand().equals(v)){
                return true;
            }   
            return false;                                     
        }
        else if(f == 2){
            if(laptop.getdiagonal() >= Integer.parseInt(v)){
                return true;
            }
            return false;
        }
        else if(f == 3){
            if(laptop.gethdd() >= Integer.parseInt(v)){
                return true;
            }
            return false;
        }
        else if(f == 4){
            if(laptop.getcolor().equals(v)){
                return true;
            } 
            return false;                                       
        }
        else if(f == 5){
            if(laptop.getozu() >= Integer.parseInt(v)){
                return true;
            }
            return false;
        }
        else if(f == 6){
            if(laptop.getos().equals(v)){
                return true;
            } 
            return false;                                       
        }
        else if(f == 7){
            if(laptop.getprice() >= Integer.parseInt(v)){
                return true;
            }
            return false;
        }
        else {
            return false;
        }
    }
    public static Boolean isFiltAll(Map<Integer, String> userV, Laptop laptop) {
        for(Map.Entry<Integer, String> item : userV.entrySet()){
            if(! isFiltOne(item.getKey(), item.getValue(), laptop)){
                return false;
            }
        }
        return true;
    }
}
