import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline mockfeline;

    //тест без мока
    @Test
    public void checkSexLionException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Оливка");
        });
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    //тест без мока
    @Test
    public void checkKittenCount() {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        int expectedCount = 1;
        int actualCount = lion.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    //тест с моком
    @Test
    public void checkLionFood() throws Exception {
    Lion lion = new Lion(mockfeline);
    List<String> expectedFood = Arrays.asList("Животные","Птицы","Рыба");
    Mockito.when(mockfeline.getFood("Хищник")).thenReturn(expectedFood);
    List<String> actualFood = lion.getFood();
    assertEquals(expectedFood, actualFood);
    }

}