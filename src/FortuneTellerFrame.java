import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FortuneTellerFrame extends JFrame {
    JPanel mainPanel, topPanel, middlePanel, bottomPanel;
    JLabel fortuneLabel, displayImage;
    ImageIcon fortuneTellerImage;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton read, quit;
    public FortuneTellerFrame() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createTopPanel();
        mainPanel.add(topPanel, BorderLayout.NORTH);

        createMiddlePanel();
        mainPanel.add(middlePanel, BorderLayout.CENTER);

        createBottomPanel();
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createTopPanel() {
        topPanel = new JPanel();

        fortuneTellerImage = new ImageIcon("fortuneTeller.png");
        fortuneLabel = new JLabel("Fortune Teller", fortuneTellerImage, JLabel.CENTER);
        fortuneLabel.setFont(new Font("Bookman Old Style", Font.PLAIN, 36));
        fortuneLabel.setVerticalTextPosition(JLabel.BOTTOM);
        fortuneLabel.setHorizontalTextPosition(JLabel.CENTER);

        topPanel.add(fortuneLabel);
    }

    private void createMiddlePanel(){
        middlePanel = new JPanel();

        textArea = new JTextArea(10,55);
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);

        middlePanel.add(scrollPane);
    }

    private void createBottomPanel(){
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,2));

        read = new JButton("Read My Fortune!");

        quit = new JButton("Quit");
        quit.addActionListener((ActionEvent ae) -> System.exit(0));

        bottomPanel.add(read);
        bottomPanel.add(quit);
    }

    public static void main(String[] args) {
        new FortuneTellerFrame();
    }
}
