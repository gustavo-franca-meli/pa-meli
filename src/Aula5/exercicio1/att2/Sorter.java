package Aula5.exercicio1.att2;

import java.util.Comparator;
import java.util.List;

public interface Sorter {
    <T> List<T> sort(List<T> t, Comparator<T> comparator);
}
