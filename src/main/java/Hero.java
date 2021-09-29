import java.io.InputStream;
import java.util.Scanner;

public class Hero {

    String x = "Good Choice";
    String y = "A worthy opponent";

        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);

            Hero squad1= new Hero();
            Hero squad2 = new Hero();

            System.out.println("You are to Enter 3 players for each team (choose from the available players");

            //First Team
            System.out.println("First Team");
            System.out.print("Enter the first player :");
            String playerOne = myObj.nextLine();
            System.out.print("Enter the second player :");
            String playerTwo = myObj.nextLine();
            System.out.print("Enter the third player : ");
            String playerThree = myObj.nextLine();
            System.out.println(squad1.x);

            //Second Team
            System.out.println("Second Team");
            System.out.print("Enter first player : ");
            String playerOneTwo = myObj.nextLine();
            System.out.print("Entre player two : ");
            String playerTwoTwo = myObj.nextLine();
            System.out.print("Enter player three : ");
            String playerThreeTwo = myObj.nextLine();
            System.out.println(squad2.y);

            //Information print out
            System.out.println("Your first team");
            System.out.println("Player one : " + playerOne);
            System.out.println("Player two : " + playerTwo);
            System.out.println("Player three : " + playerThree);

            System.out.println("Your Second Team");
            System.out.println("Player one : " + playerOneTwo);
            System.out.println("player two : " + playerTwoTwo);
            System.out.println("player two : " + playerThreeTwo);

        }
}
