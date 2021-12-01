package toplama_ıslemı;

/**
 *
 * @author Sena Özkara
 */
public class Toplama_ıslemı 
{

    /**
     * @param args the command line arguments
     */
    
       static String sumBaseB(String a, String b, int base)  
    {  
        int len_a, len_b;  
      
        len_a = a.length();  
        len_b = b.length();  
      
        String sum, s;  
        s = "";  
        sum = "";  
      
        int diff;  
        diff = Math.abs(len_a - len_b);  
          
         
        for (int i = 1; i <= diff; i++)  
            s += "0";  
          
     
        if (len_a < len_b)  
            a = s + a;  
        else
            b = s + b;  
      
        int curr, carry = 0;  
          
          
        for (int i = Math.max(len_a, len_b) - 1;  
                            i > -1; i--) {  
              
           
            curr = carry + (a.charAt(i) - '0') +  
                        (b.charAt(i) - '0');  
      
              
            carry = curr / base;  
      
            
            curr = curr % base;  
      
           
            sum = (char)(curr + '0') + sum;  
        }  
        if (carry > 0)  
            sum = (char)(carry + '0') + sum;  
        return sum;  
    }  
    public static void main(String[] args)
    {
      
        
        // Toplamak istediğiniz sayıları ve hangi tabanda toplamak istediğinizi lütfen kodlar üzerinde değişiklik yaparak belirtiniz.
        
        String a, b, sum;  
        int base;  
        a = "6703";  
        b = "2417";  
        base = 8;  
          
       
        sum = sumBaseB(a, b, base);  
        System.out.println(sum);   
    }
    
}
