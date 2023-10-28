package garagePackage;


import java.util.*;

public class GarageMainApp { // fehlt noch die Eindeutigkeit der Etagen

    public static void main(String[] args) {

        List<String> Nummernschilder = new ArrayList<>();
        int[] plaetze = new int[3];
        String[] etage = {"a", "b", "c", "d"};
        HashMap<String, Integer> etagePlatz = new HashMap<>();
        boolean istDuplicate = false;

        int i = 0;
        while (i < 3) {

            /*---------------------------Nummernschild---Input--asd1234--------------------------------------*/

            // Nummerschild eingeben --> a
            Scanner neueNummerschild = new Scanner(System.in);
            System.out.println("Geben Sie die Buchstabe ihren Nummernschild ein (Beispiel asd1234)");

            String nummernschild = neueNummerschild.nextLine();
            System.out.println("Ihren Nummernschild ist: " + nummernschild);

            // eindeutigkeit der ZweiteBuchstabe --->
            if (Nummernschilder.contains(nummernschild)) {
                System.out.println("Die Eingabe ist dupliziert");
                continue;
            } else {
                Nummernschilder.add(nummernschild);
                System.out.println("Die Liste der Autos: " + Nummernschilder);
            }

            /*---------------------------Platz-----1-Auto--und--2--Motorrad--------------------------------------*/

            do {

                // array plaezte um platz zu speichern
                Scanner neuePlatz = new Scanner(System.in);
                System.out.println("Schreiben Sie ein 1 fuer Auto oder 2 fuer Motorrad: ");

                int neueWert = neuePlatz.nextInt();

                // Eindeutigkeit überprüfen

                for (int j = 0; j < plaetze.length; j++) {
                    if (plaetze[j] == neueWert & plaetze[j] < neueWert) { // < um zu vermeiden, in die gleiche Index zu
                        // speichern--> j=0 and neueWert=1
                        istDuplicate = true;
                        break;
                    }
                }

                // was zu machen wenn verdoppelte Wert oder speicher wenn Duplicate
                if (istDuplicate) {
                    System.out.println(
                            "Versuchen Sie nochmal ein Platz zu speichern, diese Zahl (Index is used) existiert schön");
                    for (int platz : plaetze) {
                        System.out.println("Das Array: " + platz);
                    }
                } else {
                    plaetze[i] = neueWert;
                    System.out.println("Erfolgreich gespeichert");

                }

            } while (istDuplicate);

            /*---------------------------Ausgabe--Zwischen--Array------------------------------------------*/

            // print array plaetze after Eindeutigkeit überprufen
            for (int platz : plaetze) {
                System.out.println("Das Array: " + platz);
            }

            System.out.println("Neue Array mit Buchstab und Platz: " + etagePlatz);

            /*---------------------------Etage---und--HashMap----------------------------------------*/

            // etagen char eingeben a - d Scanner Scanner neueEtage = new
            Scanner neueEtage = new Scanner(System.in);
            System.out.println("Geben Sie eine Etage Buchstab von --- a bis d ---- ein");

            String etageWert = neueEtage.nextLine();
            // System.out.println("Ihren Etage ist: " + etageWert);

            // wenn a--> die platz zu eine neue Array mit dem Wert der platz plus Buchstab
            // zuweisen.
            switch (etageWert.charAt(0)) {

                case 'a':

                    for (int z = 0; z < etage.length; z++) {
                        etagePlatz.put("Etage: " + etage[0] + " Nummernschild: " + nummernschild + " " + " Platz: ",
                                plaetze[i]); // String + String, integer
                    }
                    System.out.println("Neue Array mit Buchstab und Platz: " + etagePlatz);

                    break;

                case 'b':

                    for (int z = 0; z < etage.length; z++) {
                        etagePlatz.put("Etage: " + etage[1] + " Nummernschild: " + nummernschild + " " + " Platz: ",
                                plaetze[i]); // String + String, integer
                    }
                    System.out.println("Neue Array mit Buchstab und Platz: " + etagePlatz);

                    break;
                case 'c':

                    for (int z = 0; z < etage.length; z++) {
                        etagePlatz.put("Etage: " + etage[2] + " Nummernschild: " + nummernschild + " " + " Platz: ",
                                plaetze[i]); // String + String, integer
                    }
                    System.out.println("Neue Array mit Buchstab und Platz: " + etagePlatz);

                    break;
                case 'd':

                    for (int z = 0; z < etage.length; z++) {
                        etagePlatz.put("Etage: " + etage[3] + " Nummernschild: " + nummernschild + " " + " Platz: ",
                                plaetze[i]); // String + String, integer
                    }
                    System.out.println("Neue Array mit Buchstab und Platz: " + etagePlatz);

                    break;
                default:
                    System.out.println("Bitte eine Buchstab von a bis d auswählen");
            }

            /*---------------------------Ende-Switch------------------------------------------*/

            i++;

        } /*---------------------------Ende-While-------------------------------------------*/

        System.out.println("Die Garage ist Voll!");

    } /*---------------------------Ende-Main------------------------------------------*/

} /*---------------------------Ende-Klasse-------------------------------------------*/