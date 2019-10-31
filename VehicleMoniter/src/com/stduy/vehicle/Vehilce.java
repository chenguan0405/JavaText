package com.stduy.vehicle;

public abstract class Vehilce {
	public String type;
	public double speed;
	public double mileage;
	public String number;
	
	public abstract void Runing();
	public abstract void Flameout();
	public abstract void Locking();
	public abstract void ShowIn();
	
}
