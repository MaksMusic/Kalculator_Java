import java.util.Scanner;

public class Calculator {

    private StrokaVvoda strokaVvoda = new StrokaVvoda();

    public void start() {
        strokaVvoda.proverka();
    }

    public void sloghenie(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void ymoghenie(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void vichitanie(int n1, int n2) {
        System.out.println(n1 - n2);
    }

    public void delenie(int n1, int n2) {
        System.out.println(n1 / n2);
    }

}
