import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @DisplayName("빈 문자열 또는 Null을 입력할 경우 0을 반환한다")
    @Test
    void testEmpty() {
        assertThat(stringCalculator.calculate("")).isEqualTo(0);
        assertThat(stringCalculator.calculate(null)).isEqualTo(0);
    }

}