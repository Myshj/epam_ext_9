package task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<String> process(
            List<String> strings,
            StringConverter converter
    ) {
        List<String> converted = new ArrayList<>();
        strings.forEach(s -> converted.add(
                converter.convert(s)
        ));
        return converted;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "aaa", "bbb", "ccc"
        );

        System.out.println("Converted: " + process(
                strings, String::toUpperCase
        ));
    }
}
