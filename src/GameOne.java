import java.util.Random;
import java.util.Scanner;

public class GameOne {

    public static void main (String[] args){

        boolean playAgain;
        int x = 7; // must be greater than 2
        Field[] game = new Field[x];

        // menu
        do {

            // init game
            for (int i = 0; i < x; i++) {
                game[i] = new Field(false);
            }
            Random random = new Random();
            int a = random.nextInt(x - 1);
            int b = a + 1;
            game[a].setFlag(true);
            game[b].setFlag(true);

            // check game status
            int y = 0;
            while (y < 2) {

                Play doIt = new Play();
                int z = doIt.play(x);

                if (game[z].getFlag()) {
                    System.out.println("HIT");
                    game[z].setFlag(false);
                    y++;
                } else {
                    System.out.println("miss");
                }
            }

            // play once again
            playAgain = onceAgain();

        } while (playAgain);
    }

    private static boolean onceAgain(){
        System.out.print("Once again? (y/n): ");
        Scanner scanner = new Scanner(System.in);
        String valid = scanner.next();
        return (valid.equalsIgnoreCase("y"));
    }

}
