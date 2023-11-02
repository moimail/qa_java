import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class FelineTest {

    @Test
    public void getEatMeatTest() throws Exception{
    final Object Exception;

        //Arrange
        Feline feline = new Feline();
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualResult = feline.getFood("Хищник");
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getFamilyTest(){

        //Arrange
        Feline feline = new Feline();
        String expectedResult =  "Кошачьи";
        //Act
        String actualResult = feline.getFamily();
        //Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getKittensTest(){

        //Arrange
        Feline feline = new Feline();
        int expectedResult =  1;
        //Act
        int actualResult = feline.getKittens();
        //Assert
        assertEquals(expectedResult,actualResult);
    }



}
