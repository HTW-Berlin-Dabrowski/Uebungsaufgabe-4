import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeBookTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private RecipeBook recipeBook;
    private Recipe pancake;
    private Recipe curry;

    @BeforeEach
    void setup() {
        recipeBook = new RecipeBook();
        pancake = new Recipe("Pfannkuchen", 10);
        curry = new Recipe("Curry", 20);
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testAddRecipe() {
        boolean returnsTrue = recipeBook.addRecipe(pancake);
        boolean returnsFalse = recipeBook.addRecipe(pancake);
        assertTrue(returnsTrue && !returnsFalse);
    }

    @Test
    void testAddRecipeOverCapacity() {
        recipeBook.addRecipe(pancake);
        recipeBook.addRecipe(curry);
        assertTrue(recipeBook.addRecipe(new Recipe("Salat", 10)));
        assertTrue(recipeBook.addRecipe(new Recipe("Suppe", 20)));
    }

    @Test
    void testRemoveRecipe() {
        recipeBook.addRecipe(pancake);
        boolean returnsTrue = recipeBook.removeRecipe(pancake);
        boolean returnsFalse = recipeBook.removeRecipe(pancake);
        assertTrue(returnsTrue && !returnsFalse);
    }

    @Test
    void testRecipeyByCatecory() {
        pancake.setCategory("vegetarisch");
        curry.setCategory("vegan");
        recipeBook.addRecipe(pancake);
        recipeBook.addRecipe(curry);
        Recipe[] veganRec = new Recipe[] {curry};
        Recipe[] vegetRec = new Recipe[] {pancake};
        assertArrayEquals(vegetRec, recipeBook.recipeyByCatecory("vegetarisch"));
        assertArrayEquals(veganRec, recipeBook.recipeyByCatecory("vegan"));
    }

    @Test
    void testPrintRecipes() {
        recipeBook.addRecipe(pancake);
        pancake.setCategory("vegetarisch");
        pancake.setRating(4);
        recipeBook.addRecipe(curry);
        recipeBook.printAllRecipes();
        assertEquals("Name: Pfannkuchen, Zubereitungszeit: 10, Kategorie: vegetarisch, Bewertung: 4" + System.lineSeparator() +
                "Name: Curry, Zubereitungszeit: 20" + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testPrintByCategory() {
        pancake.setCategory("vegetarisch");
        curry.setCategory("vegan");
        recipeBook.addRecipe(pancake);
        recipeBook.addRecipe(curry);
        recipeBook.printByCategory("vegan");
        assertEquals("Name: " + curry.getName() + ", Zubereitungszeit: " + curry.getPrepTime()+ ", Kategorie: vegan" + System.lineSeparator(), outContent.toString());
    }
}
