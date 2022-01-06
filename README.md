# Xmas_SEN

## Geschichte:
==
Der Weihnachtsmann hat verschiedenste Allergien. Überall auf der Welt geben Kindern ihn verschiedenste Backwaren.
Deswegen braucht er ein Programm, das ihm alle Zutaten in Sprachen, die er nicht kennt, herausfindet.
==


## Problem:
==
Wir bekommen einen String der wie folgt aussieht:
==


mxmxvkd kfcds sqjhc nhms (contains dairy, fish)

trh fvjkl sbzzf mxmxvkd (contains dairy)

sqjhc fvjkl (contains soy)

sqjhc mxmxvkd sbzzf (contains fish)



==
Hier kann man sehen das mxmxvkd dairy ist.
Zuerst müssen wir die allergene Herausfiltern. Dann können wir filtern, ob ein Wort zweimal vorkommt und ob es ein gemeinsames Allergen hat.
Danach geben wir diese aus.
Der Output sollte hier sein:
==

mxmxvkd = dairy

sqjhc = fish

fvjkl = soy
