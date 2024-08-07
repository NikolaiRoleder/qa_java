import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void checkFelineFamily() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void checkGetKittensWithoutParam() throws Exception {
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void checkGetKittensWithParam() throws Exception {
        int expectedCount = 5;
        int actualCount = feline.getKittens(5);
        assertEquals(expectedCount, actualCount);
    }
}