package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Yate {
	
	private int yateId;
	private String nombreYate;
	private String nombreDueño;
	private double manga;
	private double calado;
	private double eslora;
	private int tripulacion;
	private double peso;
	private double costoMensual;
	
	public Yate(String nombre, String dueño, double manga, double calado, double eslora, int tripulacion, double peso, double costoMensual) {
		this.yateId++;
		this.nombreYate = nombre;
		this.nombreDueño = dueño;
		this.manga = manga;
		this.calado = calado; 
		this.eslora = eslora;
		this.tripulacion = tripulacion;
		this.peso = peso;
		this.costoMensual = costoMensual;
	}

	public double getCostoMensual() {
		return this.costoMensual;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // misma referencia
        if (obj == null || getClass() != obj.getClass()) return false;

        Yate yate = (Yate) obj;
        return Objects.equals(yateId, yate.yateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yateId);
    }
    
    public String toString() {
    	return "ID: "+yateId;
    }
    
}
