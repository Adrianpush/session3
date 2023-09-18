package session16.live.lambda;

@FunctionalInterface
public interface StringProcessor {

    String process(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
