
import java.util.Random;
import javax.swing.JOptionPane;

public class Realgame {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to coding duniya");
        JOptionPane.showMessageDialog(null, "Game of maths!!");
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        int c = a + b;
        int e = 2;
        int d = Integer.parseInt(JOptionPane.showInputDialog("Enter the sum of two number  " + "A:" + a + "  B:" + b));
        if (d == c) {
            while (d == c) {

                JOptionPane.showMessageDialog(null, "Entered level" + e);
                a = rand.nextInt(100);
                b = rand.nextInt(100);
                c = a + b;
                d = Integer.parseInt(JOptionPane.showInputDialog("Enter the sum of two number  " + "A:" + a + " B:" + b));
                e++;
            }
        }
        int ni = e - 1;
        JOptionPane.showMessageDialog(null, "Oops!! You loose the game at level" + ni);
    }

}
