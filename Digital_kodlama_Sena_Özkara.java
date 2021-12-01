package digital_kodlama_sena_özkara;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 *
 * @author Sena Özkara_Digital_Kodlama
 */
public class Digital_kodlama_Sena_Özkara 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Dijital Kodlama Örneği 
        
        
        System.out.println("1: Excess-3 Code\n2: Aiken Code\n3:Gray Code\n4:BCD code"); 
        Scanner girdi= new Scanner(System.in);
        String secim = girdi.next();
        if ("1".equals(secim)) 
        {

         System.out.println("Lütfen bir sayı giriniz:");     
         String yaz = girdi.next();
        
        String binary = yaz.chars()
                            .boxed()
                            .map(x -> String.format("%4s", Integer.toBinaryString(Character.getNumericValue(x) + 3)).replace(' ', '0'))
                            .collect(Collectors.joining(" "));
        
        System.out.println(yaz + " " + "Excess-3 Code karşılığı ->" + binary); 
                                 
        }
        else if("2".equals(secim))
        {
            System.out.println("Lütfen bir sayı giriniz:");     
          int input = girdi.nextInt();
          String[] aiken = Integer.toString(input).chars()
          .map(Character::getNumericValue)
          .mapToObj(d -> String.format("%4s", 
          Integer.toBinaryString(d + (d > 4 ? 6 : 0))) //  aiken değeri
          .replace(' ', '0') // 0 tamamlamayı sağlama
             )
          .toArray(String[]::new);
          System.out.println(input + " " + "Aiken Code Karşılığı"+" -> " + Arrays.toString(aiken));  
        }
        else if("3".equals(secim))
        {
        System.out.println("Grey code " + 7 + "  n-bit: " + getGreyCode(7));
        System.out.println("Grey code  " + 7 + "  5-bit: " + getGreyCode(7, 5));
        }
        else if("4".equals(secim))
        {
        System.out.println("Lütfen bir sayı giriniz:");     
        int decimal=girdi.nextInt();
        int digit;
        String BCD="";
        while(decimal!=0)
            {
            digit=decimal%10;
            BCD=digitToBcd(digit)+" "+BCD;
            decimal/=10;
            }
        System.out.println( "BCD Code Karşılığı :" + BCD);
 
        }
        else
        {
         System.out.println("Lütfen Doğru bir seçim yapınız"); 
        
        }
        
        
    }
    
    
    static String getGreyCode(int myNum, int numOfBits) {
    if (numOfBits == 1) 
    {
        return String.valueOf(myNum);
    }

    if (myNum >= Math.pow(2, (numOfBits - 1))) {
        return "1" + getGreyCode((int)(Math.pow(2, (numOfBits))) - myNum - 1, numOfBits - 1);
    } else {
        return "0" + getGreyCode(myNum, numOfBits - 1);
    }
}

static String getGreyCode(int myNum) 
{

    //Use the minimal bits required to show this number
    int numOfBits = (int)(Math.log(myNum) / Math.log(2)) + 1;
    return getGreyCode(myNum, numOfBits);
}


static String digitToBcd(int digit)
{
    String str="";
    for(int i=3;i>=0;i--)
        {
        int d=(int) Math.pow(2,i);
        if(digit/d!=0)
            {
                str+="1";
                digit-=d;
            }
        else
            str+="0";
        }
    return str;
}

}

    

