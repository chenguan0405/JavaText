package com.stduy.vehicle;
import java.util.Calendar;
import java.util.Scanner;
public class Passengercar extends Vehilce {
	private int passenger;
	private int key3 = 1;
	private int key33 = 2;
	public double startTimeInMillis;
	public double endTimeInMillis;
	public double spendTimeInMillis;
	public  Passengercar() {
		type = "申沃SWB6109BEV36车型";
		speed = 30.00;
		number = "湘CG123456";
		mileage = 0.00;
		passenger = 1;
	}
	
	Calendar cal = Calendar.getInstance();
	Scanner scanner = new Scanner(System.in);
	@Override
	public void Runing() {
		// TODO Auto-generated method stub
		if(key3 == 1) {
			key33 = 1;
			System.out.println("车牌号为“湘CG123456”的申沃SWB6109BEV36车型已经开始行驶");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("该车已经被锁死无法使用");
		}
	}

	@Override
	public void Flameout() {
		// TODO Auto-generated method stub
		if(key3 == 1) {
			key33 = 2;
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
		if(key33 == 2) {
		key3 = 0;
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
		System.out.println("乘客数："+passenger);
		System.out.println("行驶里程:"+mileage+"km");
	}
	public void Rpassenger() {
		System.out.println("请输入上车人数");
		int passenger1 = scanner.nextInt();
		this.passenger += passenger1;
		System.out.println("上车" + passenger1 + "人");
	}
	public void Ipassenger() {
		System.out.println("请输入下车人数");
		int passenger2 = scanner.nextInt();
		this.passenger -= passenger2;
		System.out.println("下车" + passenger2 + "人");
	}

}
