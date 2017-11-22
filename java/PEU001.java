// Solution to P.E Exercise 1
public class PEU001 {
    public static void main (String[] args) {
        int last=0;
        for (int i=1; i<1000; i++) {
            if (i%3==0 || i%5==0) {
                last = i+last;
            }
        }
        System.out.println ("The sum of multiples of 3 and 5 below 1000 is: " + last);
    }
}