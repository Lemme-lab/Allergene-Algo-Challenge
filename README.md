# Allergene-Algo-Challenge

## Idea:
Man bekommt einen string in den Zutaten mit verschiedenen Allergenen enthalten sind.
Leider sind die Wörter in einer anderen Sprache.
Die Allergene sind jedoch in Englisch. Dadurch das manche Wörter mit den zugehörigen Allergenen mehrfach vorkommen kann man diese herausfinden.

## Problem:
Wir bekommen einen String der wie folgt aussieht:


``` 
mxmxvkd kfcds sqjhc nhms (contains dairy, fish)
trh fvjkl sbzzf mxmxvkd (contains dairy)
sqjhc fvjkl (contains soy)
sqjhc mxmxvkd sbzzf (contains fish)
```



Hier kann man sehen das mxmxvkd dairy ist.
Zuerst müssen wir die allergene Herausfiltern. 
Dann können wir filtern, ob ein Wort zweimal vorkommt und ob es ein gemeinsames Allergen hat.
Danach geben wir diese aus. Der Output sollte hier sein:

```
mxmxvkd = dairy
sqjhc = fish
```

## Code:
### pre_proce:
Hier geben wir jedem Wort das zugehörige Allergen in einem 2D Array.

### search_algo:
Hier gehen wir alle Wörter durch und vergleichen die Allergene. 
Wenn sie gleich sind und das Wort noch nicht gefunden wurde, geben wir es aus 
und speichern es ab. 

### post_proce:
Zuletzt werden die Output daten noch verschönert. 
