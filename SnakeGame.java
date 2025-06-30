import javax.swing.*;

public class SnakeGame {
    public static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        showMainMenu();
    }

    public static void showMainMenu() {
        MainMenuPanel menu = new MainMenuPanel();
        frame.setContentPane(menu);
        frame.revalidate();
    }

    public static void startGame(String difficulty) {
        GamePanel gamePanel = new GamePanel(difficulty);
        frame.setContentPane(gamePanel);
        frame.revalidate();
        gamePanel.requestFocusInWindow();
    }

    public static void showHighScore() {
        JOptionPane.showMessageDialog(frame, "High Score: " + GamePanel.readHighScore(),
                "High Score", JOptionPane.INFORMATION_MESSAGE);
    }
}