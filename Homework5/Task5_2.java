// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности
package Homework5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5_2 {
    public static void main(String[] args) {
        String[] persons = {"Иван Иванов", "Петр Петров", "Сидр Сидоров", "Сергей Сергеев", "Иван Петров", "Николай Сидоров", "Петр Иванов", "Иван Иванов", "Иван Иванов", "Иван Иванов", "Иван Петров", "Иван Петров", "Петр Петров", "Петр Петров", "Сидр Сидоров"};
        Map<String, Integer> persMap = new HashMap<>();
        for (int i = 0; i < persons.length; i++) {
            if(persMap.containsKey(persons[i])){
                persMap.replace(persons[i], persMap.get(persons[i])+1);
            } else {
                persMap.put(persons[i], 1);
            }
        }
        for (var el : persMap.entrySet()) {
            System.out.println(el.getKey()+" "+el.getValue());
        }
        System.out.println();

        for (int i = 0; i < persons.length; i++){
            if(persMap.get(persons[i])==1){
                persMap.remove(persons[i]);
            }
        }

        Map<String, Integer> sortedMap = persMap.entrySet().stream() 
        .sorted(Comparator.comparingInt(e -> -e.getValue())) 
        .collect(Collectors.toMap( 
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (a, b) -> { throw new AssertionError(); }, 
        LinkedHashMap::new)); 

        sortedMap.entrySet().forEach(System.out::println); 
    }
}

