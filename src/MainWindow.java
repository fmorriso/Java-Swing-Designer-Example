import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private String title;
    private Dimension scaledSize;
    private JPanel mainPanel;
    private JPanel outerGridPanel;
    private JPanel controlsPanel;
    private JButton btnNewGame;
    private JButton btnQuit;

    private MainWindow() {/* prevent uninitialized instances */

    }
    public MainWindow(String title) {
        this.title = title;
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final int multipleof = 10;
        this.scaledSize = SwingScreenUtilities.getScaledSize(0.5, multipleof, true);
        setSize(scaledSize);
        setLocationRelativeTo(null);

        btnQuit.addActionListener((ActionEvent e) -> System.exit(0));

        mainPanel.setBackground(Color.GREEN.darker().darker());
        setContentPane(mainPanel);

        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
