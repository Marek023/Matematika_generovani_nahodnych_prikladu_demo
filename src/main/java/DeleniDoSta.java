import java.util.List;
import java.util.Scanner;

public class DeleniDoSta {

    public void vypis () {
        Scanner sc = new Scanner(System.in, "UTF-8");

        GenerovaniPrikladu generovaniPrikladu = new GenerovaniPrikladu();

        System.out.println("Kolik chcete vygenerovat příkladu pro dělení ? (Od 1 do 100)");
        int pocet = Integer.parseInt(sc.nextLine());
        if((pocet>0) && (pocet<101)) {
            generovaniPrikladu.vygenerujPrikladyDoStaBezNuly(pocet, ":");

            System.out.println("Příklady pro žáky :");
            List<Priklad> prikladyProZaky = generovaniPrikladu.proZaky();
            for (Priklad priklad : prikladyProZaky) {
                System.out.println(priklad.getPrvniCislo() + " " + priklad.getZnamenko() + " " + priklad.getDruheCislo() + " =");

            }
            System.out.println();

            System.out.println("Příklady pro učitele s výsledkem.\nČísla jsou zaokrouhlena na 6 desetinných míst:");
            List<Priklad> prikladyProUcitele = generovaniPrikladu.proUciteleDeleniZaokrouhlenoNaSestMist();
            for (Priklad priklad : prikladyProUcitele) {
                System.out.println(priklad.getPrvniCislo() + " " + priklad.getZnamenko() + " " + priklad.getDruheCislo() + " = " + priklad.getVysleddekProDeleni());

            }
        }
        else
            System.out.println("Zadal si počet příkladu mimo toleranci");
    }
}
