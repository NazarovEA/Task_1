import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import praktikum.Bun;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTest {
    private Bun bun;
    private String expectedName = "Булка вкусная";
    private float expectedPrice = 600;

    @BeforeEach
    public void setUp() {
        bun = new Bun(expectedName, expectedPrice);
    }
    @Test
    public void getCorrectName() {
        assertEquals(expectedName, bun.getName(), "Некорректное значение");
    }

    @Test
    void getCorrectPrice() {
        assertEquals(expectedPrice, bun.getPrice(), "Не корректное значение");
    }
}
