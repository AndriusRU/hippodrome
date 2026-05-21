import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;



class HorseTest {

    @Test
    @DisplayName("When the first param in constructor is null => throw EA")
    void whenTheFirstParamInConstructorIsNullThrowEa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse(null, 3);
        });
    }

    @Test
    @DisplayName("When the first param in constructor is Null => get Message")
    void whenTheFirstParamInConstructorIsNullGetMessage() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new Horse(null, 3);
        });
        String correctResult = "Name cannot be null.";
        String actualMessage = illegalArgumentException.getMessage();
        assertEquals(correctResult, actualMessage);
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(
            strings = {" ", "  ", "\t", "\n", "\r", "\r\n", "\n\r",  " \t ", " \n "}
    )
    @DisplayName("When the first param is Blank or Empty => throw EA")
    void whenTheFirstParamIsBlankOrEmptyThrowEa(String name) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse(name, 3);
        });
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(
            strings = {" ", "  ", "\t", "\n", "\r", "\r\n", "\n\r",  " \t ", " \n "}
    )
    @DisplayName("When the first param is Blank or Empty => get Message")
    void whenTheFirstParamIsBlankOrEmptyGetMessage(String name) {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new Horse(name, 3);
        });
        String correctResult = "Name cannot be blank.";
        String actualMessage = illegalArgumentException.getMessage();
        assertEquals(correctResult, actualMessage);
    }

    @Test
    @DisplayName("When the second param in constructor is negative => throw EA")
    void whenTheSecondParamInConstructorIsNegativeThrowEa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Plotva", -3);
        });
    }

    @Test
    @DisplayName("When the second param in constructor is negative => get Message")
    void whenTheSecondParamInConstructorIsNegativeGetMessage() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Plotva", -3);
        });
        String correctMessage = "Speed cannot be negative.";
        String actualMessage = illegalArgumentException.getMessage();
        assertEquals(correctMessage, actualMessage);
    }

    @Test
    @DisplayName("When the third param in constructor is negative => throw EA")
    void whenTheThirdParamInConstructorIsNegativeThrowEa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Plotva", 3, -3);
        });
    }

    @Test
    @DisplayName("When the third param in constructor is negative => get Message")
    void whenTheThirdParamInConstructorIsNegativeGetMessage() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            new Horse("Plotva", 3, -3);
        });
        String correctMessage = "Distance cannot be negative.";
        String actualMessage = illegalArgumentException.getMessage();
        assertEquals(correctMessage, actualMessage);
    }

}