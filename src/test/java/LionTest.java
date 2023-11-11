import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

@Mock
Feline feline;

@Before
public void setUpMocks(){
    MockitoAnnotations.openMocks(this);
}
    @Test(expected = AssertionError.class)
    public void lionHasManeTest() throws Exception {

        Feline feline = mock(Feline.class);

        try {
            new Lion("Не определено", feline);
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }

    }
    @Test
    public void getKittensTest() throws Exception {


        //Arange
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        //Act
        Mockito.when(feline.getKittens()).thenReturn(1);
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
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);
        List<String> actualResult = lion.getFood();
        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
