package classesPkg;

class AMethod {
    //There can be only one public class in a file
    //But there can be as many private classes as we want
    String name;
    int age;

    public void speak() {          //This is a method. A method has to be inside a class
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }
    //------------------------------------------------------------------------------------------------
    int getAge () { //setting up a function that returns a value so that we can call the function later
        return age;
    }
}

class MethodParameters {
    //Parameters are just when the data one or multiple types and variable names (separated by ",") are pre-defined inside ()
    public void nameAndAge(String name, int age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
};


public class MainMethod {
    public static void main(String[] args) {
        AMethod person1 = new AMethod(); //declare a new object (person1) under the class (Person)
        person1.name = "Sarraf"; //assign the 'name' variable of Person a value (string, Sarraf)
        person1.age = 19; //assign the 'age' from Person a value (int, 19)
        person1.speak(); //calling the method here

        AMethod person2 = new AMethod();
        person2.name = "Sindid";
        person2.age = 17;
        person2.speak();
        //-------------------------------------------------------------------------------------------------------------
        int firstAge = person1.getAge(); //calling the function to get the age from the method for later calculations
        int secondAge = person2.getAge();
        int ageDifference = firstAge-secondAge;
        System.out.println("Our age difference is " + ageDifference + " years");
        //-------------------------------------------------------------------------------------------------------------
        MethodParameters aPerson = new MethodParameters();
        aPerson.nameAndAge("Sarraf", 19);
    }
}
