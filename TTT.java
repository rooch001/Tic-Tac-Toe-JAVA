
import java.util.Scanner;

class TTT {

    // Array to hold the X or O in each space (Default value: '_')
    public static char[] place = {'_', '_', '_', '_', '_', '_', '_', '_', '_'};

    // Holds X or O, whichever team user chooses
    public static char team = '_';

    // Holds X or O, whichever team user does NOT choose!
    public static char opp = '_';

    // Variable to hold user input for Scanner
    public static String usrStr;

    public static void main(String[] args) {

        // Greeting message for user
        System.out.println("WELCOME TO TIC TAC TOE!");

        // Run the setup method
        setup();

    }

    public static void drawBoard() {

        // Draw the game board
        System.out.println("\n\t    A   B   C");
        System.out.println("\t  .-----------.");
        System.out.println("\t1 |_" + TTT.place[0] + "_|_" + TTT.place[1] + "_|_" + TTT.place[2] + "_|\n");
        System.out.println("\t2 |_" + TTT.place[3] + "_|_" + TTT.place[4] + "_|_" + TTT.place[5] + "_|\n");
        System.out.println("\t3 |_" + TTT.place[6] + "_|_" + TTT.place[7] + "_|_" + TTT.place[8] + "_|");
        System.out.println("\t  '-----------'");

    }

    public static void setup() {

        // Loop to reset the game board
        for (int i = 0; i < 9; i++) {

            TTT.place[i] = '_';

        }

        // Print the game board to the console
        drawBoard();

        while ((TTT.team != 'X') && (TTT.team != 'O')) {

            System.out.println("\n\nSelect Your Team! Enter 'X' or 'O' below...");

            System.out.print("Enter your selection: ");
            Scanner input = new Scanner(System.in);
            TTT.usrStr = input.next();

            if (TTT.usrStr.toUpperCase().equals("X")) {

                TTT.team = 'X';
                TTT.opp = 'O';

            } else if (TTT.usrStr.toUpperCase().equals("O")) {

                TTT.team = 'O';
                TTT.opp = 'X';

            } else {

                System.out.println("You entered: " + usrStr);
                System.out.println("This is not a valid option.");
                System.out.println("Please enter either an X or an O to continue.");

            }

        }

        System.out.println("\nYou are team " + TTT.team + "!");

        // Run the game method
        game();

    }

    public static void game() {

        // Local variable to run loop
        boolean loop = true;

        System.out.println("IT'S YOUR TURN!");

        drawBoard();

        do {

            System.out.println("\n\nChoose a column and row to place an " + TTT.team + ". (EXAMPLE: A1)\n");

            System.out.print("Enter your selction: ");
            Scanner input = new Scanner(System.in);
            TTT.usrStr = input.next().toUpperCase();

            switch (TTT.usrStr) {
                case "A1":
                    if (TTT.place[0] == '_') {

                        TTT.place[0] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in A1");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[0] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[0] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "B1":
                    if (TTT.place[1] == '_') {

                        TTT.place[1] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in B1");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[1] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[1] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "C1":
                    if (TTT.place[2] == '_') {

                        TTT.place[2] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in C1");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[2] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[2] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "A2":
                    if (TTT.place[3] == '_') {

                        TTT.place[3] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in A2");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[3] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[3] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "B2":
                    if (TTT.place[4] == '_') {

                        TTT.place[4] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in B2");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[4] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[4] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "C2":
                    if (TTT.place[5] == '_') {

                        TTT.place[5] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in C2");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[5] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[5] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "A3":
                    if (TTT.place[6] == '_') {

                        TTT.place[6] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in A3");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[6] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[6] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "B3":
                    if (TTT.place[7] == '_') {

                        TTT.place[7] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in B3");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[7] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[7] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;

                case "C3":
                    if (TTT.place[8] == '_') {

                        TTT.place[8] = TTT.team;
                        System.out.println("\nYou place an " + TTT.team + " in C3");
                        oppMove();
                        loop = false;

                    } else if (TTT.place[8] == TTT.team) {

                        System.out.println("\nThere is an " + TTT.team + " there already!");

                    } else if (TTT.place[8] == TTT.opp) {

                        System.out.println("\nThis space is already taken!");

                    }
                    ;
                    break;
            }

        } while (loop);

        checkWin();

    }

    public static void oppMove() {

        while (true) {

            if ((TTT.place[0] == '_') || (TTT.place[1] == '_') || (TTT.place[2] == '_') || (TTT.place[3] == '_') || (TTT.place[4] == '_') || (TTT.place[5] == '_') || (TTT.place[6] == '_') || (TTT.place[7] == '_') || (TTT.place[8] == '_')) {

                float rn = (float) Math.random();
                float m = rn * 8;
                int x = Math.round(m);

                if (TTT.place[x] == '_') {

                    TTT.place[x] = TTT.opp;
                    break;

                }

            } else {
                checkWin();
                break;
            }

        }

    }

    public static void checkWin() {

        // See if X has won the game
        if ((TTT.place[0] == 'X') && (TTT.place[1] == 'X') && (TTT.place[2] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[3] == 'X') && (TTT.place[4] == 'X') && (TTT.place[5] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[6] == 'X') && (TTT.place[7] == 'X') && (TTT.place[8] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[0] == 'X') && (TTT.place[3] == 'X') && (TTT.place[6] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[1] == 'X') && (TTT.place[4] == 'X') && (TTT.place[7] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[2] == 'X') && (TTT.place[5] == 'X') && (TTT.place[8] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[0] == 'X') && (TTT.place[4] == 'X') && (TTT.place[8] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[6] == 'X') && (TTT.place[4] == 'X') && (TTT.place[2] == 'X')) {

            System.out.println("\n\n\n\tX WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");
        }

        // Now, see if O has won!
        if ((TTT.place[0] == 'O') && (TTT.place[1] == 'O') && (TTT.place[2] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[3] == 'O') && (TTT.place[4] == 'O') && (TTT.place[5] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[6] == 'O') && (TTT.place[7] == 'O') && (TTT.place[8] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[0] == 'O') && (TTT.place[3] == 'O') && (TTT.place[6] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[1] == 'O') && (TTT.place[4] == 'O') && (TTT.place[7] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[2] == 'O') && (TTT.place[5] == 'O') && (TTT.place[8] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[0] == 'O') && (TTT.place[4] == 'O') && (TTT.place[8] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

        } else if ((TTT.place[6] == 'O') && (TTT.place[4] == 'O') && (TTT.place[2] == 'O')) {

            System.out.println("\n\n\n\tO WINS!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

            // Check for a tie!
        } else if ((TTT.place[0] != '_') && (TTT.place[1] != '_') && (TTT.place[2] != '_') && (TTT.place[3] != '_') && (TTT.place[4] != '_') && (TTT.place[5] != '_') && (TTT.place[6] != '_') && (TTT.place[7] != '_') && (TTT.place[8] != '_')) {

            System.out.println("\n\n\n\tTIE GAME!!!!");
            drawBoard();
            playAgain();
            System.out.println("\n\n");

            // If no one has won and no tie, keep playing!!
        } else {
            game();
        }

    }

    public static void playAgain() {

        System.out.print("\n\nPlay again? [y/n]: ");
        Scanner input = new Scanner(System.in);
        TTT.usrStr = input.next().toLowerCase();

        if (usrStr.equals("y")) {

            TTT.team = '_';
            TTT.opp = '_';
            setup();

        } else {

            System.exit(0);

        }

    }

}
