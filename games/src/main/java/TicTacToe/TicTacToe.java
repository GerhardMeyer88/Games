package Advanced.Spiele;

import java.util.Scanner;

public class TicTacToe{
    private static char aktuellerSpieler = 'X';

    public static void main(String[] args) {
        char[][] spielfeld = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean spielBeendet = false;

        while (!spielBeendet) {
            // Spielfeld anzeigen
            printSpielfeld(spielfeld);

            // Zug des aktuellen Spielers
            int[] zug = spielerZug();
            int zeile = zug[0];
            int spalte = zug[1];

            // Überprüfung des Zugs und Aktualisierung des Spielfelds
            if (istZugGueltig(spielfeld, zeile, spalte)) {
                spielfeld[zeile][spalte] = aktuellerSpieler;

                // Überprüfen, ob der aktuelle Spieler gewonnen hat
                if (hatGewonnen(spielfeld, aktuellerSpieler)) {
                    printSpielfeld(spielfeld);
                    System.out.println("Spieler " + aktuellerSpieler + " hat gewonnen!");
                    spielBeendet = true;
                } else if (istUnentschieden(spielfeld)) {
                    printSpielfeld(spielfeld);
                    System.out.println("Unentschieden!");
                    spielBeendet = true;
                } else {
                    // Spieler wechseln
                    aktuellerSpieler = (aktuellerSpieler == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Ungültiger Zug. Bitte erneut versuchen.");
            }
        }
    }

        // Spielfeld anzeigen
        private static void printSpielfeld(char[][] spielfeld) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(spielfeld[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---------");
                }
            }
            System.out.println();
        }

        // Spielerzug einlesen
        private static int[] spielerZug() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Spieler " + aktuellerSpieler +
                    ", gib deine Zugkoordinaten ein " +
                    "(Zeile 0-2 und Spalte 0-2 von links Oben getrennt durch Leerzeichen): ");
            int zeile = scanner.nextInt();
            int spalte = scanner.nextInt();
            return new int[]{zeile, spalte};
        }

        // Überprüfen, ob der Zug gültig ist
        private static boolean istZugGueltig(char[][] spielfeld, int zeile, int spalte) {
            return zeile >= 0 && zeile < 3 && spalte >= 0 && spalte < 3 && spielfeld[zeile][spalte] == ' ';
        }

        // Überprüfen, ob der aktuelle Spieler gewonnen hat
        private static boolean hatGewonnen(char[][] spielfeld, char spieler) {
            // Überprüfung der Zeilen und Spalten
            for (int i = 0; i < 3; i++) {
                if ((spielfeld[i][0] == spieler && spielfeld[i][1] == spieler && spielfeld[i][2] == spieler) ||
                        (spielfeld[0][i] == spieler && spielfeld[1][i] == spieler && spielfeld[2][i] == spieler)) {
                    return true;
                }
            }

            // Überprüfung der Diagonalen
            return (spielfeld[0][0] == spieler && spielfeld[1][1] == spieler && spielfeld[2][2] == spieler) ||
                    (spielfeld[0][2] == spieler && spielfeld[1][1] == spieler && spielfeld[2][0] == spieler);
        }

        // Überprüfen, ob das Spielfeld unentschieden ist
        private static boolean istUnentschieden(char[][] spielfeld) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (spielfeld[i][j] == ' ') {
                        return false; // Es gibt noch leere Felder
                    }
                }
            }
            return true; // Alle Felder sind belegt, es ist unentschieden
    }
}


