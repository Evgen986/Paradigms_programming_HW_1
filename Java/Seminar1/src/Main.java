import java.util.*;

/**
 * Дан список целых чисел numbers. Необходимо написать в императивном стиле процедуру для
 * сортировки числа в списке в порядке убывания. Можно использовать любой алгоритм сортировки
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 5, 7, 8, 9, 12, 3, 4, 5, 0, 1, 0, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 5, 7, 8, 9, 12, 3, 4, 5, 0, 1, 0, 2, 3));
        sortList(list);
        sortList2(list2);
        System.out.println("Лист отсортированный в императивном стиле: " + list);
        System.out.println("Лист отсортированный в декларативном стиле: " + list);

    }

    /**
     * Сортировка пузырьком в порядке убывания и императивном стиле
     *
     * @param listToSort лист для сортировки
     */
    public static void sortList(List<Integer> listToSort) {
        for (int i = listToSort.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (listToSort.get(j) < listToSort.get(j + 1)) {
                    int temp = listToSort.get(j);
                    listToSort.set(j, listToSort.get(j + 1));
                    listToSort.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * Метод сортировки листа в декларативном стиле
     *
     * @param listToSort лист для сортировки
     */
    public static void sortList2(List<Integer> listToSort) {
        listToSort.sort(Comparator.reverseOrder());
    }
}