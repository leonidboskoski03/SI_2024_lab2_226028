Втора лабораториска вежба по Софтверско инженерство.

Леонид Бошкоски 226028

Control Flow Graph
![Фотографија од control flow graph-ot](https://github.com/leonidboskoski03/SI_2024_lab2_226028/assets/167028096/cfc1eb9a-7e3b-49d0-9fac-193ab08a3153)

Цикломатска комплексност
Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

Тест случаи според критериумот Every statement
allItems = null -> "allItems list can't be null!"

allItems = [("",null,200,0)] -> "No barcode!"

allItems = [("name","kod123",200,0)] -> "Invalid character in item barcode!"

allItems = [("name", "0123",1000,0.1)]; payment = 100 -> false

allItems = [("name", "0123",1000,0)]; payment = 100 -> true

Тест случаи според критериумот Every path

TTT    allItems = [("name","0123",400,0.1)] ->true

TFX    allItems = [("name","5123",400,0.1)] ->false

TTF    allItems = [("name","0123",400,0)] ->false

FXX    allItems = [("name","0123",100,0)] ->false


