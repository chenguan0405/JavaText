package com.stduy.vehicle;

import java.util.Calendar;
import java.util.Scanner;

public class Truck extends Vehilce {
	private double weight;
	private int key1 = 1;
	private int key11 = 2;
	public double startTimeInMillis;
	public double endTimeInMillis;
	public double spendTimeInMillis;
	public Truck() {
		type = "德龙x3000";
		speed = 40.00;
		number = "湘N20010405";
		mileage = 0.00;
		weight = 0.00;
	}
	Calendar cal = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);
	@Override
	public void Runing() {
		// TODO Auto-generated method stub
		if(key1 == 1) {
			key11 = 1;
			System.out.println("车牌号为“湘N20010405”的德龙x3000已经开始行驶");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("该车已经被锁死无法使用");
		}
	}

	@Override
	public void Flameout() {
		// TODO Auto-generated method stub
		if(key1 == 1) {
			key11 = 2;
			endTimeInMillis=Calendar.getInstance().getTimeInMillis();
			spendTimeInMillis=endTimeInMillis-startTimeInMillis;
			mileage += (spendTimeInMillis/360000)*speed;
			System.out.println("该车已经熄火");
		}
		else {
			System.out.println("该车已经被锁死无法使用");
		}
	}

	@Override
	public void Locking() {
		// TODO Auto-generated method stub
		if(key11 == 2) {
		key1 = 0;
		System.out.println("锁车成功");
		}
		else {
			System.out.println("该车正在行使，请先熄火再进行操作");
		}
	}

	@Override
	public void ShowIn() {
		// TODO Auto-generated method stub
		System.out.println("车型："+type);
		System.out.println("车牌："+number);
		System.out.println("载重："+weight);
		System.out.println("行驶里程"+mileage+"km");
	}
	public void Rweight() {
		System.out.println("请输入增重斤数");
		double weight1 = scanner.nextDouble();
		this.weight += weight1;
		System.out.println("成功载重"+weight1+"斤");
	}
	public void Iweight() {
		System.out.println("请输入卸货斤数");
		double weight2 = scanner.nextDouble();
		this.weight -= weight2;
		System.out.println("成功卸重"+weight2+"斤");
	}

}
