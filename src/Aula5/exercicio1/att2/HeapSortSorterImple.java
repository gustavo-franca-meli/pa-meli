package Aula5.exercicio1.att2;


import java.util.Comparator;
import java.util.List;

public class HeapSortSorterImple implements Sorter {
    @Override
    public <T> List<T> sort(List<T> t, Comparator<T> comparator) {
        return List.of(new HeapSort<T>().sort((T[]) t.toArray(), comparator));
    }
}
