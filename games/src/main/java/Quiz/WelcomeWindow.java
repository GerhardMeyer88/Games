package Advanced.Quiz;

import javax.swing.*;
import java.awt.*;

public class WelcomeWindow extends JFrame {
    public WelcomeWindow() {
        setTitle("Infrastruktur Quiz");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        final JTextArea welcomeLabel = getWelcomeLabel();

        JButton startButton = new JButton("Quiz starten");
        startButton.addActionListener(e -> {
            dispose();  // Schließt das Begrüßungsfenster
            startQuiz(); // Öffnet das Quiz-Fenster
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    private static JTextArea getWelcomeLabel() {
        JTextArea welcomeLabel = new JTextArea("""
                
                Willkommen zum Infrastruktur Quiz!

                Einige Fragen können mehrere richtige Antworten haben.
                Achte darauf, die korrekte Anzahl an Antworten zu wählen.
                Zu viele oder zu wenige ausgewählte Antworten führen dazu,
                dass die gesamte Frage als falsch beantwortet gilt.
                
                Weil diese Anwendung nur für Übungszwecke erstellt wurde,
                gibt es kein Zeitlimit.
                
                
                VIEL GLÜCK!""");

        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        welcomeLabel.setAlignmentX(JLabel.CENTER);
        return welcomeLabel;
    }

    private void startQuiz() {
        SwingUtilities.invokeLater(QuizApp::new);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomeWindow::new);
    }
}
