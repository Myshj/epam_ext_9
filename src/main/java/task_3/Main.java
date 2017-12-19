package task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    private static Integer[] filterAndProcess(
            Integer[] arr,
            Predicate<Integer> specification,
            UnaryOperator<Integer> operator
    ) {
        boolean[] foundElements = new boolean[arr.length];
        int countOfFound = 0;
        for (int i = 0; i < arr.length; i++) {
            foundElements[i] = specification.test(arr[i]);
            countOfFound = foundElements[i] ? countOfFound + 1 : countOfFound;
        }
        Integer[] ret = new Integer[countOfFound];
        int currentElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (foundElements[i]) {
                ret[currentElement] = operator.apply(arr[i]);
                currentElement++;
            }
        }
        return ret;
    }

    private static List<String> filter(List<String> strings, Predicate<String> predicate) {
        List<String> ret = new ArrayList<>();
        for (String s : strings) {
            if (predicate.test(s)) {
                ret.add(s);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000) - 500;
        }
        System.out.println("Array before processing: " + Arrays.toString(arr));
        Integer[] processed = filterAndProcess(
                arr,
                v -> v > 0,
                v -> (int) Math.sqrt(v)
        );
        System.out.println("Array after processing: " + Arrays.toString(processed));


        List<String> strings = Arrays.asList("gappa", "alpha", "beta", "gamma", "theta", "goto");
        System.out.println("List before filter: " + strings);
        List<String> filtered = filter(strings, s -> s.startsWith("g"));
        System.out.println("List after sort: " + filtered);
    }
}
