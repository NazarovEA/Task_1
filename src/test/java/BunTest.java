import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import praktikum.Bun;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTest {
    private Bun bun;
    private static final String EXPECTED_NAME = "Булка вкусная";
    private static final float EXPECTED_PRICE = 600;


    @BeforeEach
    public void setUp() {
        bun = new Bun(EXPECTED_NAME, EXPECTED_PRICE);
    }
    @Test
    public void getCorrectName() {
        assertEquals(EXPECTED_NAME, bun.getName(), "Некорректное значение");
    }

    @Test
    void getCorrectPrice() {
        assertEquals(EXPECTED_PRICE, bun.getPrice(), "Не корректное значение");
    }
}
