package fr.lernejo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "ADD, 42, 35, 77",
        "ADD, -12, 6, -6",
        "MULT, 6, 3, 18",
        "MULT, -5, 6, -30",
    })
    void mult_behave_as_expected(Sample.Operation test_nature, int a, int b, int expectedResult) {
        // When
        int result = new Sample().op(test_nature, a, b);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }
}
