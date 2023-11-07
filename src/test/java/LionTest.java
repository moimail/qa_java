import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Feline feline;





    @Test(expected = AssertionError.class)
    public void lionHasManeTest() throws Exception {


        try {
            new Lion("Не определено", feline);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }

    }
    @Test
    public void getKittensTest() throws Exception {

        //Arange
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        //Act
        int actualResult = lion.getKittens();
        //Assert
        Assert.assertEquals(expectedResult, actualResult);



    }

    @Test
    public void getFoodTest() throws Exception{

        //Arrange

        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualResult = lion.getFood();
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
