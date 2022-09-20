package classesPkg;

public class WhileLoops {
    public static void main(String[] args){

        int variable = 0;

        while (true) { //the condition goes inside a set of parentheses after 'while'
            System.out.println("This will keep printing until 'variable' hits 3");
            variable = variable + 1;
            if (variable > 3) {
                break; // BREAKS THE LOOP IMMEDIATELY
            }
            System.out.println("this stuff prints after the loop"); /* Doesn't print the third time because
                                                                       the loop is broken immediately by "break;" */
        }
    }
}