import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @DisplayName("빈 문자열 또는 Null을 입력할 경우 0을 반환한다")
    @Test
    void testEmpty() {
        assertThat(stringCalculator.calculate("")).isEqualTo(0);
        assertThat(stringCalculator.calculate(null)).isEqualTo(0);
    }

    @DisplayName("컴마 또는 콜론을 구분자로 문자열을 구분한다.")
    @Test
    void testParseString() {
        assertThat(stringCalculator.parseString("1,2,3"))
                .isEqualTo(Arrays.asList(1,2,3));

        assertThat(stringCalculator.parseString("1,2:3"))
                .isEqualTo(Arrays.asList(1,2,3));
    }

    @DisplayName("custom delimiter 를 이용해서 파싱한다")
    @Test
    void testCustomParseString() {
        assertThat(stringCalculator.parseString("//;\n1;2;3"))
                .isEqualTo(Arrays.asList(1,2,3));

        assertThat(stringCalculator.parseString("//<\n1<2<3"))
                .isEqualTo(Arrays.asList(1,2,3));
    }

    @DisplayName("음수가 들어가있다면 RuntimeException 발생")
    @Test
    void testRuntimeException() {
        assertThatThrownBy(()->stringCalculator.calculate("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }

    @DisplayName("리스트 요소의 총 합을 구한다")
    @Test
    void testSum(){
        assertThat(stringCalculator.sum(Arrays.asList(1, 2, 3))).isEqualTo(6);
    }

    @DisplayName("문자열의 총 합을 구한다")
    @Test
    void testCalculate(){
        assertThat(stringCalculator.calculate("1,2,3")).isEqualTo(6);
        assertThat(stringCalculator.calculate("//<\n1<2<3")).isEqualTo(6);
        assertThat(stringCalculator.calculate("1,2:3")).isEqualTo(6);
    }
}