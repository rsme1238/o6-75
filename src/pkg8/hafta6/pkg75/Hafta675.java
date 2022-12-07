
package pkg8.hafta6.pkg75;

import java.util.Scanner;

public class Hafta675 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double n,x,result;
        System.out.printf("exp(x)=lim(1+x/n)^n\n\n");
      
        System.out.println("please enter n value= ");
         n= input.nextDouble();
        
         System.out.println("please enter x value= ");
         x= input.nextDouble();
        
          result= Math.pow((1+x/n), n);
        
        System.out.printf("\nexp(%f)=%f\n", x, result);
                
    }
    
}
