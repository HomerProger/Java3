package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"23", "test", "26"};
        System.out.println(Arrays.toString(changeElements(array, 0, 1)));
        System.out.println(getArrayListFromArray(array));
    }

   // Задание 1
    public static <T> T[] changeElements(T[] arr, int i, int j) {

        try {
            T t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

        }
        return arr;
    }
    //Задание 2

    public static <T> ArrayList<T> getArrayListFromArray(T[]arr){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
    return arrayList;
    }

}
