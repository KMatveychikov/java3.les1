package Task2;

import java.util.ArrayList;
import java.util.List;

public class arrayToList {
    public static <T> List<T> arrayToList(T[] arr){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           list.add(arr[i]);
        } return list;

    }
}
