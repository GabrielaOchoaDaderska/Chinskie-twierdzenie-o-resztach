# Chińskie twierdzenie o resztach

## Definicja

*Chińskie twierdzenie o resztach to twierdzenie matematyczne, które pozwala na znalezienie rozwiązania dla równania liniowego z modulo. Równanie to ma postać: a1x ≡ r1 (mod m1), a2x ≡ r2 (mod m2), ..., anx ≡ rn (mod mn), gdzie ai, ri i mi są liczbami całkowitymi. Twierdzenie to mówi, że jeśli mi są względnie pierwsze, to istnieje jedno rozwiązanie modulo M, gdzie M = m1m2...mn. Twierdzenie chińskie o resztach jest często używane w algorytmach obliczeniowych i kryptografii.*

## Opis kodu

> Kod ten definiuje funkcję obliczania chińskiego twierdzenia o resztach. Przyjmuje ona dwa argumenty: tablicę a i tablicę m. Funkcja oblicza i zwraca rozwiązanie, jeśli istnieje. W przeciwnym razie zwraca -1.

## Wywołanie kodu (w javie-przyklad)
```java
    int[] m = {3, 5, 7};
    int[] a = {2, 3, 2};
    int x = ChineseRemainderTheorem.compute(a, m);
```

> wynik

![image](https://user-images.githubusercontent.com/108947060/216556332-62eb595e-b74c-4b7a-9b4d-02effa47c02e.png)

## Wygląd kodu

> wprowadzenie danych
> 
![image](https://user-images.githubusercontent.com/108947060/216555635-b7e952b1-c556-4f03-942c-a91155f785fc.png)

> wynik
> 
![image](https://user-images.githubusercontent.com/108947060/216555539-2d6fd24e-ceb8-4a99-8baa-d4382da375de.png)


## Opis kodu

> Ten program demonstruje Chińskie Twierdzenie o Resztach. Program stworzony w języku Java pozwala wprowadzić trzy liczby całkowite, a następnie obliczyć i wyświetlić wynik twierdzenia. Program wykorzystuje bibliotekę graficzną, aby wyświetlić odpowiedni kalkulator i wzór twierdzenia.

## Wywołanie kodu (w c-przyklad)
```c
int main()
{
    int a[] = { 3, 5, 7 };
    int r[] = { 2, 3, 2 };
    int m[] = { 4, 5, 7 };
    int n = sizeof(a) / sizeof(a[0]);

    printf("Rozwiazanie to: %d\n",
           ChineseRemainderTheorem(a, r, m, n));
    return 0;
}
```
