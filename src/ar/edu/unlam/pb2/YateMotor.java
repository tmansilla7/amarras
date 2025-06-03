package ar.edu.unlam.pb2;

public class YateMotor extends Yate{
	
	private double desplazamiento;
	private int cantidadDePropulsores;
	private double potencia;
	private double velocidad;
	private double autonomia;
	
	public YateMotor() {
		super("AZ1", "Andrés Borgeat", 18.87, 5.15, 119, 37, 5500, 13000);
		this.desplazamiento = 5959;
		this.cantidadDePropulsores = 2;
		this.potencia = 9000;
		this.velocidad = 23;
		this.autonomia = 6500;
	}

}