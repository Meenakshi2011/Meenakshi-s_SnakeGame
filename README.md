# Meenakshi-s_SnakeGame
This is a complete Snake Game project built using Java Swing.  
The game includes the following features:  
1. Main menu interface,  
2. Difficulty settings (Easy, Medium, Hard),  
3. High score saving and viewing using a text file,  
4. Restart functionality after game over.
 
The code is structured using multiple classes and files for modularity, maintainability, and ease of extension.

## SnakeGame.java:  
--> <ins>Purpose</ins>: Entry point of the application. It handles switching between panels (Main Menu and Game Panel).  
--> <ins>Main Classes and Methods</ins>:  
    1. public class SnakeGame: Main class with main() method.  
    2. public static void main(String[] args): Initializes the JFrame and displays the main menu.  
    3. public static void showMainMenu(): Displays the main menu panel.  
    4. public static void startGame(String difficulty): Replaces the content pane with the game panel and passes selected difficulty.  
    5. public static void showHighScore(): Shows a dialog with the current high score read from file.  
--> <ins>Packages Used<ins>: javax.swing.*

## MainMenuPanel.java
--> <ins>Purpose</ins>: GUI panel shown at the start, allowing the user to choose difficulty, start the game, view high score, or exit.  
--> <ins>Main Classes and Methods</ins>:  
    1. public class MainMenuPanel extends JPanel: Extends JPanel to build a custom menu UI.  
    2. MainMenuPanel(): Constructor initializes layout, labels, and buttons.  
       Button listeners trigger the appropriate method in SnakeGame.java.  
--> <ins>Compenents Used</ins>: JButton, JLabel, GridBagLayout  
--> <ins>Packages Used</ins>: javax.swing.*, java.awt.*, java.awt.event.*  

## GamePanel.java
--> <ins>Purpose</ins>: Core logic of the Snake game — rendering, movement, collision detection, scoring, and input handling.  
--> <ins>Main Classes and Fields</ins>:  
1. public class GamePanel extends JPanel implements ActionListener; Implements ActionListener for game loop timer; Manages snake coordinates, game state, and user interaction.  
2. Fields: SCREEN_WIDTH, SCREEN_HEIGHT, UNIT_SIZE: define the grid.  
x[], y[]: arrays to store snake body coordinates.  
bodyParts, applesEaten, appleX, appleY: game state.  
DELAY: controls game speed, modified based on difficulty.  
Timer timer: drives the game loop.  
JButton restartButton: visible after Game Over to restart the game.  
--> <ins>Key Methods</ins>:  
1. GamePanel(String difficulty): Initializes the panel and sets game speed.  
2. startGame(): Resets the board and starts the timer.  
3. move(): Moves the snake based on direction.  
4. checkApple(): Checks if apple is eaten, increments score, plays sound.  
5. checkCollisions(): Ends game if snake hits wall or itself.  
6. gameOver(Graphics g): Draws "Game Over" screen and shows restart button.  
7. restartGame(): Resets game variables and starts a new session.  
8. paintComponent(Graphics g): Called by Swing to repaint the screen.  
9. actionPerformed(ActionEvent e): Called every tick by Timer.  
10. MyKeyAdapter: Handles arrow key input for snake direction.  

High Score Handling:  
1. readHighScore(): Reads from highscores.txt using try-with-resources.  
2. saveHighScore(int score): Updates high score if current score is higher.  

--> <ins>Packages Used</ins>: javax.swing.*, java.awt.*, java.awt.event.*, java.io.*, java.util.*  

## Other Files  
## highscores.txt  
--> <ins>Purpose</ins>: Stores the highest score persistently.  
Located in the root project directory.  
Updated only when a new high score is achieved.  
