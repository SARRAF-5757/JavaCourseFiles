package classesPkg;

import static java.lang.Integer.parseInt;

public class DataTypeConversion {
    public static void main(String[] args){
        Boolean thisIsATrueOrFalse = true; //just to show how booleans work, not connected to anything

        int thisIsAnInteger = 127; //could be any other primitive data type too (ex. Float, byte, long etc)
        String thisIsAString = "This sentence was added to this number- ";

        String intToStr = Integer.toString(thisIsAnInteger); //Converting an integer into a string
        String combinedTheIntAndStr = thisIsAString + thisIsAnInteger;

        int backIntoInt = parseInt(intToStr); //Converting a string into an integer
        int addingStuffToIt = backIntoInt + 583;

        System.out.println(addingStuffToIt);
    }
}