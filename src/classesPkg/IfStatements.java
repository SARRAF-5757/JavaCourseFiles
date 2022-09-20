package classesPkg;

public class IfStatements {
    public static void main(String[] args){
        int x = 10;
        if (x < 10) {
            System.out.println("It's smaller than 10");
        } else if (x == 10) {
            System.out.println("It's equal to 10");
        } else {
            System.out.println("It's greater than 10");
        }
        System.out.println("this prints after the loop ends");
    }
}
