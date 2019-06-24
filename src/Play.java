import java.util.InputMismatchException;
import java.util.Scanner;

public class Play {

    public int play(int arrayLenght) {

        int a = -1;
        do {
            System.out.print("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            try {
                a = sc.nextInt();
            } catch (InputMismatchException e) {}

        } while (a<0 || a>=arrayLenght);

        return a;
    }
}
