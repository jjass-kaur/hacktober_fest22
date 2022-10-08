import java.util.*;
import java.math.*;

public class Quadratic {
    public static void main(String[] args) {
        int a,b,c;
        float d;
        Scanner scn = new Scanner(System .in);
        System.out.println("Enter the coefficients (a,b,c) of quadratic equation ax^2+bx+c = 0");
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        d = ((b * b) - (4 * a * c));
        System.out.println("Value of d is: " + d);
        if(d < 0) {
            System.out.println("No real solutions");
        } else if (d == 0) {
            float e = -(b / (2 * a));
            System.out.println("The roots of quadratric equation " + a  + "x^2+" + b + "x" + "+c=0 are : " + e + " and " + e + "\n");
        } else {
            double g = Math.sqrt(d);
            double e = (((-b) + (g)) / (2 * a));
            double f = (((-b) - (g)) / (2 * a));
            System.out.println("The roots of quadratric equation " + a  + "y^2+" + b + "x" + "+c=0 are : " + e + " and " + f + "\n");
        }
    }
}
