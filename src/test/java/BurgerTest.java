import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    private Burger burger;
@BeforeEach
public void setUp(){
    burger = new Burger();
}
    @Test
    public void getPriceIncorrect(){
        Mockito.when(bun.getPrice()).thenReturn(500f);
        Mockito.when(ingredient.getPrice()).thenReturn(600f);

        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        float expectedPrice = 1600f;
        float actualPrice = burger.getPrice();
        assertEquals(expectedPrice, actualPrice, "стоимсоть не верная!");
    }

    @Test
            public void removeIngredientTest() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.removeIngredient(1);
        int expectedCount = 2;
        int actualCount = burger.ingredients.size();
        assertEquals(expectedCount,actualCount, "Соус или начинка не удалились");
    }
}
