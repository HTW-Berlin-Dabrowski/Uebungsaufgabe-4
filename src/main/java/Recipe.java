import java.util.ArrayList;

public class Recipe {

    private String name;
    private String category;
    private int prepTime;
    private int rating;

    private String[] validCategories = {"omnivor", "vegetarisch", "vegan"};
    private ArrayList<String> ingredients;

    Recipe(String name, int prepTime, int rating) {
        this.name = name;
        this.prepTime = prepTime;
        this.rating = rating;
        this.ingredients = new ArrayList<>();
    }

    Recipe(String name, int prepTime) {
        this.name = name;
        this.prepTime = prepTime;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getPrepTime() {
        return this.prepTime;
    }

    public int getRating() {
        return this.rating;
    }

    public void setCategory(String category) {
        if (checkCategory(category)) {
            this.category = category;
        }
    }

    public void setPrepTime(int time) {
        if (checkPrepTime(time)) {
            this.prepTime = time;
        }
    }

    public void setRating(int rating) {
        if (checkRating(rating)) {
            this.rating = rating;
        }
    }

    public boolean checkCategory(String category) {
        for (String validCategory : this.validCategories) {
            if (validCategory.equals(category)) {
                return true;
            }
        }
        System.out.println("Eingabe ungültig");
        return false;
    }

    public boolean checkRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            return true;
        }
        System.out.println("Eingabe ungültig");
        return false;
    }

    public boolean checkPrepTime(int time) {
        if (time >= 1) {
            return true;
        } else {
            System.out.println("Eingabe ungültig");
            return false;
        }
    }

    public boolean addIngredient(String ingredient) {
        if (!ingredients.contains(ingredient)) {
            ingredients.add(ingredient);
            System.out.println("Zutat " + ingredient + " hinzugefügt.");
            return true;
        } else {
            System.out.println("Hinzufügen fehlgeschlagen: Zutat " + ingredient + " ist bereits vorhanden.");
            return false;
        }
    }

    public boolean removeIngredient(String ingredient) {
        if (ingredients.contains(ingredient)) {
            ingredients.remove(ingredient);
            System.out.println("Zutat " + ingredient + " entfernt.");
            return true;
        } else {
            System.out.println("Löschen fehlgeschlagen: Zutat " + ingredient + " ist nicht vorhanden.");
            return false;
        }
    }

}