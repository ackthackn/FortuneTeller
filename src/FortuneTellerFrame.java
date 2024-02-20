import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame {
    JPanel mainPanel, topPanel, middlePanel, bottomPanel;
    JLabel fortuneLabel, displayImage;
    ImageIcon fortuneTellerImage;
    JTextArea textArea;
    JScrollPane scrollPane;
    JButton read, quit;
    ArrayList<String> humorousFortunes;
    int randomIndex;
    int lastElement = -1;
    Random random = new Random();

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
        setSize(600, 400);
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

        textArea = new JTextArea(5,35);
        textArea.setEditable(false);
        textArea.setFont(new Font("Bookman Old Style", Font.PLAIN, 14));

        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        middlePanel.add(scrollPane);
    }

    private void createBottomPanel(){
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,2));

        createFortunes();

        read = new JButton("Read My Fortune!");
        read.addActionListener((ActionEvent ae) ->
        {
            randomIndex = random.nextInt(humorousFortunes.size());
            while(randomIndex == lastElement){
                randomIndex = random.nextInt(humorousFortunes.size());
            }
            lastElement = randomIndex;

            textArea.append(humorousFortunes.get(randomIndex) + "\n");
        });

        quit = new JButton("Quit");
        quit.addActionListener((ActionEvent ae) -> System.exit(0));

        Dimension preferredSize = new Dimension(50,50);

        read.setPreferredSize(preferredSize);
        quit.setPreferredSize(preferredSize);

        bottomPanel.add(read);
        bottomPanel.add(quit);
    }

    private void createFortunes(){
        humorousFortunes = new ArrayList<>();
            humorousFortunes.add("Next time, order the shrimp.");
            humorousFortunes.add("You think it's a secret, but they know.");
            humorousFortunes.add("404 Fortune not found.");
            humorousFortunes.add("Your shoes will make you happy today.");
            humorousFortunes.add("A closed mouth gathers no feet.");
            humorousFortunes.add("You will inherit great amounts of debt soon.");
            humorousFortunes.add("It could be better, but it's good enough.");
            humorousFortunes.add("As long as you don't sign up for anything new, you'll do fine.");
            humorousFortunes.add("Panic.");
            humorousFortunes.add("Enjoy yourself while you can.");
            humorousFortunes.add("When you squeeze an orange, orange juice comes out.");
            humorousFortunes.add("You will read this fortune.");
            humorousFortunes.add("You're pregnant");
    }
}
