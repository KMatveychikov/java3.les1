package Task1;

public class replace {
    public static <T> void  replace(T[]arr, int a, int b){
      T c = arr[a];
      arr[a] = arr[b];
      arr[b] = c;
    }
}
