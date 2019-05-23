package hello;
import java.lang.Math;

public class Cuota{
	
	
	
	
	public double calcularCuota(double capital, double interes, double anos) {
		double cuota2;
    	
        interes = interes / 12;
        double plazo = anos * 12;
        double a = 1 + (interes / 100);
        double b = Math.pow(a, -plazo);
        cuota2 = (capital * interes) / (100 * (1 - b));
        cuota2 = Math.round(cuota2);

        return cuota2;
    }
	
   	
}