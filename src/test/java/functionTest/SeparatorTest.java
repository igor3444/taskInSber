package functionTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatorTest {

    @Test
    public void aMoreB () {
        assertEquals(2.5, Separator.getNumber(8, 3));
    }

    @Test
    public void aLessB () {
        assertEquals(4, Separator.getNumber(2, 8));
    }

    @Test
    public void aEqualB () {
        assertEquals(7, Separator.getNumber(7, 7));
    }

    @Test
    public void testArithmeticException() {
        try {
            Separator.getNumber(0, 6);
        } catch (ArithmeticException ae) {
            assertEquals("Ошибка при делении на ноль", ae.getMessage());
        }
    }
}
