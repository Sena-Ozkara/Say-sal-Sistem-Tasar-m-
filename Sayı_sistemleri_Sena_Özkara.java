package sayı_sistemleri_sena_özkara_1911404013;

import static java.lang.Math.pow;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sena Özkara
 */
public class Sayı_sistemleri_Sena_Özkara
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("1: Taban Dönüşümü\n2: Toplama\n3: 1'e ve  2'ye Tümleme"); 
        Scanner yapılacakislem= new Scanner(System.in);
        String yapılacak = yapılacakislem.next();
        
    if ("1".equals(yapılacak)) 
    {
   //---------------------------------Taban Döüşümü--------------------------------------
    int secim = 0 ;
    int onSay=0;
    int j;
    int ustDeg=0;
    int m=0;
    int n;
    int l=1;
    int i;
    int s=0 ;
    int x;
    int[] k = new int [20];
    int d=0;
    int d1; 
    int r = 0; 
    int c=0;
    int p; 
    int girSayi;
    char diziOnAlt [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8','9', 'A','B', 'C', 'D', 'E', 'F'};
    String [] onAltDeger = new String[300];
    


    System.out.println("\n\n\n\n\n\t\t\t\t\tTABAN DEGISTIRME MENUSU");
    System.out.println("\n\n\n\n\n\t\t\t\t\t1.  10 tabanindan 2 'lik tabana\n");
    System.out.println("\t\t\t\t\t2.  10 tabanindan 8 'lik tabana\n");
    System.out.println("\t\t\t\t\t3.  10 tabanindan 16'lik tabana\n");
    System.out.println("\t\t\t\t\t4.  2  tabanindan 10'lik tabana\n");
    System.out.println("\t\t\t\t\t5.  8  tabanindan 10'lik tabana\n");
    System.out.println("\t\t\t\t\t6.  16 tabanindan 10'lik tabana\n");
    System.out.println("\t\t\t\t\t7.  2  tabanindan 8 'lik tabana\n");
    System.out.println("\t\t\t\t\t8.  2  tabanindan 16'lik tabana\n");
    System.out.println("\t\t\t\t\t9.  8  tabanindan 2 'lik tabana\n");
    System.out.println("\t\t\t\t\t10. 16 tabanindan 2 'lik tabana\n");
    System.out.println("\t\t\t\t\t0.cikis\n");
    
//   enbasadon:
    Scanner reader = new Scanner(System.in);
     System.out.println("Bir Sayı Girin: ");
     secim = reader.nextInt();
     System.out.println("\t\t\t\t\tsecim:" + secim); 
    
     switch(secim){
         
		case 1: basadon1:
		    System.out.println("\n\n\n\n\n\t\t\t\t\t10 tabaninda bir sayi giriniz:");   
                    x = reader.nextInt();
                    girSayi=x;
                while(0!=x)
                {
    	          s++;
    	          k[s]=(x%2);//girilen sayiyi her seferinde 2'nin modulusunu alıp k[s] dizisine atar
    	          x/=2;
	         }
	            System.out.println("\n\n\t\t\t\t\t10 tabaninda sayi:"+girSayi);
                    System.out.println("\n\n\t\t\t\t\t10 tabaninda girdiginiz sayisinin 2 tabaninda karsiligi:");
                while(0<s) 
                {
    	         System.out.println(k[s]);//k[s] dizisine atilan sayilar tersten yazdirilir
    	          s=s-1;
	        }

		break; 
				
				 	            
		case 2: basadon2: 
		    System.out.println("\n\n\n\n\n\t\t\t\t\t10 tabaninda bir sayi giriniz:");   
                 x = reader.nextInt();
                girSayi=x;
                while(0!=x){
    	          s++;
    	          k[s]=x%8;//girilen sayiyi her seferinde 8'nin modulusunu alıp k[s] dizisine atar
    	          x/=8;
	            }
	            System.out.println("\n\n\t\t\t\t\t10 tabaninda girdiginiz sayi:"+ girSayi);
                    System.out.println("\n\n\t\t\t\t\t10 tabaninda girdiginiz sayisinin 8 tabaninda karsiligi:");
                while(0<s){
                     
                     System.out.println(k[s]);//k[s] dizisine atilan sayilar tersten yazdirilir
    	          s--;
	            }

			break; 
				
		
		case 3: basadon3:
		        System.out.println("\n\n\n\n\n\t\t\t\t\t10 tabanında bir deger giriniz: ");
                 x = reader.nextInt();
                girSayi=x;
                while(x!=0){
                   d =x % 16;//girilen sayinin 16 ile modulusu alinir ve d ye atanir
                   if( d < 10)//d degeri 10 kucukse 48 ile toplanır tekrar d ye atanir ve d deki ascii kodundan 0-9 rakamlarından biri ortaya cıkar
                      d += 48;
                   else//d degeri 10 buyukse 55 ile toplanır tekrar d ye atanir ve d deki ascii kodundan A-F harflerinde herhangi biri ortaya cıkar
                      d += 55;
                   diziOnAlt[l++]= (char) d;
                   x /= 16;
                }
                 System.out.println("\n\n\t\t\t\t\t10 tabanda girdiginiz  sayisinin 16 lik tabanda karsiligi:"+ girSayi + x);
                for(n = l -1 ;0<n;n--)
                  System.out.println(diziOnAlt[n]); //diziOnAlt[] atilan degerleri yazdirir sondan basa dogru

				break; 
				
		
		case 4:basadon4: 
		    System.out.println("\n\n\n\n\n\t\t\t\t\t2 tabaninda sayi giriniz:"); 
			   x = reader.nextInt();
	           girSayi=x;
	           while(0!=x){
                   r = x %10;//girilen sayinin 10 ile modulusu alinir ve r ye atanir
                   if(0<=r && r<2){//r kontrol saglanir
                      x/=10;
                      p = (int) pow(2,c);//pow sayesinde her seferinde 2 sayisinin ustu alinir 
                      d+= (r*p);
                      c++;
                   }
                   else{
    	            System.out.println("\n\n2 tabaninda bir sayi girmediniz lütfen tekrar bir sayi giriniz....\n\n\n"); 

		             break;
	               }
                }
                if(r>=0 && r<2){//r kontrol tekrar saglanir ve sonuc yazilir
                     System.out.println("\n\n\t\t\t\t\t2 tabaninda  sayi:" + girSayi);
                      System.out.println("\n\n\t\t\t\t\t2 tabaninda  sayisinin 10 tabanininda karsiligi:" );
                    System.out.println(d);
	            } 
				break; 
				
		
		case 5: basadon5: 
		     System.out.println("\n\n\n\n\n\t\t\t\t\t8 tabaninda sayi giriniz:"); 
                     x = reader.nextInt();
	            girSayi=x;
	            while(0<x){
                 r = x %10;//girilen sayinin 10 ile modulusu alinir ve r ye atanir
                   if(0<=r && r<8){//r kontrol saglanir
                      x/=10;
                      p = (int) pow(8,c);//pow sayesinde her seferinde 2 sayisinin ustu alinir 
                      d+= (r*p);
                      c++;
	                }
                    else{
    	              System.out.println("\n\n\t\t\t\t\t2 tabaninda bir sayi girmediniz lütfen tekrar giriniz...\n"); 

		              break;
	                }
                }
                if(0<=r && r<8){//r kontrol tekrar saglanir ve sonuc yazilir
                   System.out.println("\n\n\t\t\t\t\t8 tabaninda  sayisinin 10 tabanininda karsiligi:" + girSayi);
                   System.out.println(d);
	            } 
                        break; 
				
		
		case 6:basadon6:
                 System.out.println("\n\n\n\n\n\t\t\t\t\t16 tabanında bir sayi giriniz: "+ onAltDeger[30]); 
                onAltDeger[1] = reader.next(); 
                for(i=strlen(onAltDeger)-1; i >= 0; i--){//girilen degerin strlen sayesinde uzunlugu alinir ve -1 cıkarılır sebebi i en sifira esitlenmesi durumudur
                    for(j=0; j<16; j++){//diziOnAlt[]'in icerisini gormek 
                       if(toupper(onAltDeger[i])== diziOnAlt[j])//girilen deger ile diziOnAlt[] dogrulugu karsilastirilir
                          onSay += j*pow(16, ustDeg);//herseferinde 16'nin ustu alinir ve 10 luk tabani bulunur     
                    }
                  ustDeg++;
                }
                System.out.println("\n\n\t\t\t\t\t16 tabaninda  sayisinin 10 tabanininda karsiligi:" + Arrays.toString(onAltDeger) + onSay); 

				break; 
				 
		
		case 7: basadon7: 
                System.out.println("\n\n\n\n\n\t\t\t\t\t2 tabaninda sayi giriniz");  
                     x = reader.nextInt();
	            girSayi=x;
	            while(0!=x){//girilen sayi burda 10 tabana cevrilir
                  r =x%10;//girilen sayinin 10 ile modulusu alinir ve r ye atanir
                    if(0<=r && r<2){//r kontrol saglanir
                      x/=10;
                      p = (int) pow(2,c);
                      d+=(r*p);
                      c++;
	                }
	                else{
	                  System.out.println("\n\n\t\t\t\t\t2 tabaninda bir sayi girmediniz lütfen tekrar giriniz...\n");

		              break;
	                }
               }
               if(0<=r && r<2){//r kontrol saglandıktan sonra 10 luka cevrilen sayi 8 tabanına cevrilir
                    while(1<=d){
    	                s++;
    	                k[s]=(d%8);
    	                d/=8;
	                }
	                System.out.println("\n\n\t\t\t\t\t2 tabaninda  sayisinin 8 tabanininda karsiligi:"+ girSayi);
                    while(0<s){
    	                System.out.println( k[s]);
    	                s--;
                    }
	           } 
			   break; 
			   
		
		case 8: basadon8:
		       System.out.println("\n\n\n\n\n\t\t\t\t\t2 tabaninda bir sayi giriniz:"); 
		     x = reader.nextInt();
	            girSayi=x;
	            while(0!=x)
		    {//2 tabaninda girilen sayi burda 10 tabana cevrilir
                    r = x %10;
                    if(0<=r && r<2)
					{
                        x/=10;
                        p = (int) pow(2,c);
                        d+= (r*p);
                        c++;
                    }
                    else
					{
    	               System.out.println("\n\n\t\t\t\t\t2 tabaninda bir sayi girmediniz lütfen tekrar giriniz...\n");

		                break;
	                }
                }
                if(0<=r && r<2)//10 tabanina cevrilen sayi burda 16 tababina cevrilir
				{
    	            while(0!=d)
					{
                        d1 =d % 16;
                        if( d1 < 10)
                            d1 += 48;
                        else
						{
                            d1 += 55;
                            diziOnAlt[l++]= (char) d1;
                            d /= 16;
						}
                    }
                   System.out.println("\n\n\t\t\t\t\t2 tabanda girdiginiz sayinin 16 lik karsiligi:");
                    for(n = l -1 ;0<n;n--)
                    System.out.println(diziOnAlt[n]);   
                    
	             }
				break; 
				
		
		case 9:basadon9: 
		       System.out.println("\n\n\n\n\n\t\t\t\t\t8 tabaninda sayi giriniz:"); 
                        x = reader.nextInt();
                        girSayi=x;
	            while(0!=x)
				{
                    r = x %10;
                    if(0<=r && r<8)
					{
                        x/=10;
                        p = (int) pow(8,c);
                        d+= (r*p);
                        c++;
	               }
	               else
                        {
	                System.out.println("\n\n\t\t\t\t\t8 tabaninda bir sayi girmediniz lütfen tekrar giriniz...\n");

		                break;
	                }
               }
                    if(0<=r && r<8)
			   {
                    while(1!=d)
					{
    	                s++;
    	                k[s]=d%2;
    	                d/=2;
	                }
                    System.out.println("\n\n\t\t\t\t\t8 tabanindaki  sayisi:"+ girSayi);
	            System.out.println("\n\n\t\t\t\t\t8 tabanindaki  sayisinin 2 tabanininda karsiligi:");
                    while(0<s)
                    {
    	               System.out.println(k[s]);
    	                s--;
                    }
	           }
	          
			   break; 

		
		case 10:basadon10:
		     System.out.println("\n\n\n\n\n\t\t\t\t\t16 tabanında bir sayi giriniz:");  
                     onAltDeger[0] = reader.next();  
                for(i=strlen(onAltDeger)-1;0<=i; i--){
                    for(j=0; j<16; j++){
                        if(toupper(onAltDeger[i])== diziOnAlt[j])
                            onSay += j*pow(16, ustDeg);  
                    }
                    ustDeg++;
                }    
	            while(onSay>=1){
                    m++;
                    k[m]=onSay%2;
                    onSay/=2;
                }
               System.out.println("\n\n\t\t\t\t\t2 taban karsiligi:");
                for(m=m;m>0;m--)
                        System.out.println(k[m]);
//				
				break; 
			
		
		default:
		       System.out.println("\n\n\n\n\n\t\t\t\t\tHatali giris yaptiniz...Lutfen tekrar secim yapiniz...\n\n"); 

				break; 
				
	}
	return ; 
        }
        //--------------------------Toplama İşlemi----------------------------------------------------------
        
        if ("2".equals(yapılacak))
        {
        String a, b, sum;  
        int base; 
        Scanner toplamaislemi=new Scanner(System.in);
        System.out.println("Lütfen, toplamak istediğiniz sayıyı yazınız");
        a=toplamaislemi.next();
        System.out.println("Lütfen, toplamak istediğiniz sayıyı yazınız");
        b=toplamaislemi.next();
        System.out.println("Lütfen, toplamak istediğiniz sayıları hangi sayı tabanında toplamak istediğinizi seçiniz");
        base=toplamaislemi.nextInt();

//        a = "670324";  
//        b = "241781";  örnek işlem
//        base = 8;  
        sum = sumBaseB(a, b, base);  
        System.out.println(sum); 
        }
        
        if ("3".equals(yapılacak)) 
        {
          System.out.println("Lütfen ikilik tabanda (binary) bir sayı giriniz:");
        Scanner girdi = new Scanner(System.in);
        String bin = girdi.next();

        printOneAndTwosComplement(bin);  
        }
        else
       {
          System.out.println("Lütfen geçerli bir sayı giriniz"); 
       }
       }
    //--------------------------------------------Taban dönüşümü------------------------------------------------
    private static char toupper(String string) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static int strlen(String[] onAltDeger)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //--------------------------------------------Taban dönüşümü------------------------------------------------
    
    
    //---------------------------------------------Toplama İşlemi--------------------------------------------------------------
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
         //---------------------------------------------Toplama İşlemi--------------------------------------------------------------
    }  
    
    
    
    
    
    
    //----------------------------------------1'e ve 2'ye Tümleme İşlemi-----------------------------------------------
    
    
    
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
 //----------------------------------------1'e ve 2'ye Tümleme İşlemi-----------------------------------------------
   
    }


