package task_5_1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.iterate(10, v -> v + 10)
                .limit(10)
                .map(v -> v / 2)
                .boxed()
                .collect(Collectors.toList()));
    }
}
