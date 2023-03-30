import java.util.ArrayList;
import java.util.List;

public class GenerovaniPrikladu {

    List<Priklad> priklady = new ArrayList<>();
    GenerovaniCisel cisla = new GenerovaniCisel();

        public void vygenerujPriklady (int pocet,String znamenko){
            for (int i= 0; i < pocet; i++) {
                Priklad priklad = new Priklad(cisla.doSta(), cisla.doSta(),znamenko);
                priklady.add(priklad);
            }
        }

    public void vygenerujPrikladyDoStaBezNuly (int pocet,String znamenko){
        for (int i= 0; i < pocet; i++) {
            Priklad priklad = new Priklad(cisla.doStaProDeleniBezNuly(), cisla.doStaProDeleniBezNuly(),znamenko);
            priklady.add(priklad);
        }
    }

    public void vygenerujPrikladyTriciferne (int pocet,String znamenko){
        for (int i= 0; i < pocet; i++) {
            Priklad priklad = new Priklad(cisla.doTisice(), cisla.doTisice(),znamenko);
            priklady.add(priklad);
        }
    }

        public void vygenerujPrikladProVelkeDeleni(int pocet, String znamenko){
            for (int i= 0; i < pocet; i++) {
                Priklad priklad = new Priklad(cisla.odTisiceDoMega(),cisla.doSta(),znamenko);
                priklady.add(priklad);
            }
        }

        public List<Priklad> proZaky(){
            return priklady;
        }
        public List<Priklad> proUciteleScitani(){
            for (Priklad priklad : priklady) {
                priklad.setVysledek(priklad.getPrvniCislo()+priklad.getDruheCislo());
            }
         return priklady;
        }
    public List<Priklad> proUciteleOdcitani(){
        for (Priklad priklad : priklady) {
            priklad.setVysledek(priklad.getPrvniCislo()-priklad.getDruheCislo());
        }
        return priklady;
    }

    public List<Priklad> proUciteleNasobeni(){
        for (Priklad priklad : priklady) {
            priklad.setVysledek(priklad.getPrvniCislo()*priklad.getDruheCislo());
        }
        return priklady;
    }

    public List<Priklad> proUciteleDeleniZaokrouhlenoNaSestMist(){
        for (Priklad priklad : priklady) {
            double getPrvni = priklad.getPrvniCislo();
            double getDruhe = priklad.getDruheCislo();
            double vysledek = getPrvni /  getDruhe;
            vysledek = Math.ceil(vysledek * 1000000d) / 1000000d;
            priklad.setVysleddekProDeleni(vysledek);

        }
        return priklady;
    }

    public List<Priklad> proUciteleVelkeDeleniZaokrouhlenoNaDveMista(){
        for (Priklad priklad : priklady) {
            double getPrvni = priklad.getPrvniCislo();
            double getDruhe = priklad.getDruheCislo();
            double vysledek = getPrvni / getDruhe;
            vysledek = Math.ceil(vysledek * 100d) / 100d;
            priklad.setVysleddekProDeleni(vysledek);
        }
        return priklady;
    }
}
