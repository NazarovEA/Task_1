import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    private Ingredient ingredient;
    private IngredientType expectedTypeSauce = IngredientType.SAUCE;
    private IngredientType expectedTypeFilling = IngredientType.FILLING;
    private String expectedNameSAUCE = "Соус Spicy-X";
    private String expectedNameFilling = "Мясо бессмертных моллюсков Protostomia";
    private float expectedPriceSAUCE = 90;
    private float expectedPriceFilling = 1337;

    @BeforeEach
    public void setUp() {
        ingredient = new Ingredient(expectedTypeSauce, expectedNameSAUCE, expectedPriceSAUCE);
    }
    @Test
    public void getCorrectNameSAUCE() {
        assertEquals(expectedNameSAUCE, ingredient.getName(), "Некорректное значение");
    }

    @Test
    void getCorrectPrice() {
        assertEquals(expectedPriceSAUCE, ingredient.getPrice(), "Не корректное значение");
    }

    @Test
    void getCorrectTypeSauce() {
        assertEquals(expectedTypeSauce, ingredient.getType(), "Соус");
    }

    @Test
    void getCorrectTypeFilling() {
        ingredient = new Ingredient(expectedTypeFilling, expectedNameFilling, expectedPriceFilling);
        assertEquals(expectedTypeFilling, ingredient.getType(), "Начинка");
        assertEquals(expectedNameFilling, ingredient.getName(), "Некорректное значение");
        assertEquals(expectedPriceFilling, ingredient.getPrice(), "Не корректное значение");
    }
}
