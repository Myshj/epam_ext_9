package task_2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Array before sort: " + Arrays.toString(arr));
        Arrays.sort(arr, (l, r) -> r.compareTo(l));
        System.out.println("Array after sort: " + Arrays.toString(arr));


        List<String> strings = Arrays.asList("alpha", "beta", "gamma");
        System.out.println("List before sort: " + strings.toString());
        strings.sort((l, r) -> r.compareToIgnoreCase(l));
        System.out.println("List after sort: " + strings.toString());
    }
}
