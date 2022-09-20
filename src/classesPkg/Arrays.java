package classesPkg;

public class Arrays {
    public static void main(String[] args) {
        int[] values; //Declaring the Array's name
        values = new int[3]; //Declaring how long the array will be

        values[0] = 1; //Assigning values to items on the Array
        values[1] = 2;
        values[2] = 3; //This is where we can go up to because our array was defined to have 3 items
        System.out.println(values[0]); //printing out
        System.out.println(values[1]); //each values
        System.out.println(values[2]); //separately

        //This is a shorter way of doing it
        int[] values2 = {5, 4, 6}; //This way, we don't have to define the array size
        for (int i = 0; i < values2.length; i++) { //the "x.length" function tells us the number of items in a list
            System.out.println(values2[i]);
        }
    }
}


class ArraysOrLists_Multidimensional {         // **This Is a non-public class that can be inside a class file **
    public static void main(String[] args) {
        /*Multi-dimensional Arrays: Multi-dimensional arrays are just Arrays of Arrays.
         *They can 2 dimensional, 3 dimensional or more. But we have to add [] for each additional dimensions
         */

        String[][] listOfIngredients = {             //It's just a nested list
                {"Lemon", "Sugar", "Water"},
                {"Rice", "Spice", "Meat", "Oil"},
                {"Milk", "Flower", "Flavor", "Sugar"}
        };
        System.out.println(listOfIngredients[1][3]); //we can call any value from the list like so

        //But to call all items with a for loop like before, we would have to use a nested loop
        for (int recipes = 0; recipes < listOfIngredients.length; recipes++) { //define the first dimension like normal
            for (int ingredients = 0; ingredients < listOfIngredients[recipes].length; ingredients++) {/*for the second dimension,
            we have to define the length of nested lists by using masterList[nestedList].length*/
                System.out.println(listOfIngredients[recipes][ingredients]); //this is printing all items in all recipes
            }
        }
    }
}
