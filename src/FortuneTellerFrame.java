import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FortuneTellerFrame extends JFrame {
    JFrame frame;
    JPanel panelTop;
    JPanel panelMiddle;
    JPanel panelBottom;
    JLabel fortuneLabel;
    ImageIcon fortuneTellerImage;
    JLabel displayImage;
    JTextArea textArea;
    JScrollPane scrollPane;
    public FortuneTellerFrame() {
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setTitle("Fortune Teller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//----------------------------------------------------------------------------
        panelTop = new JPanel();

        fortuneLabel = new JLabel("Fortune Teller");
        fortuneLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 36));

        fortuneTellerImage = new ImageIcon("fortuneTeller.png");
        displayImage = new JLabel(fortuneTellerImage);

        fortuneLabel.setBounds(180, 10, 300, 50);
        displayImage.setBounds(260,70,100, 100);

//----------------------------------------------------------------------------
        panelMiddle = new JPanel();

        textArea = new JTextArea(15,30);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);

//----------------------------------------------------------------------------
        panelBottom = new JPanel();

// add stuff -----------------------------------------------------------------
        frame.add(panelTop);
        frame.add(panelMiddle);
        frame.add(panelBottom);

        panelTop.add(fortuneLabel);
        panelTop.add(displayImage);

        panelMiddle.add(scrollPane);

// layout stuff --------------------------------------------------------------
        panelTop.setLayout(null);
        panelMiddle.setLayout(null);
        panelBottom.setLayout(null);

        panelTop.setBounds(0,0,600,200);
        panelMiddle.setBounds(0,200,600,200);
        panelBottom.setBounds(0,400,600,200);
    }

    public static void main(String[] args) {
        new FortuneTellerFrame();
    }
}
