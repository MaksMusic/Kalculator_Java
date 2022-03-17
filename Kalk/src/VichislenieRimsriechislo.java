import Exeption.NoArifmetik;
import Exeption.OtricatelnoeRimskoe;

public class VichislenieRimsriechislo extends Calculator {

    private String[] chasti;

    public VichislenieRimsriechislo(String[] chasti) {
        this.chasti = chasti;
    }

    public void rimskie() {
        int cislo1 = 0;
        int cislo2 = 0;
        for (Rimskie rimskie : Rimskie.values()) {
            if (chasti[0].equals(rimskie.name())) {
                cislo1 = rimskie.getCislo();

            }
            if (chasti[2].equals(rimskie.name())) {
                cislo2 = rimskie.getCislo();
            }
        }

        switch (chasti[1]) {
            case "+":
                sloghenie(cislo1, cislo2);
                break;
            case "-":
                vichitanie(cislo1, cislo2);
                break;
            case "*":
                ymoghenie(cislo1, cislo2);

                break;
            case "/":
                delenie(cislo1, cislo2);
                break;
            default:
                try {
                    throw new NoArifmetik();
                } catch (NoArifmetik e) {
                    e.printStackTrace();
                }
        }

    }

}