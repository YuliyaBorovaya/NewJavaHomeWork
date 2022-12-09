package Homework4;
// Написать программу, определяющую правильность расстановки скобок в выражении
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Task4_3 {
    public static void main(String[] args) {
        String str="{a+]}{(d*3)}";
        System.out.println(checkCorrect(str));                 
    }
    public static Boolean checkCorrect(String str) {
        String[] mathExp=str.split("");
        String[] bracStart = {"(","[","{","<"};
        String[] bracEnd = {")","]","}",">"};
        ArrayList<String> symbStart = new ArrayList<>(Arrays.asList(bracStart)); 
        ArrayList<String> symbEnd = new ArrayList<>(Arrays.asList(bracEnd)); 
        ArrayDeque<String> brackets = new ArrayDeque<String>();
        for (String string : mathExp) {
            if(symbStart.indexOf(string) != -1){  
                brackets.addFirst(symbEnd.get(symbStart.indexOf(string))); 
            }
            else if (symbEnd.indexOf(string) != -1){
                String elem=brackets.pollFirst(); 
                if( !string.equals(elem)){
                    return false;
                }                
            }            
        }
        return brackets.isEmpty();   
        
    }
}
