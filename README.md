# Chińskie twierdzenie o resztach

## Definicja

*Chińskie twierdzenie o resztach to twierdzenie matematyczne, które pozwala na znalezienie rozwiązania dla równania liniowego z modulo. Równanie to ma postać: a1x ≡ r1 (mod m1), a2x ≡ r2 (mod m2), ..., anx ≡ rn (mod mn), gdzie ai, ri i mi są liczbami całkowitymi. Twierdzenie to mówi, że jeśli mi są względnie pierwsze, to istnieje jedno rozwiązanie modulo M, gdzie M = m1m2...mn. Twierdzenie chińskie o resztach jest często używane w algorytmach obliczeniowych i kryptografii.*

## Opis kodu

> Kod ten definiuje funkcję obliczania chińskiego twierdzenia o resztach. Przyjmuje ona dwa argumenty: tablicę a i tablicę m. Funkcja oblicza i zwraca rozwiązanie, jeśli istnieje. W przeciwnym razie zwraca -1.

## Wywołanie kodu (przykład)
```java
    int[] m = {3, 5, 7};
    int[] a = {2, 3, 2};
    int x = ChineseRemainderTheorem.compute(a, m);
```
