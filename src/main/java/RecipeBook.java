import java.util.Arrays;

public class RecipeBook {

    private Recipe[] recipes;
    private int count;
    private int capacity = 2;

    public RecipeBook() {
        recipes = new Recipe[capacity];
        count = 0;
    }

    public Recipe[] getRecipes() {
        return this.recipes;
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
            if (r != null && r.getName().equals(recipeName)) {
                return true;
            }
        }
        return false;
    }

    public Recipe[] recipeyByCatecory(String category) {
        Recipe[] categoryRecipes = new Recipe[countRecipes(category)];
        int count = 0;

        for (int i = 0; i < recipes.length; i++) {
            if (recipes[i].getCategory() != null && recipes[i].getCategory().equals(category)) {
                categoryRecipes[count] = recipes[i];
            }
        }
        return categoryRecipes;
    }

    private int countRecipes(String category) {
        int count = 0;
        for (int i = 0; i < recipes.length; i++) {
            if (recipes[i] != null && recipes[i].getCategory().equals(category)) {
                count ++;
            }
        }
        return count;
    }

    private void printRecipes(Recipe[] recipesToPrint) {
        String result = "";
        for (Recipe rec : recipesToPrint) {
            result += "Name: " + rec.getName() + ", Zubereitungszeit: " + rec.getPrepTime();
            if (rec.getCategory() != null) result += ", Kategorie: " +  rec.getCategory();
            if (rec.getRating() != 0) result += ", Bewertung: " +  rec.getRating();
            result += "\n";
        }
        System.out.print(result);
    }

    public void printByCategory(String category) {
        Recipe[] recipesToPrint = recipeyByCatecory(category);
        printRecipes(recipesToPrint);
    }

    public void printAllRecipes() {
        printRecipes(this.recipes);
    }


}
