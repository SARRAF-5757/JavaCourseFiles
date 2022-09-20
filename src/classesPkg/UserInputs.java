package classesPkg;

import java.util.Scanner; //Gotta import the Scanner library first

public class UserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Something");
        String typedStuff = input.nextLine(); // setting a variable equal to whatever the input (next line) is
        System.out.println("You typed : " + typedStuff);
    }
}
