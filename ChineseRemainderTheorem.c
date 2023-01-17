#include <stdio.h>
#include <stdlib.h>

// Funkcja zwraca rozwiązanie dla równania liniowego z modulo
// a1x ≡ r1 (mod m1), a2x ≡ r2 (mod m2), ..., anx ≡ rn (mod mn)
// jeśli mi są względnie pierwsze.
int ChineseRemainderTheorem(int a[], int r[], int m[], int n)
{
    int M = 1;
    for (int i = 0; i < n; i++)
        M *= m[i];

    int x = 0;
    for (int i = 0; i < n; i++) {
        int Mi = M / m[i];
        int Mi_inv = ModularInverse(Mi, m[i]);

        x += r[i] * Mi * Mi_inv;
    }

    return x % M;
}

// Funkcja oblicza modularny odwrotny
// dla liczby a pod modulo m
int ModularInverse(int a, int m)
{
    int m0 = m;
    int y = 0, x = 1;

    if (m == 1)
        return 0;

    while (a > 1) {
        int q = a / m;
        int t = m;

        m = a % m, a = t;
        t = y;

        y = x - q * y;
        x = t;
    }

    if (x < 0)
        x += m0;

    return x;
}

// Funkcja testowa
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