import java.util.*;

public class AreaCirculoCircunferencia {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double AreaCirculo,AreaCircunferencia;
        double radio=input.nextDouble();

        AreaCirculo=(Math.PI)*(Math.pow(radio,2));
        AreaCircunferencia=(2*(Math.PI)*radio);

        System.out.println("El area del circulo es: "+AreaCirculo);
        System.out.println("El area de la circunferencia es: "+AreaCircunferencia);

    }
}