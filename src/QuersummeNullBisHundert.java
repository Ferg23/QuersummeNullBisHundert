public class QuersummeNullBisHundert {

    public static void main(String[] args) {

        zahlen(1, 100);
        
        for (int i = 1; i <= 100; i++) {


            if (primzahlen(i)) {

                if (primzahlen(berechneQuersumme(i))) {
                    System.out.println("Die Zahl " + i + " ist eine Primzahl " + "und dessen Quersumme ist " + berechneQuersumme(i) + " und es ist ebenfalls eine Primzahl.");
                }

            }
        }
    }

    public static int zahlen(int ersteZahl, int letzteZahl) {

        int qs = 0;

        for (int i = ersteZahl; i <= letzteZahl; i++) {

            qs = berechneQuersumme(i);
            System.out.println("Die Quersumme aus " + i + " ist " + qs);
        }
        return qs;
    }

    public static boolean primzahlen(int primzahlZahl) {

        boolean primzahl = true;

        for (int i = 2; primzahlZahl > i; i++) {
            if ((primzahlZahl % i) == 0) {
                primzahl = false;
            }

        }
        if (primzahl == true) {
            System.out.println(primzahlZahl + " ist eine Primzahl.");
        }

        return primzahl;
}


    public static int berechneQuersumme(int zahl) {
        int quersumme = 0;

        while (zahl > 0) {                         //Am Ende jeder eingegebenen Zahl wird 0 kommen
            int ziffer = zahl % 10;                //Wir lösen die letzte Ziffer
            quersumme = quersumme + ziffer;      //Addieren
            zahl = zahl / 10;                      //Damit die Ziffer die wir schon haben verschwindet
        }
        return quersumme;
    }
}

