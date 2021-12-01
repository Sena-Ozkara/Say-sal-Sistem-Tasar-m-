package tabandonusum;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Sena Özkara
 */
public class TabanDonusum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Lütfen 10 tabanında bir sayı giriniz"); 
        Scanner girdi= new Scanner(System.in);
        String sayı = girdi.next();

        BigInteger bi = new BigInteger(sayı);
        System.out.println("Girmiş olduğunuz sayının 2 tabanındaki (binary) karşılığı -----------> "+(bi.toString(2)));
        System.out.println("Girmiş olduğunuz sayının 2 tabanındaki (tree) karşılığı -------------> "+(bi.toString(3)));
        System.out.println("Girmiş olduğunuz sayının 4 tabanındaki (tetra) karşılığı ------------> "+(bi.toString(4)));
        System.out.println("Girmiş olduğunuz sayının 8 tabanındaki (octal) karşılığı ------------> "+(bi.toString(8)));
        System.out.println("Girmiş olduğunuz sayının 10 tabanındaki (decimal) karşılığı ---------> "+(bi.toString(10)));
        System.out.println("Girmiş olduğunuz sayının 16 tabanındaki (hexadecimal) karşılığı -----> "+(bi.toString(16)));
    
        
    }
    
}
