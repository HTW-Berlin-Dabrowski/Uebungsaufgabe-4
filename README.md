Hinweis: Bitte alle Methoden public machen, damit die Tests funktionieren.

# Aufgabe 1
Schreiben Sie eine Klasse Recipe, in der Name, Zubereitungszeit, Kategorie (omnivor, vegetarisch, vegan), und Bewertung (1-5 Sterne) gespeichert sind.
Die Klasse hat einen Konstruktor, der alle Variablen setzt. Den Konstruktor würde man beispielsweise so aufrufen:
```java
Recipe pancakes = new Recipe("Apfelpfannkuchen", 20, "vegetarisch", 4);
```
Schreiben Sie für jedes Feld einen getter. 
Beispiel: Für das Feld name ist die Signatur: `public String getName()`. 

Hinweis: Falls die Getter fehlschlagen, schauen Sie sich in den Tests an, wie sie heißen müssen. 

# Aufgabe 2
Die Bewertungen müssen nicht direkt gesetzt werden. Schreiben Sie einen zweiten Konstruktor, der das Feld noch nicht setzt.
Ein möglicher Aufruf dieses Konstruktors wäre:
```java
Recipe pancakes = new Recipe("Apfelpfannkuchen", 20, "vegetarisch");
```
# Aufgabe 3
Schreiben Sie jeweils einen Setter für Zubereitungszeit, Kategorie und Bewertung. 
Wichtig dabei ist: Zubereitungszeit darf nicht unter 1 sein, die Kategorie darf nur "omnivor, vegetarisch oder vegan" sein und die Bewertung darf zwischen 1 und 5 (Sternen) sein. 

Schreiben Sie zwei Methoden, die dafür sorgen, dass nur gültige Kategorien, Zubereitungszeiten und Bewertungen gesetzt werden. Die Methoden geben ein boolean zurück (true, wenn es geklappt hat, false wenn nicht).
Nennen Sie die Methoden `checkCategory(String category)`, `checkPrepTime(int time)` und `checkRating(int rating)`.

Falls eine ungültige Kategorie / Zubereitungszeit / Bewertung gesetzt wird, wird auf der Konsole ausgegeben "Eingabe ungültig" und das Feld wird nicht gesetzt.

# Aufgabe 4
Fügen Sie zur Klasse ein Array für die Zutaten hinzu (die Länge des Arrays sollte 5 sein). Schreiben Sie eine Methode, mit der man Zutaten zur Liste hinzufügen kann: `public boolean addIngredient(String ingredient)` und eine Methode, mit der man Zutaten aus dem Array entfernen kann: `public boolean removeIngredient(String ingredient)`. 

Prüfen Sie beim Hinzufügen, ob noch ein Platz im Array frei ist und, dass die Zutat noch nicht im Array ist und beim Entfernen, dass Sie eine vorhandene Zutat löschen. Sollte das nicht der Fall sein, geben Sie auf der Konsole die Meldung "Hinzufügen fehlgeschlagen", bzw "Löschen fehlgeschlagen" aus und fügen Sie die Zutat nicht hinzu.

# Aufgabe 5
Erstellen Sie eine zweite Klasse `RecipeBook`, in der Sie ein Array mit Rezepten (also aus Objekten der Klasse Recipe) speichern. Die initiale Kapazität des Arrays soll 5 sein. 
Die Klasse hat eine Methode zum Hinzufügen und Löschen von Rezepten `public boolean addRecipe(Recipe recipe)` und `public boolean removeRecipe(Recipe recipe)`. Prüfen Sie auch hier wieder, ob das Rezept schon in der Liste vorhanden ist, bevor Sie es hinzufügen / löschen (überprüfen Sie das anhand des Namens des Rezepts). Falls das Array voll ist, erstellen Sie ein neues und kopieren alle bereits vorhandenen Rezepte hier rein.
Außerdem hat die Klasse einen Getter, der die Namen der Rezepte im Array als String zurückgibt. 


# Aufgabe 6
Fügen Sie in der Klasse `RecipeBook` eine Methode hinzu, die Rezepte einer Kategorie in ein Array speichert und das Array zurückgibt. 

# Aufgabe 7
Fügen Sie in der Klasse `RecipeBook` zwei Methoden zum Printen hinzu:
1. Eine Funktion, die alle Rezepte in des Arrays printed.
2. Eine Funktion, die die Rezepte einer Kategorie printed.

Dabei soll für jedes Rezept ausgegeben werden:
- Name
- Zubereitungszeit
- Kategorie
- Bewertung (wenn gesetzt)

Falls es keine Bewertung gibt, soll das Programm nicht abstürzen. 