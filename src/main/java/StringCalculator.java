import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    private List<Integer> parseStringDefaultDelimiter(String input) {
        return stringArrayToIntegerList(input.split(",|:"));
    }

    public List<Integer> parseString(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if(!m.find()){
            return parseStringDefaultDelimiter(input);
        }
        String customDelimiter = m.group(1);
        String[] tokens= m.group(2).split(customDelimiter);
        return stringArrayToIntegerList(tokens);
    }

    private List<Integer> stringArrayToIntegerList(String[] input) {
        return Arrays.stream(input)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
