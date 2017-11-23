// // Solution to P.E Exercise 2
public class PEU002 {
    public static void main (String[]args) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        int sumEven = 0;
        while (n3<=4000000) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            if (n3%2==0) 
                sumEven += n3;
        }
        System.out.println ("the sum is: " + sumEven);
    }
}
