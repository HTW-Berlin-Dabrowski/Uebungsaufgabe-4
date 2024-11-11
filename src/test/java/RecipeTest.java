import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    Recipe pankace;
    Recipe curry;
     @BeforeEach
     void setup() {
         pankace = new Recipe("Apfelpfannkuchen", 20, 4);
         curry = new Recipe("Gemüsecurry", 30);
         System.setOut(new PrintStream(outContent));
     }

     @AfterEach
     void restoreStreams() {
         System.setOut(originalOut);
     }

    @Test
    void constructorTest() {
        boolean correctName = this.pankace.getName().equals("Apfelpfannkuchen");
        boolean correctPrepTime = pankace.getPrepTime() == 20;
        boolean correctRating = pankace.getRating() == 4;
        assertTrue(correctName && correctRating && correctPrepTime);
    }

    @Test
    void secondConstructorTest() {

        boolean correctName = curry.getName().equals("Gemüsecurry");
        boolean correctPrepTime = curry.getPrepTime() == 30;
        assertTrue(correctName && correctPrepTime);
    }

    @Test
    void setPrepTimeTest() {
        curry.setPrepTime(30);
        assertEquals(30, curry.getPrepTime());
        pankace.setPrepTime(-1);
        assertEquals("Eingabe ungültig"+System.lineSeparator(), outContent.toString());
        assertEquals(20, pankace.getPrepTime());
    }

    @Test
    void setRatingTest() {
         pankace.setRating(5);
         assertEquals(5, pankace.getRating());
         curry.setRating(10);
         assertEquals("Eingabe ungültig"+System.lineSeparator(), outContent.toString());
         assertEquals(0, curry.getRating());
    }

    @Test
    void setCategoryTest() {
         curry.setCategory("omnivor");
         assertEquals("omnivor", curry.getCategory());
         pankace.setCategory("sweet");
         assertEquals("Eingabe ungültig"+System.lineSeparator(), outContent.toString());
         assertNull(pankace.getCategory());
    }
}
