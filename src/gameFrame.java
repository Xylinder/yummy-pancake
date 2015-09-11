import javax.swing.*;
import java.awt.*;

/**
 * Created by Matilda on 2015-09-11.
 */
public class gameFrame extends JFrame{

    public static void main(String[] args) {
        createWindow();
    }

    private static void createWindow() {
        JFrame window = new JFrame("Beautiful window");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("This better work, or else");

        panel.setBackground(Color.yellow);
        window.add(panel);
        panel.add(label);
        window.setVisible(true);
        window.setSize(400, 500);
    }
}
