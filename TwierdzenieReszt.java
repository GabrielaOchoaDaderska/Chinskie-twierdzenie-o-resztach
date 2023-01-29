
import java.awt.*;
import javax.swing.*;

public class TwierdzenieReszt extends JFrame {
    private static final long serialVersionUID = 1L;
    static JTextField t1, t2, t3;
    static JLabel l1, l2, l3;
    static JButton b1;
    static JPanel p;

    public static void main(String[] args) {
        TwierdzenieReszt frame = new TwierdzenieReszt();
        frame.setTitle("Twierdzenie Chińskiego Reszt");
        frame.setSize(250, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public TwierdzenieReszt() {
        p = new JPanel();
        l1 = new JLabel("Podaj a:");
        t1 = new JTextField(10);
        l2 = new JLabel("Podaj b:");
        t2 = new JTextField(10);
        l3 = new JLabel("Podaj c:");
        t3 = new JTextField(10);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        b1 = new JButton("Oblicz");
        b1.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());
            int x = 0;
            for (int i = 0; i < b; i++) {
                if ((a * i) % b == c) {
                    x = i;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Twierdzenie Chińskich Reszt:\n" +
                    "x = " + x + " (mod " + b + ")");
        });
        p.add(b1);
        add(p);
    }

}
