import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mockfeline;

    //тест без мока
    @Test
    public void checkCatSound() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    //тест с моком
    @Test
    public void checkCatFood() throws Exception {
        Cat cat = new Cat(mockfeline);
        List<String> expectedFood = Arrays.asList("Животные","Птицы","Рыба");
        Mockito.when(mockfeline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }
}