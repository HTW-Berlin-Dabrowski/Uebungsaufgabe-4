import java.util.Arrays;

public class RecipeBook {

    private Recipe[] recipes;
    private int count;
    private int capacity = 5;

    public RecipeBook() {
        recipes = new Recipe[capacity];
        count = 0;
    }

    public boolean addRecipe(Recipe recipe) {
        String recipeName = recipe.getName();

        // Testet, ob das Rezept schon im Buch ist
        if (containsRecipe(recipeName)) return false;

        // Erweitert Array, wenn es voll ist
        if (count >= capacity) {
            capacity += 1;
            recipes = Arrays.copyOf(recipes, capacity);
        }

        for (int i = 0; i < capacity; i++) {
            if (recipes[i] == null) {
                recipes[i] = recipe;
                count ++;
                return true;
            }
        }
        return false;
    }

    public boolean removeRecipe(Recipe recipe) {
        if (!containsRecipe(recipe.getName())) return false;

        for (int i = 0; i < capacity; i++) {
            if (recipes[0].getName().equals(recipe.getName())) {
                recipes[i] = null;
                count --;
                return true;
            }
        }
        return false;
    }

    private boolean containsRecipe(String recipeName) {
        for (Recipe r : recipes) {
            if (r.getName().equals(recipeName)) {
                return true;
            }
        }
        return false;
    }

}
