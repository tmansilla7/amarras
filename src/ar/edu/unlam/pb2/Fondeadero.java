package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Fondeadero {
	
	private ArrayList <Yate> amarras;
	double importeTotal;
	int cantidadDeYatesAmarrados;
	int cantidadMaximaDeAmarras;
	
	public Fondeadero(int numero) {
		this.cantidadMaximaDeAmarras = numero;
		this.amarras = new ArrayList<>();
		this.cantidadDeYatesAmarrados = 0;
	}

	public int getCantidadMaximaDeAmarras() {
		return this.cantidadMaximaDeAmarras;
	}

	public boolean amarrarYate(Yate yate) {
		if(amarras.size() < cantidadMaximaDeAmarras) {
			amarras.add(yate);
			importeTotal += yate.getCostoMensual();				
			return true;
		}

		return false;
	}

	public boolean desamarrarYate(Yate yate) {
		
		for(Yate yates: amarras) {
			if(yates.equals(yate)) {
				amarras.remove(yates);
				return true;				
			}
		}
		
		return false;
	}

	public int getCantidadDeYatesAmarrados() {
		for(Yate yates: amarras) {
			cantidadDeYatesAmarrados++;
		}
		
		return cantidadDeYatesAmarrados;
	}

	public int getCantidadDeAmarrasDisponibles() {
		return this.getCantidadMaximaDeAmarras() - getCantidadDeYatesAmarrados();
	}

	public double obtenerPrecioAmarre(Yate yate) {
		return yate.getCostoMensual();
	}

	public double obtenerRecaudacionTotal() {
		return this.importeTotal;
	}
	
	public int getTamañoFondeadero(){
		return this.amarras.size();
	}
	
}