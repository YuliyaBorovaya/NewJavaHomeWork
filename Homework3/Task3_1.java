package Homework3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args){
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in);
        Integer len=sc.nextInt();
        sc.close();
        ArrayList<Integer> numbers = createArr(len);  
        System.out.println("Исходный массив: "+ numbers);
        ArrayList<ArrayList<Integer>> result=makeSort(separationArray(numbers));
        System.out.println("Массив после сортировки: "+result.get(0));

    }

    public static ArrayList<Integer> createArr(int sizeArr) {
        ArrayList<Integer> array=new ArrayList<>();
        Random rnd=new Random();
        for (int i = 0; i < sizeArr; i++) {
            array.add(rnd.nextInt(0, 100));
        }        
        return array;
    }
    public static ArrayList<ArrayList<Integer>> separationArray(ArrayList<Integer> arr) {        
        ArrayList<ArrayList<Integer>> sepArray=new ArrayList<ArrayList<Integer>>();
        for (int number : arr) {
            ArrayList<Integer> oneNum=new ArrayList<>();
            oneNum.add(number);
            sepArray.add(oneNum);
        }        
        return sepArray;       
    }
    public static ArrayList<ArrayList<Integer>> comparisonArr(ArrayList<ArrayList<Integer>> arrArr) {
        ArrayList<ArrayList<Integer>> compArr=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < arrArr.size()-1; i+=2) {
            ArrayList<Integer> array1=new ArrayList<>(arrArr.get(i));
            ArrayList<Integer> array2=new ArrayList<>(arrArr.get(i+1));
            ArrayList<Integer> buff=new ArrayList<>();  
            while(array1.size()!=0 && array2.size()!=0){
                if(array1.get(0)<array2.get(0)){                
                buff.add(array1.get(0));
                array1.remove(0);                
                } 
                else if(array1.get(0)>array2.get(0)){                    
                    buff.add(array2.get(0));
                    array2.remove(0);                
                } else {
                    buff.add(array1.get(0));
                    buff.add(array1.get(0));
                    array1.remove(0);
                    array2.remove(0);
                }
            }
            if(array1.size()==0){
                for (int j = 0; j < array2.size(); j++) {
                    buff.add(array2.get(j));
                }
            } else if(array2.size()==0){
                for (int j = 0; j < array1.size(); j++) {
                    buff.add(array1.get(j));
                }
            }
            compArr.add(buff);
        }
        if (arrArr.size()%2 != 0){
            compArr.add(arrArr.get(arrArr.size()-1));            
        }        
        return compArr;
    }
    public static ArrayList<ArrayList<Integer>> makeSort(ArrayList<ArrayList<Integer>> arr) {
        if (arr.size()==1){
            return arr;
        }else{
            return makeSort(comparisonArr(arr));
        }
    }
}

