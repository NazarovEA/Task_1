import org.junit.jupiter.api.Test;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTypeTest {
    @Test
    public void quantityType() {
    assertEquals(2, IngredientType.values().length);
    }
    @Test
    public void presentTypeSauce() {
        assertEquals("SAUCE", IngredientType.SAUCE.name(), "Соусы должны быть в типах");
    }
    @Test
    public void presentTypeFilling() {
        assertEquals("FILLING", IngredientType.FILLING.name(), "Начинки должны быть в типах");
    }
}
