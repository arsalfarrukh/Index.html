

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePlayGUI {

    private static final String PLAYER1 = "X";
    private static final String PLAYER2 = "O";
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    private int counter;
    private int score1;
    private int score2;
    private JButton[][] buttons;

    public GamePlayGUI() {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 400));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(ROWS, COLUMNS));

        buttons = new JButton[ROWS][COLUMNS];
        counter = 0;
        score1 = 0;
        score2 = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                buttons[i][j].addActionListener(new ButtonClickListener());
                panel.add(buttons[i][j]);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();

            if (buttonClicked.getText().isEmpty()) {
                if (counter % 2 == 0) {
                    buttonClicked.setText(PLAYER1);
                } else {
                    buttonClicked.setText(PLAYER2);
                }
                buttonClicked.setEnabled(false);
                counter++;

                if (counter >= 5) {
                    checkForWin();
                }

                if (counter == ROWS * COLUMNS) {
                    showDrawMessage();
                }
            }
        }

        private void checkForWin() {
            for (int i = 0; i < ROWS; i++) {
                if (checkRow(i)) {
                    showWinMessage(buttons[i][0].getText());
                    return;
                }
            }

            for (int j = 0; j < COLUMNS; j++) {
                if (checkColumn(j)) {
                    showWinMessage(buttons[0][j].getText());
                    return;
                }
            }

            if (checkDiagonal1() || checkDiagonal2()) {
                showWinMessage(buttons[1][1].getText());
                return;
            }
        }

        private boolean checkRow(int row) {
            String symbol = buttons[row][0].getText();
            if (symbol.isEmpty()) {
                return false;
            }

            for (int j = 1; j < COLUMNS; j++) {
                if (!buttons[row][j].getText().equals(symbol)) {
                    return false;
                }
            }

            return true;
        }

        private boolean checkColumn(int col) {
            String symbol = buttons[0][col].getText();
            if (symbol.isEmpty()) {
                return false;
            }

            for (int i = 1; i < ROWS; i++) {
                if (!buttons[i][col].getText().equals(symbol)) {
                    return false;
                }
            }

            return true;
        }

        private boolean checkDiagonal1() {
            String symbol = buttons[0][0].getText();
            if (symbol.isEmpty()) {
                return false;
            }

            for (int i = 1; i < ROWS; i++) {
                if (!buttons[i][i].getText().equals(symbol)) {
                    return false;
                }
            }

            return true;
        }

        private boolean checkDiagonal2() {
            String symbol = buttons[0][COLUMNS - 1].getText();
            if (symbol.isEmpty()) {
                return false;
            }

            for (int i = 1; i < ROWS; i++) {
                if (!buttons[i][COLUMNS - 1 - i].getText().equals(symbol)) {
                    return false;
                }
            }

            return true;
        }

        private void showWinMessage(String winner) {
            JOptionPane.showMessageDialog(null, "Player " + winner + " wins!");
            updateScore(winner);
            resetGame();
        }

        private void showDrawMessage() {
            JOptionPane.showMessageDialog(null, "It's a draw!");
            resetGame();
        }

        private void updateScore(String winner) {
            if (winner.equals(PLAYER1)) {
                score1++;
                JOptionPane.showMessageDialog(null, "Player X score is: " + score1);
            } else if (winner.equals(PLAYER2)) {
                score2++;
                JOptionPane.showMessageDialog(null, "Player O score is: " + score2);
            }
        }

        private void resetGame() {
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    buttons[i][j].setText("");
                    buttons[i][j].setEnabled(true);
                }
            }
            counter = 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GamePlayGUI());
    }
}