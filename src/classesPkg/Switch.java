/* Scanner isn't used all that much in professional development
 * It's just handy to know for tests and interviews
 */
package classesPkg;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("Type out a command: ");
        Scanner input = new Scanner(System.in);
        String storeCommand = input.nextLine();

        switch (storeCommand) {
            case "Start": //This is a case, it's searching for the word "Start" in the input
                System.out.println("'Start' command detected"); //If it finds 'Start', it's gonna execute this
                break; //To stop the code from running if it prints this ('Start' command detected)

            case "Stop": //This is case-sensitive... so if input is 'stop', it'll execute whatever is under *default*
                System.out.println("'Stop' command detected");
                break;

            default: //This is for anything that is not defined with a case
                System.out.println("No commands detected"); //So, if the input is neither 'Start' nor 'Stop', it'll print this
        }
    }
}