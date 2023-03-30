
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        String pokracovat = "ano";

        ScitaniDoSta scitaniDoSta = new ScitaniDoSta();
        ScitaniDoTisice scitaniDoTisice = new ScitaniDoTisice();
        OdcitaniDoSta odcitaniDoSta = new OdcitaniDoSta();
        OdcitaniDoTisice odcitaniDoTisice = new OdcitaniDoTisice();
        NasobeniDoSta nasobeniDoSta = new NasobeniDoSta();
        NasobeniDoTisice nasobeniDoTisice = new NasobeniDoTisice();
        DeleniDoSta deleniDoSta = new DeleniDoSta();
        DeleniDoMega deleniDoMega = new DeleniDoMega();

        System.out.println("--- Náhodné generování příkladů pro žáky a s výsledkem pro učitele ---");

        while (pokracovat.equalsIgnoreCase("ano")){
            System.out.println("Zvol si druh příkladů od 1 - 8:\n");
            System.out.println("1-Sčítání  (Obě čísla jsou dvouciferné)");
            System.out.println("2-Sčítání  (Obě čísla jsou trojciferné)");
            System.out.println();
            System.out.println("3-Odčítání (Obě čísla jsou dvouciferné)");
            System.out.println("4-Odčítání (Obě čísla jsou trojciferné)");
            System.out.println();
            System.out.println("5-Násobení (Obě čísla jsou dvouciferné)");
            System.out.println("6-Násobení (Obě čísla jsou trojciferné)");
            System.out.println();
            System.out.println("7-Dělení   (Obě čísla jsou dvouciferné a jsou zaokrouhlena na 6 desetinných míst)");
            System.out.println("8-Dělení   (První číslo je pěticiferné a druhé dvojciferné jsou zaokrouhlena na 2 desetinné místa)");

            int volba = Integer.parseInt(sc.nextLine());

            switch (volba) {
                case 1:
                    scitaniDoSta.vypis();
                    break;
                case 2:
                    scitaniDoTisice.vypis();
                    break;
                case 3:
                    odcitaniDoSta.vypis();
                    break;
                case 4:
                    odcitaniDoTisice.vypis();
                    break;
                case 5:
                    nasobeniDoSta.vypis();
                    break;
                case 6:
                    nasobeniDoTisice.vypis();
                    break;
                case 7:
                    deleniDoSta.vypis();
                    break;
                case 8:
                    deleniDoMega.vypis();
                    break;
            }

            if ((volba > 0) && (volba < 9)) {
                System.out.println();
            } else {
                System.out.println("Neplatná volba");
            }
            System.out.println("Chcete vygenerovat nové příklady ? (ano/ne)");
            pokracovat = sc.nextLine();
        }
        System.out.println("Děkuji za použití aplikace");

    }
}

