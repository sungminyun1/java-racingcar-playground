public class StringCalculator {

    public int calculate(String input) {
        if(!validate(input)){
            return 0;
        }
        return 1;
    }

    private boolean validate(String input) {
        return input != null && !input.isEmpty();
    }
}
