import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionParamTest {


    private  String gender;
    private boolean hasMane;


    public LionParamTest(String sex, boolean hasMane) {
        this.gender = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void lionHasManeTest() throws Exception {

       Feline felineMock = mock(Feline.class);

        Lion lion = new Lion(gender,felineMock);
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Самец или Самка", hasMane, actualResult);
    }


}
