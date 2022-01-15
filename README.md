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

![Screenshot_78](https://user-images.githubusercontent.com/71924682/149638761-a2683169-dbe0-4799-9271-db7edc43ba5f.png)

### search_algo:
Hier gehen wir alle Wörter durch und vergleichen die Allergene. 

Wenn sie gleich sind und das Wort noch nicht gefunden wurde, geben wir diese aus 
und speichern es ab. 

![Screenshot_79](https://user-images.githubusercontent.com/71924682/149638764-38c33c91-f8f5-440a-960b-6e718d02a1d6.png)

### post_proce:
Zuletzt werden die Output daten noch verschönert. 

![Screenshot_80](https://user-images.githubusercontent.com/71924682/149638767-b571e556-6666-4d33-9547-0f4abc7e58f0.png)
