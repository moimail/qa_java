import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class LionTest {

    @Test(expected = AssertionError.class)
    public void lionHasManeTest() throws Exception {

        Feline felineMock = mock(Feline.class);
        try {
            new Lion("Не определено", felineMock);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }

    }
    @Test
    public void getKittensTest() throws Exception {

        //Arange
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самец",felineMock);
        int expectedResult = 1;
        //Act
        int actualResult = lion.getKittens();
        //Assert
        assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getFoodTest() throws Exception{

        //Arrange
        Feline felineMock = mock(Feline.class);
        Lion lion = new Lion("Самец",felineMock);
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualResult = lion.getFood();
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
