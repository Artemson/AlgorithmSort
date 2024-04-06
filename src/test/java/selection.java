import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class selection {
    @Test
    public void testSelectionSortCase1() {
        // Тестовый массив
        int[] arr = {64, 25, 12, 22, 11};

        // Ожидаемый результат после сортировки
        int[] sortedArr = {11, 12, 22, 25, 64};

        // Вызов алгоритма сортировки
        SelectionSort.selectionSort(arr);

        // Проверка, что массив отсортирован верно
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSelectionSortCase2() {
        // Тестовый массив
        int[] arr = {5, 4, 3, 2, 1};

        // Ожидаемый результат после сортировки
        int[] sortedArr = {1, 2, 3, 4, 5};

        // Вызов алгоритма сортировки
        SelectionSort.selectionSort(arr);

        // Проверка, что массив отсортирован верно
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSelectionSortCase3() {
        // Тестовый массив
        int[] arr = {1, 2, 3, 4, 5};

        // Ожидаемый результат после сортировки
        int[] sortedArr = {1, 2, 3, 4, 5};

        // Вызов алгоритма сортировки
        SelectionSort.selectionSort(arr);

        // Проверка, что массив отсортирован верно
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSelectionSortCase4() {
        // Тестовый массив
        int[] arr = {1};

        // Ожидаемый результат после сортировки
        int[] sortedArr = {1};

        // Вызов алгоритма сортировки
        SelectionSort.selectionSort(arr);

        // Проверка, что массив отсортирован верно
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testSelectionSortCase5() {
        // Тестовый массив
        int[] arr = {};

        // Ожидаемый результат после сортировки
        int[] sortedArr = {};

        // Вызов алгоритма сортировки
        SelectionSort.selectionSort(arr);

        // Проверка, что массив отсортирован верно
        assertArrayEquals(sortedArr, arr);
    }
}


