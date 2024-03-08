package Advanced.Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QuizApp extends JFrame {
    private JTextArea questionTextArea;
    private JCheckBox[] answerCheckboxes;
    private final List<Integer> incorrectQuestionIndices = new ArrayList<>();
    private final String[] questions = {
            "01. Welche Protokolle kennst du?",
            "02. Welche Trägermedien (\"geführte Übertragungsmedien\") gibt es?",
            "03. Was sind Netzwerkgeräte?",
            "04. Mit welchem Windows CMD Befehl kann ein DNS Server abgefragt werden?",
            "05. Was bewirkt der Linux-Terminalbefehl 'traceroute'?",
            "06. Nenne die vierte OSI-Layer-Schicht!",
            "07. Welche Topologien kennst du?",
            "08. Welche Aussage trifft auf das TCP Transmission Control Protocol zu?",
            "09. Eine IP + Port nennt man:",
            "10. Wofür steht der Begriff 'MTU'?",
            "11. Einfach ausgedrückt: Was macht eine SYN-Flag?",
            "12. Welche Aufgabe übernimmt das CSMA/CA Protokoll?",
            "13. Nenne die fünfte Osi-Layer-Schicht!",
            "14. Was ist TTL?",
            "15. Nenne die erste Osi-Layer-Schicht!",
            "16. Nenne die zweite Osi-Layer-Schicht!",
            "17. Nenne die dritte Osi-Layer-Schicht!",
            "18. Nenne die sechste Osi-Layer-Schicht!",
            "19. Nenne die siebente Osi-Layer-Schicht!",
            "20. Benenne mögliche Antworten einer SYN-Flag!",
            "21. Merkmale einer BUS-Topologie",
            "22. Merkmale einer STERN-Topologie",
            "23. Merkmale eines vermaschten Netzwerkes",
            "24. Auf welchem OSI-Layer arbeitet ein HUB?",
            "25. Was trifft auf einen Switch zu?",
            "26. Was trifft auf einen Router zu?",
            "27. Nenne eigenschaften von UDP!",
            "28. IT-Security, Grundlegende Angriffskategorien sind:",
            "29. Berechne NETZ-Adresse, BROADCAST-Adresse, SUBNETZMASKE und Hostanzahl der IP 103.174.156.178/15",
            "30. Berechne NETZ-Adresse, BROADCAST-Adresse, SUBNETZMASKE und Hostanzahl der IP 223.150.25.1/23",

    };
    private final String[][] answers = {
            {"KPL", "TCP  ", "UDP  ", "DNA"},

            {"Twisetd-Pair Kabel  ", "Glasfaserkabel   ", "Koaxialkabel  ", "WLAN-Kabel"},

            {"HUB  ", "SUB", "Twitch", "Switch  "},

            {"netsh", "getdns", "nslookup  ", "tracert"},

            {"Anzeigen und Konfiguration von Netzwerkgeräten", "Routenverfolgung und Verbindungsanalyse  ",
                    "Werkzeug für WLAN-Schnittstellen", "Der Befehl bewirkt nichts"},

            {"Transportschicht oder Transport Layer  ", "Vermittlungsschicht oder Network Layer",
                    "Sitzungsschicht oder Session Layer", "Sicherungsschicht oder Data Link Layer"},

            {"BUS  ", "BAHN", "RING  ", "RAD"},

            {"Ist ein verbindungsloses Protokoll", "Ist ein verbindungsorientiertes Protokoll  ",
                    "Garantiert eine zuverlässige Verbindung über ein unzuverlässiges Netzwerk  ",
                    "Wird generell für gaming genutzt"},

            {"Rocket", "Pocket", "Socket  ", "Hat keine Bezeichnung"},

            {"Master Transport Unit", "Most Transmission Upload",
                    "Missed Transport Unit", "Maximum Transmission Unit  "},

            {"Eine Anfrage zur Kommunikation  ", "Eine Ablehnung zum Kommunikationsaufbau",
                    "Ein SYN-Flag gibt es nicht", "Die Antwort einer Kommunikations-Anfrage"},

            {"WTF, den bullshit gibts doch gar ned",
                    "Ein Backup vom RAM-Speicher, wenn das Gerät plötzlich ausfällt",
                    "Kollisionsvermeidung auf einem Übertragungskanal  ",
                    "Ist für die grafische Oberfläche eines Browsers verantwortlich"},

            {"Vermittlungsschicht oder Network Layer","Bitübertragungsschicht oder Physical Layer",
                    "Sicherungsschicht oder Data Link Layer", "Sitzungsschicht oder Session Layer  "},

            {"Time to Lose: Legt fest, dass du deine Verbindung verlierst.",
                    "Transport to Limit: Legt die Übertragungsgeschwindigkeit fest.",
                    "Transmission Timer Legacy: Ist die größe der Einheit, die übermittelt wird.",
                    "Time to Live: Legt fest, wie viele \"Hops\" das Paket überleben darf  "},

            {"Bitübertragungsschicht oder Physical Layer  ", "Sicherungsschicht oder Data Link Layer",
                    "Vermittlungsschicht oder Network Layer", "Anfangsschicht oder Simple Layer"},

            {"Vermittlungsschicht oder Network Layer","Bitübertragungsschicht oder Physical Layer",
                    "Sicherungsschicht oder Data Link Layer  ", "Fuckingschicht, was weiß ich!"},

            {"Vermittlungsschicht oder Network Layer  ","Bitübertragungsschicht oder Physical Layer",
                    "Sicherungsschicht oder Data Link Layer", "Sitzungsschicht oder Session Layer"},

            {"Vermittlungsschicht oder Network Layer","Bitübertragungsschicht oder Physical Layer",
                    "Darstellungsschicht oder Presentation Layer  ", "Sitzungsschicht oder Session Layer"},

            {"Anwendungsschicht oder Application Layer  ","Bitübertragungsschicht oder Physical Layer",
                    "Darstellungsschicht oder Presentation Layer", "Sitzungsschicht oder Session Layer"},

            {"Eine RST-Flag für Reset  ", "Eine SYN-ACK-Flag für die Bestätigung des Verbindugsaufbaus  ",
                    "Eine RES-Flag für Resist", "Eine NAC-Flag für die Verbindungsablehnung"},

            {"Mehrere gemeinsame Übertragungsleitungen", "Stationen sind hintereinander geschaltet  ",
                    "Daten erreichen nur eine Station",
                    "Trennung der Hauptleitung ist kein Hindernis, weil mehrere Übertragungsleitungen verwendet werden"},

            {"Fünf Stationen verbinden alle Rechner", "Eine zentrale Station verbindet alle Rechner  ",
                    "Eine Leitung verbindet alles zu einem Stern", "Jeder hat eine eigene Leitung  "},

            {"Vermaschte Netzwerke gibt es nicht", "Ist ein dezentrales Netzwerk  ",
                    "Bei Ausfall einer Verbindung, gibt es meist alternative Routen  ",
                    "Keine verbindlichen Strukturen  "},

            {"Bitübertragungsschicht oder Physical Layer  ", "Vermittlungsschicht oder Network Layer",
                    "Sicherungsschicht oder Data Link Layer", "Was ist ein HUB?"},

            {"Arbeitet in der Sicherungsschicht oder Data Link Layer  ",
                    "Nimmt Datenpakete entgegen und sendet diese an ALLE Ports (broadcast)",
                    "Arbeitet in der Bitübertragungsschicht oder Physical Layer",
                    "Verbindet Stationen in einem Netzwerk"},

            {"Arbeitet in der Sicherungsschicht oder Data Link Layer",
                    "Arbeitet in der Vermittlungsschicht oder Network Layer  ",
                    "Wählt die ideale Route der Verbindung  ", "Kann keine Route ermitteln"},

            {"Arbeitet in der Sicherungsschicht oder Data Link Layer",
                    "Arbeitet in der Transportschicht oder Transport Layer  ",
                    "Besitzt keine Datenflusskontrolle  ", "Hat nichts mit der IT zu tun"},

            {"Inploid, Goofing, Man outside the Box, Code-Vaccinate, Every-Week-Enrich",
                    "Man outside the Box, Exclude, Briefing, Synchro Escalation",
                    "Code-Injection, Man in the Middle, Zero-Day-Exploit  ",
                    "Exploid, Priviledge Escalation, Spoofing  "},

            {"Die NETZ-Adresse = 103.174.156.178 BROADCAST = 103.175.255.255 SUBNETZMASKE = 255.255.255.0/15 Hosts = 512",
                    "Die NETZ-Adresse = 103.174.156.0 BROADCAST = 103.175.156.255 SUBNETZMASKE = 255.255.0.0/15 Hosts = 65536",
                    "Die NETZ-Adresse = 103.174.0.0 BROADCAST = 103.175.255.255 SUBNETZMASKE = 255.254.0.0/15 Hosts = 131070  ",
                    "Die NETZ-Adresse = 103.174.0.0 BROADCAST = 103.255.255.255 SUBNETZMASKE = 255.254.0.0/15 Hosts = 131070"},

            {"Die NETZ-Adresse = 223.0.0.0 BROADCAST = 223.150.25.255 SUBNETZMASKE = 255.255.254.0/23 Hosts = 510",
                    "Die NETZ-Adresse = 223.150.25.0 BROADCAST = 223.150.25.255 SUBNETZMASKE = 255.255.254.0/20 Hosts = 510  ",
                    "Die NETZ-Adresse = 223.150.0.0 BROADCAST = 225.150.255.255 SUBNETZMASKE = 255.255.0.0/20 Hosts = 2046",
                    "Die NETZ-Adresse = 223.150.25.1 BROADCAST = 223.150.25.255 SUBNETZMASKE = 255.254.0.0/20 Hosts = 4094"},
            };
    private int currentQuestionIndex = 0;
    int incorrectAnswers = 0;
    int countCorrectAnswers = 0;

    public QuizApp() {
        setTitle("Infrastruktur Quiz");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        createGUI();
        setVisible(true);
    }
    private void createGUI() {
        setLayout(new BorderLayout());

       questionTextArea = new JTextArea(questions[currentQuestionIndex]);
       questionTextArea.setEditable(false);
       questionTextArea.setLineWrap(true);
       questionTextArea.setWrapStyleWord(true);
       questionTextArea.setFont(new Font("Arial Black", Font.PLAIN, 16));
       questionTextArea.setRows(4);

       JScrollPane questionScrollPane = new JScrollPane(questionTextArea);
       add(questionScrollPane, BorderLayout.NORTH);

        answerCheckboxes = new JCheckBox[4];
        JPanel answersPanel = new JPanel();
        answersPanel.setLayout(new BoxLayout(answersPanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < 4; i++) {
            answerCheckboxes[i] = new JCheckBox(answers[currentQuestionIndex][i]);
            answersPanel.add(answerCheckboxes[i]);
        }
        add(answersPanel, BorderLayout.CENTER);

        JButton nextButton = new JButton("Nächste Frage");
        nextButton.addActionListener(e -> checkAnswer());
        add(nextButton, BorderLayout.SOUTH);
    }
    private void checkAnswer() {
        boolean anySelected = false;
        boolean[] selectedAnswers = new boolean[4];
        for (int i = 0; i < 4; i++) {
            selectedAnswers[i] = answerCheckboxes[i].isSelected();
            anySelected = anySelected || selectedAnswers[i];
        }
        if (!anySelected) {
            JOptionPane.showMessageDialog(this, "Glaubst du wirklich," +
                    "dass nichts korrekt ist? Wähle etwas aus!");
            return;
        }
        boolean[] correctAnswers = getCorrectAnswers(currentQuestionIndex);

        boolean isCorrect = checkArraysEqual(selectedAnswers, correctAnswers);

        //if is correct count +1, else count incorrect +1
        if (isCorrect) {
            countCorrectAnswers++;
        } else {
            incorrectAnswers++;
            incorrectQuestionIndices.add(currentQuestionIndex);
        }
        if (currentQuestionIndex < questions.length - 1) {
            // Load the next question
            currentQuestionIndex++;
            questionTextArea.setText(questions[currentQuestionIndex]);
            for (int i = 0; i < 4; i++) {
                answerCheckboxes[i].setText(answers[currentQuestionIndex][i]);
                answerCheckboxes[i].setSelected(false);
            }
        } else {
            // Display results
            displayResults();
        }
    }
    private boolean[] getCorrectAnswers(int index) {
        boolean[] correctAnswers = new boolean[4];
        for (int i = 0; i < 4; i++) {
            correctAnswers[i] = answers[index][i].endsWith("  ");
        }
        return correctAnswers;
    }
    private boolean checkArraysEqual(boolean[] arr1, boolean[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    private void displayResults() {

        StringBuilder resultMessage = new StringBuilder("Quiz beendet. \nRichtig Beantwortet: " + countCorrectAnswers +
                "\nFalsch Beantwortet: " + incorrectAnswers);

        if (!incorrectQuestionIndices.isEmpty()) {
            resultMessage.append("\nFalsch beantwortete Fragen: ");
            for (int index : incorrectQuestionIndices) {
                resultMessage.append("\nFrage ").append(": ").append(questions[index]);
            }
        }
        JOptionPane.showMessageDialog(this, resultMessage.toString());
        System.exit(0);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(QuizApp::new);
    }
}
