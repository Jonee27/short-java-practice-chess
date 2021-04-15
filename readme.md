Két sakkozó azon vitatkozik melyikük adott többször sakkot a másiknak a fekete huszárral.
Téged bíznak meg, hogy segíts pontot tenni a vitájukra. Szerencsére az összes sakk állásukat egy csv file-ba rögzítették.
A sakk állások a fájlon belül a következő képen vannak megadva:
Az első sor annak a játékosnak a neve aki a fekete bábukkal van.
Az ezt követő sorok a sakktábla sorai, az egyes mezők vesszővel elválasztva.
hint: nézzétek meg a fájl felépítését a unit testben megadott fájlokon.
az üres mezők jelölése:
es - empty square
a bábuk jelölése:
wk - white knight
wb - white bishop
wp - white pawn
wq - white quien
wr - white rook
wK - white king
bk - black knight
bb - black bishop
bp - black pawn
bq - black quien
br - black rook
bK - black king

A sötét huszár akkor add sakkot a világos királynak ha következő lépéssel le tudná ütni.
egy leírás hogy a huszár merre tud lépni: https://www.mark-weeks.com/aboutcom/ble132kn.htm

Implementáld a calculateBlackKnightChampion metódust.
A metódus feladata hogy adja vissza annak a játékosnak a nevét aki a legtöbbször adott sakkot fekete huszárral.
Döntetlen esetén a "draw" String-et kell vissza adni.
