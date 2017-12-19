package task_4;

@FunctionalInterface
public interface StringConverter {
    String convert(String string);

    default boolean isValid(String string) {
        return string != null && string.length() > 0;
    }
}
