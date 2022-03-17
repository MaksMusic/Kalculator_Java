import Exeption.ArabskieOtricatelnii;
import Exeption.BolshoeChislo;
import Exeption.NoArifmetik;

public class ArabskieChisla extends Calculator {
    private  String n;
    private  int n1;
    private int n2;

    public ArabskieChisla(String[] chasti){
        try {
            n1 = Integer.parseInt(chasti[0]);
            n2 = Integer.parseInt(chasti[2]);
        }catch (NumberFormatException e){
            System.out.println("Введите корректные числа");
            System.exit(0);
        }
        n = chasti[1];
        if (n1<1 || n2 <1){
            try {
                throw new ArabskieOtricatelnii();
            } catch (ArabskieOtricatelnii e) {
                e.printStackTrace();
            }

        }

    }

    public void vichislenia() {

        if (n1 >= 10) {
            try {
                throw new BolshoeChislo();
            } catch (BolshoeChislo e) {
                e.printStackTrace();

            }
        }

        if (n2 >= 10) {
            try {
                throw new BolshoeChislo();
            } catch (BolshoeChislo e) {
                e.printStackTrace();

            }

        }

        switch (n) {
            case "+":
                sloghenie(n1,n2);
                break;
            case "-":
                vichitanie(n1,n2);
                break;
            case "*":
                ymoghenie(n1,n2);
                break;
            case "/":
                delenie(n1,n2);
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