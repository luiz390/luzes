package instituicao;

import java.util.Locale;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xa, xb,xc,ya,yb,yc;
		
		System.out.print("entre com os numeros do triangulo x" );
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        
        System.out.print("entre com os numeros do triangulo y");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();
        
        double p = (xa + xb + xc)/2;
        double areax =Math.sqrt(p *(p - xa) * (p - xb) * (p - xc));
        
        
         p = (ya + yb + yc)/2;
        double areay =Math.sqrt(p *(p - ya) * (p - yb) * (p - yc));
        
        
        
        
        System.out.println("a medida do triangulo x é " + areax);
        System.out.println("a medida do triangulo y é "+ areay);
        
        if(areax > areay) {
        	System.out.println("o triagulo x tem area maior " + areax);
        }
        else {
        	System.out.println("o triangulo y tem area maior"+ areay);
        }
       
        
	}
	   

}
