package Aula5.exercicio1.att1;


import java.util.ArrayList;
import java.util.List;

public class SortUtil {

    public static <T> T[] sort(Precedente<T> arr [])  {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j].precedeA((T)arr[j+1])) {
                    var temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return (T[])arr;
    }

}
