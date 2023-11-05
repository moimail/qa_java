import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {


    @Test
    public void getSoundTest() {
        //Arange
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        //Act
        String actualResult = cat.getSound();
        //Assert
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void getFoodTest() throws Exception {
        //Arrange
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        //Act
        List<String> actualResult = cat.getFood();
        //Assert
        assertEquals(expectedResult,actualResult);

    }
}