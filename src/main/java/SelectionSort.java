public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Поочередно перемещаем границу неотсортированной части массива
        for (int i = 0; i < n - 1; i++) {
            // Находим минимальный элемент в неотсортированной части массива
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Обмениваем минимальный элемент с первым элементом неотсортированной части массива
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
