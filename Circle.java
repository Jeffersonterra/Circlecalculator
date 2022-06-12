import java.util.Scanner;
import java.util.Locale;

public class Circle { 
public static void main (String[] args){
	Locale.setDefault(Locale.US);

	Scanner sc = new Scanner (System.in);
	double radius, radius2, area;
System.out.println("Digite o raio do circulo");
System.out.println("Input the radius of the circle");
radius = sc.nextDouble();


radius2 = radius * radius;
area = 3.14 * radius2;

System.out.printf("The area of the circle is %1.2f", area);

			sc.close();											
}
}
