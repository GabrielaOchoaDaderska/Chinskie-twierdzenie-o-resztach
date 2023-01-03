public class ChineseRemainderTheorem<x> {
    public static void main(String[] args) {
        // Przykładowe wartości
        int[] a = {2, 3, 2};
        int[] m = {3, 5, 7};
        int x = compute(a, m);
        if (x == -1) {
            System.out.println("Nie da się obliczyć");
        } else {
            System.out.println("Wynik to: " + x);
        }
    }

    public static int compute(int[] a, int[] m) {
        // Sprawdź czy istnieje rozwiązanie
        int M = 1;
        for (int i = 0; i < m.length; i++) {
            M *= m[i];
        }

        int[] M_i = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            M_i[i] = M / m[i];
        }

        int[] y = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            y[i] = modInverse(M_i[i], m[i]);
        }

        int x = 0;
        for (int i = 0; i < m.length; i++) {
            x += a[i] * M_i[i] * y[i];
        }
        x = x % M;

        if (x < 0) {
            x += M;
        }
        return x;
    }

    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return -1;
    }
  //wywołanie
    int[] m = {3, 5, 7};
    int[] a = {2, 3, 2};
    int x = ChineseRemainderTheorem.compute(a, m);

}

