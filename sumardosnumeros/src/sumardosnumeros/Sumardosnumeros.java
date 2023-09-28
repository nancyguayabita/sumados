package sumardosnumeros;
import java.util.Scanner;
public class Sumardosnumeros 
{
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        float n1,n2,denny;
        System.out.println("ingresa el primer numero: ");
        n1=leer.nextFloat();
        System.out.println("ingresa el segundo  numero: ");
        n2=leer.nextFloat();
        denny=n1+n2;
        System.out.println("el resultado de la suma es: " + denny);
    }
    
}
