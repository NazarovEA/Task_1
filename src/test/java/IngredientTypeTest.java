import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IngredientTypeTest {
    @Test
    public void quantityType() {
    assertEquals(2, IngredientType.values().length);
    }

        @ParameterizedTest
    @EnumSource(IngredientType.class)
    @DisplayName("Проверка название типов")
    public void ingredientTypeName(IngredientType type) {
        String name = type.name();
        assertTrue("SAUCE".equals(name) || "FILLING".equals(name),
                "Тип " + name + " нет в списке");
    }

}
