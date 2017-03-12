package HomeWork1.Find_DistanceV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Богдан on 23.02.2017.
 */
public class Find_Distancev2 {
    public static void main(String[] args) {

        int[] numbers;
        System.out.println("Введіть ряд цілих чисел. Після введення натисніть ENTER");
        numbers = addingToArray();
        findDistance(numbers);
    }

    public static int[] addingToArray() {
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {
            try {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                numbers[i] = Integer.parseInt(s);
            } catch (IOException e) {
                System.out.println("Помилка вводу");
            } catch (NumberFormatException a) {
                System.out.println("Помилка вводу цілого числа. Будь ласка, введіть ціле число");
            }
        }
        return numbers;
    }

    public static void findDistance(int[] numbers){
        if ((numbers.length==1)) {System.out.print("Ви введи одне число");}
        else if(numbers.length == 0){System.out.println("Ви не ввели жодного числа");}
        else{
            int firstIndex = findIndexOfFirstMin(numbers);
            int secondIndex = findOtherIndexOfNextMin(numbers, firstIndex);
            System.out.println("Відстань між числами " + Math.abs(secondIndex-firstIndex));
        }
    }

    public static int findIndexOfFirstMin(int[] numbers){
        int firstIndex = 0, firstMin = numbers[0];
        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] < firstMin){
                firstMin = numbers[i];
                firstIndex = i;
            }
        }
        System.out.println("Перше мінімальне число " + firstMin + " знаходиться в позиції " + firstIndex);
        return firstIndex;
    }

    public static int findOtherIndexOfNextMin(int[] numbers, int firstIndex){
        int nextIndexOfMin = 0,  secondMin = numbers[0], firstMin = numbers[firstIndex];
        if (firstIndex == 0){
            nextIndexOfMin  = 1;
            secondMin = numbers[1];
        }
        for (int i = 0; i < numbers.length; i++ ){
            if((numbers[i] == firstMin) && (i==firstIndex)){
                continue;
            }
            else if ((numbers[i]==firstMin) && (firstIndex != i)){
                secondMin = firstMin;
                nextIndexOfMin  = i;
                break;
            }
            else if ((numbers[i] < secondMin) && (secondMin>firstMin)){
                secondMin = numbers[i];
                nextIndexOfMin  = i;
            }
        }
        System.out.println("Наступне мінімальне число " + secondMin + " знаходиться в позиції " + nextIndexOfMin);
        return nextIndexOfMin;
    }
}
