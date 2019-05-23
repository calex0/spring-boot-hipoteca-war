package hello;



public class Hipoteca {

    private double capital;
    private double interes;
    private double anos;
    private double cuota;
    
   
    
    public double getCuota() {
    	Cuota cuotaCalc = new Cuota();
    	cuota = cuotaCalc.calcularCuota(this.getCapital(), this.getInteres(), this.getAnos());
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	
    
	
	
    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAnos() {
        return anos;
    }

    public void setAnos(double anos) {
        this.anos = anos;
    }
    
}
