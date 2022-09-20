package classesPkg;

public class ForLoops {
    public static void main(String[] args){
        for (int i=0; i<3; i++){
            /* There are three parts to a for loop separated by ;
             * The first part (i=0) is run once before everything else inside 'for' is run
             * The second part (i<3) is the condition
             * The third part (i= i+1) is something that is executed for every 1 time the code inside for is run
             */
            System.out.println("To print the value of i " + i);
            System.out.printf("To print the value of i &d\n", i); //Didn't get this method to work
        }
    }
}