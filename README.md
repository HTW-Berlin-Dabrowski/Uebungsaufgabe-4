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
Fügen Sie zur Klasse eine Array Liste für die Zutaten hinzu. Schreiben Sie eine Methode, mit der man Zutaten zur Liste hinzufügen kann und eine Methode, mit der man Zutaten aus dem Array entfernen kann. 
Prüfen Sie beim Hinzufügen, dass die Zutat noch nicht in der Liste ist und beim Entfernen, dass Sie eine vorhandene Zutat löschen. Sollte das nicht der Fall sein, geben Sie auf der Konsole die Meldung "Hinzufügen / Löschen fehlgeschlagen" aus und fügen Sie die Zutat nicht hinzu.

# Aufgabe 5
Erstellen Sie eine zweite Klasse `RecipeBook`, in der Sie eine Array Liste mit Rezepten speichern. Die Klasse hat eine Methode zum Hinzufügen und Löschen von Rezepten. Prüfen Sie auch hier wieder, ob das Rezept schon in der Liste vorhanden ist, bevor Sie es hinzufügen / löschen. Außerdem hat die Klasse einen Getter, der die Namen der Rezepte in der Liste zurückgibt. 

# Aufgabe 6
Fügen Sie in der Klasse `RecipeBook` eine Methode hinzu, die Rezepte einer Kategorie in ein Array speichert und das Array zurückgibt. 

# Aufgabe 7
Fügen Sie in der Klasse `RecipeBook` zwei Methoden zum Printen hinzu:
1. Eine Funktion, die alle Rezepte in der Array Liste printed.
2. Eine Funktion, die die Rezepte einer Kategorie printed.

Dabei soll für jedes Rezept ausgegeben werden:
- Name
- Zubereitungszeit
- Kategorie
- Bewertung (wenn gesetzt)

Falls es keine Bewertung gibt, soll das Programm nicht abstürzen. 