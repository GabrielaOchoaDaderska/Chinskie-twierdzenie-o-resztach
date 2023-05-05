import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ChineseRemainderTheoremGraph extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public ChineseRemainderTheoremGraph() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Chińskie Twierdzenie o Resztach");

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Dane wejściowe
                int[] a = {2, 3, 2}; // reszty
                int[] m = {3, 5, 7}; // moduły
                int n = a.length;

                // Wspólne NWW
                int M = 1;
                for (int i = 0; i < n; i++) {
                    M *= m[i];
                }

                // Wspólne NWD
                int[] Mi = new int[n];
                int[] yi = new int[n];
                int[] zi = new int[n];
                int[] xi = new int[n];
                for (int i = 0; i < n; i++) {
                    Mi[i] = M / m[i];
                    yi[i] = extendedEuclideanAlgorithm(Mi[i], m[i]);
                    zi[i] = (yi[i] * Mi[i]) % M;
                    xi[i] = (zi[i] * a[i]) % M;
                }

                // Rysowanie grafu
                int x0 = 50;
                int y0 = 50;
                int x = x0;
                int y = y0;
                int w = (WIDTH - 2 * x0) / n;
                int h = (HEIGHT - 2 * y0) / (M + 1);
                g2d.setColor(Color.BLACK);
                g2d.setFont(new Font("Arial", Font.BOLD, 16));
                g2d.drawString("Chińskie Twierdzenie o Resztach", x0, y0 - 20);
                for (int i = 0; i < n; i++) {
                    g2d.drawString("x ≡ " + a[i] + " (mod " + m[i] + ")", x, y - h / 2);
                    g2d.drawRect(x, y, w, h);
                    for (int j = 0; j < M; j++) {
                        int k = i * M + j;
                        if (j % m[i] == a[i]) {
                            g2d.setColor(Color.GREEN);
                            g2d.fill(new Rectangle2D.Double(x, y - h / 2 + j * h / m[i], w, h / m[i]));
                            g2d.setColor(Color.BLACK);
                        } else {
                            g2d.draw(new Line2D.Double(x, y - h / 2 + j * h / m[i], x + w, y - h / 2 + xi[i] + j * h / m[i]));
                        }
                    }
                    x += w;
                }
            }
        };
        add(panel);
    }

    private int extendedEuclideanAlgorithm(int a, int b) {
        int r0 = a;
        int r1 = b;
        int s0 = 1;
        int s1 = 0;
        int t0 = 0;
        int t1 = 1;
        while (r1 != 0) {
            int q = r0 / r1;
            int r = r0 % r1;
            int s = s0 - q * s1;
            int t = t0 - q * t1;
            r0 = r1;
            r1 = r;
            s0 = s1;
            s1 = s;
            t0 = t1;
            t1 = t;
        }
        return t0;
    }

    public static void main(String[] args) {
        ChineseRemainderTheoremGraph graph = new ChineseRemainderTheoremGraph();
        graph.setVisible(true);
    }

}
