import java.util.List;
import java.util.Scanner;

public class NasobeniDoTisice {

    public void vypis(){
        Scanner sc = new Scanner(System.in, "UTF-8");

        GenerovaniPrikladu generovaniPrikladu = new GenerovaniPrikladu();

        System.out.println("Kolik chcete vygenerovat příkladu pro násobení ? (Od 1 do 100)");
        int pocet = Integer.parseInt(sc.nextLine());
            if((pocet>0) && (pocet<101)) {
                generovaniPrikladu.vygenerujPrikladyTriciferne(pocet, "*");

                System.out.println("Příklady pro žáky :");
                List<Priklad> prikladyProZaky = generovaniPrikladu.proZaky();
                for (Priklad priklad : prikladyProZaky) {
                    System.out.println(priklad.getPrvniCislo() +" "+  priklad.getZnamenko() + " "+  priklad.getDruheCislo() + " =");

                }
                System.out.println();

                System.out.println("Příklady pro učitele s výsledkem :");
                List<Priklad> prikladyProUcitele = generovaniPrikladu.proUciteleNasobeni();
                for (Priklad priklad : prikladyProUcitele) {
                    System.out.println(priklad.getPrvniCislo() +" "+ priklad.getZnamenko() +" "+ priklad.getDruheCislo() + " = " + priklad.getVysledek());

                }

            }
            else
                System.out.println("Zadal si počet příkladu mimo toleranci");



    }
}
