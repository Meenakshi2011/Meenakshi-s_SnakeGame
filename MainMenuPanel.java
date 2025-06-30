import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel {
    public MainMenuPanel() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel("Meenakshi's Snake Game", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        gbc.gridx = 0; gbc.gridy = 0;
        this.add(title, gbc);

        JButton easy = new JButton("Level 1: Easy");
        JButton medium = new JButton("Level 2: Medium");
        JButton hard = new JButton("Level 3: Hard");
        JButton score = new JButton("View High Score");
        JButton exit = new JButton("Exit");

        easy.addActionListener(e -> SnakeGame.startGame("EASY"));
        medium.addActionListener(e -> SnakeGame.startGame("MEDIUM"));
        hard.addActionListener(e -> SnakeGame.startGame("HARD"));
        score.addActionListener(e -> SnakeGame.showHighScore());
        exit.addActionListener(e -> System.exit(0));

        gbc.gridy = 1; this.add(easy, gbc);
        gbc.gridy = 2; this.add(medium, gbc);
        gbc.gridy = 3; this.add(hard, gbc);
        gbc.gridy = 4; this.add(score, gbc);
        gbc.gridy = 5; this.add(exit, gbc);
    }
}
