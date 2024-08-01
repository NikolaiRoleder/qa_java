import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class LionParametrizedTest {

        private final String sex;
        private final boolean expected;

        public LionParametrizedTest(String sex, boolean expected) {
            this.sex = sex;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> getLionData() {
            return Arrays.asList(new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            });
        }

        @Test
        public void haveLionManeTest() throws Exception {
            Lion lion = new Lion(sex);
            assertEquals(expected, lion.doesHaveMane());
        }
    }