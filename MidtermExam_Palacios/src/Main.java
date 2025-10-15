import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Notes: 3 Stacks as said
        CardStack deck = new CardStack();
        CardStack hand = new CardStack();
        CardStack discard = new CardStack();
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // Parts of the Project: 2 - Player Deck (30 cards named with TFT Champion names :D)
        deck.push(new Card("Ahri", 90));
        deck.push(new Card("Yasuo", 85));
        deck.push(new Card("Sett", 80));
        deck.push(new Card("Jinx", 95));
        deck.push(new Card("Ezreal", 88));
        deck.push(new Card("Jhin", 92));
        deck.push(new Card("Lux", 87));
        deck.push(new Card("Akali", 93));
        deck.push(new Card("Shen", 84));
        deck.push(new Card("Kai'Sa", 89));
        deck.push(new Card("Lee Sin", 91));
        deck.push(new Card("Morgana", 86));
        deck.push(new Card("Viego", 90));
        deck.push(new Card("Aphelios", 87));
        deck.push(new Card("Soraka", 85));
        deck.push(new Card("Thresh", 88));
        deck.push(new Card("Katarina", 92));
        deck.push(new Card("Aatrox", 90));
        deck.push(new Card("Fiora", 89));
        deck.push(new Card("Warwick", 86));
        deck.push(new Card("Zed", 93));
        deck.push(new Card("Garen", 88));
        deck.push(new Card("Ashe", 87));
        deck.push(new Card("Volibear", 85));
        deck.push(new Card("Ornn", 84));
        deck.push(new Card("Swain", 86));
        deck.push(new Card("Sona", 88));
        deck.push(new Card("Yone", 91));
        deck.push(new Card("Talon", 89));
        deck.push(new Card("Riven", 90));

        //Intro
        System.out.println("TFT Champions Card Selection");
        System.out.print("Press ENTER to start...");
        scanner.nextLine();

        //Parts of the Project: 1 - Turns (Commands given random)
        while (!deck.isEmpty()) {
            int command = rand.nextInt(3); //random command: 0 = draw 1 = discard 2 = get from discard
            int x = rand.nextInt(5) + 1; //so that x is random value 1-5

            if (command == 0) { //Draw x cards
                System.out.println("\nCommand: Draw " + x + " card(s)");
                for (int i = 0; i < x; i++) {
                    if (deck.isEmpty()) break;
                    hand.push(deck.pop());
                }
            } else if (command == 1) { //Discard x cards
                System.out.println("\nCommand: Discard " + x + " card(s) from hand");
                for (int i = 0; i < x; i++) {
                    if (hand.isEmpty()) break;
                    discard.push(hand.pop());
                }
            } else { //Get x cards from discarded pile
                System.out.println("\nCommand: Get " + x + " card(s) from discard pile");
                for (int i = 0; i < x; i++) {
                    if (discard.isEmpty()) break;
                    hand.push(discard.pop());
                }
            }

            System.out.println("\nCurrent Hand:");
            hand.printStack();
            System.out.println("Deck Remaining: " + deck.size());
            System.out.println("Discard Pile: " + discard.size());

            //added pause after each turn for output not to be overwhelming for user
            System.out.print("\nPress ENTER to continue...");
            scanner.nextLine();
            System.out.println();
        }

        //End
        System.out.println("Deck is empty! Simulation over");
        System.out.println("Final Hand:");
        hand.printStack();
        System.out.println("Final Discard Pile:");
        discard.printStack();

        scanner.close();
    }
}
