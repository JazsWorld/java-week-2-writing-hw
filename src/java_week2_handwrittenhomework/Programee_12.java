package java_week2_handwrittenhomework;

/*Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

public class Programee_12 {

    public static void main(String[] args) {
        Programee_12 t = new Programee_12 ();
        t.printExpressions();
    }

    //Printing expression
    public void printExpressions() {
        double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(a);
    }
}

