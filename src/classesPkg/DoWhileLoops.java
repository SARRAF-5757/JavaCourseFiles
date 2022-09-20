/*Do-While loop is just an addition to the While loop
 *The "do" part will run once and check for the condition under the while loop.
 */

package classesPkg;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int value = 0;
        do {
            System.out.println("Enter a number: "); //keeps repeating this while value isn't equal to 5
            value = x.nextInt();
        }
        while (value != 5);
        System.out.println("Got 5!");
    }
}