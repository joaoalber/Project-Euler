// Solution to P.E Exercise 25
import java.math.BigInteger;

public class PEU025 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("1");
        BigInteger x_ant = new BigInteger("0");
        int f = 1;
        String k = x.toString();
        
        while(k.length()!=1000){
            f++;
            x=x.add(x_ant);
            x_ant = x.subtract(x_ant);
            k = x.toString();
        }
        System.out.println("f("+f+") digitos:"+k.length()+" x: "+x);
    } 
}
