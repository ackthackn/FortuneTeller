import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {

    private ImageIcon fortuneTellerImage;
    private JLabel displayImage;
    public FortuneTellerFrame() {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Fortune Teller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panelTop = new JPanel();//new GridLayout(1,2));

        JLabel fortuneLabel = new JLabel("Fortune Teller");
        fortuneLabel.setFont(new Font("Serif", Font.PLAIN, 36));

        fortuneTellerImage = new ImageIcon("fortuneTeller.png");
        displayImage = new JLabel(fortuneTellerImage);

        // set locations
        fortuneLabel.setLocation(300,0);
        displayImage.setLocation(300, 100);

        // add stuff
        frame.add(panelTop);
        panelTop.add(fortuneLabel);
        panelTop.add(displayImage);
    }

    public static void main(String[] args) {
        new FortuneTellerFrame();
    }
}
