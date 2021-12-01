package tumleme_1_2;
import java.util.Scanner;
/**
 *
 * @author Sena Özkara
 */
public class Tumleme_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         // 1 ve 2 ' ye tümleme
        
        System.out.println("Lütfen ikilik tabanda (binary) bir sayı giriniz:");
        Scanner girdi = new Scanner(System.in);
        String bin = girdi.next();

        printOneAndTwosComplement(bin);
    }
         
    static char flip(char c)
    {
        return (c == '0') ? '1' : '0';
    }
 
    
    static void printOneAndTwosComplement(String bin)
    {
        int n = bin.length();
        int i;
 
        String ones = "", twos = "";
        ones = twos = "";
 
    
        for (i = 0; i < n; i++)
        {
            ones += flip(bin.charAt(i));
        }
 
        
        twos = ones;
        for (i = n - 1; i >= 0; i--)
        {
            if (ones.charAt(i) == '1')
            {
                twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
            } 
            else
            {
                twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
                break;
            }
        }
 
        
        if (i == -1)
        {
            twos = '1' + twos;
        }
 
        System.out.println("1's Tümleyeni: " + ones);
        System.out.println("2's Tümleyeni: " + twos);
    }
 
   
    }
    
        