# Chińskie twierdzenie o resztach

## Spis treści
- [Definicja](#Definicja)
- [Opis kodu - ChineseRemainderTheorem](#Opis-kodu---ChineseRemainderTheorem)
- - [Wywołanie kodu](#Wywołanie-kodu)
- [Opis kodu - TwierdzenieReszt.java](#Opis-kodu---TwierdzenieReszt.java)
- - [Wywołanie kodu](#Wywołanie-kodu)
- - - [Wygląd kodu](#Wygląd-kodu)



## Definicja

*Chińskie twierdzenie o resztach to twierdzenie matematyczne, które pozwala na znalezienie rozwiązania dla równania liniowego z modulo. Równanie to ma postać: a1x ≡ r1 (mod m1), a2x ≡ r2 (mod m2), ..., anx ≡ rn (mod mn), gdzie ai, ri i mi są liczbami całkowitymi. Twierdzenie to mówi, że jeśli mi są względnie pierwsze, to istnieje jedno rozwiązanie modulo M, gdzie M = m1m2...mn. Twierdzenie chińskie o resztach jest często używane w algorytmach obliczeniowych i kryptografii.*

## Opis kodu - [ChineseRemainderTheorem.java](https://github.com/GabrielaOchoaDaderska/Chinskie-twierdzenie-o-resztach/blob/main/ChineseRemainderTheorem.java)

> Kod ten definiuje funkcję obliczania chińskiego twierdzenia o resztach. Przyjmuje ona dwa argumenty: tablicę a i tablicę m. Funkcja oblicza i zwraca rozwiązanie, jeśli istnieje. W przeciwnym razie zwraca -1.


## Wywołanie kodu
```java
    int[] m = {3, 5, 7};
    int[] a = {2, 3, 2};
    int x = ChineseRemainderTheorem.compute(a, m);
```

> wynik

![image](https://user-images.githubusercontent.com/108947060/216556332-62eb595e-b74c-4b7a-9b4d-02effa47c02e.png)


## Opis kodu - [TwierdzenieReszt.java](https://github.com/GabrielaOchoaDaderska/Chinskie-twierdzenie-o-resztach/blob/main/TwierdzenieReszt.java)

> Kod tworzy prosty interfejs graficzny, w którym użytkownik może wprowadzić 3 liczby całkowite: a, b i c. Następnie użytkownik może kliknąć przycisk "Oblicz" i wyświetlony zostanie wynik w postaci "Twierdzenie Chińskich Reszt: x = x (mod b)". Kod tworzy obiekt typu JFrame, w którym znajdują się trzy pola tekstowe, trzy etykiety i jeden przycisk. Po kliknięciu przycisku wykonywana jest funkcja, w której wprowadzone liczby są przetwarzane. Następnie wynik zostaje wyświetlony w postaci okienka dialogowego.


## Wywołanie kodu 
```java
    int[] m = {3, 5, 7};
    int[] a = {2, 3, 2};
    int x = ChineseRemainderTheorem.compute(a, m);
```

## Wygląd kodu

> wprowadzenie danych
> 
![image](https://user-images.githubusercontent.com/108947060/216555635-b7e952b1-c556-4f03-942c-a91155f785fc.png)

> wynik
> 
![image](https://user-images.githubusercontent.com/108947060/216555539-2d6fd24e-ceb8-4a99-8baa-d4382da375de.png)


## Opis kodu - [ChineseRemainderTheoremGraph.java](https://github.com/GabrielaOchoaDaderska/Chinskie-twierdzenie-o-resztach/blob/main/ChineseRemainderTheoremGraph%20.java)

> Kod ten tworzy nowe okno Swing, zawierające panel, który rysuje graf. Panel ten składa się z kilku elementów:

- Dane wejściowe - reszty a i moduły m dla równań modularnych.
- Obliczenie wspólnego NWW M i wspólnych NWD dla każdego równania.
- Rysowanie grafu - wierzchołki i krawędzie dla każdego równania.
- Algorytm Euklidesa rozszerzonego - używany do obliczenia wspólnych NWD.

Ten kod rysuje graf dla trzech równań modularnych, ale można go zmodyfikować, aby rysował graf dla dowolnej liczby równań.

 ---


