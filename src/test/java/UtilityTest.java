import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {

    @DisplayName("랜덤한 수 생성")
    @Test
    void testRandom(){
        assertThat(Utility.generateRandomNumber(0,9)).isLessThanOrEqualTo(10);
    }
}