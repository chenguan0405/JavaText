package com.stduy.vehicle;

import java.util.Calendar;

public class Limousine extends Vehilce {
	private int seat;
	private int key2 = 1;
	private int key22 = 2;
	public double startTimeInMillis;
	public double endTimeInMillis;
	public double spendTimeInMillis;
	public Limousine() {
		type = "兰博基尼Veneno";
		speed = 340.00;
		mileage = 0.00;
		number = "湘D0405";
		seat = 2;
	}
	
	Calendar cal = Calendar.getInstance();
	@Override
	public void Runing() {
		// TODO Auto-generated method stub
		if(key2 == 1) {
			key22 = 1;
			System.out.println("车牌号为“湘D0405”的兰博基尼Veneno已经开始行驶");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("该车已经被锁死无法使用");
		}
	}

	public void Flameout() {
		// TODO Auto-generated method stub
		if(key2 == 1) {
			key22 = 2;
			endTimeInMillis=Calendar.getInstance().getTimeInMillis();
			spendTimeInMillis=endTimeInMillis-startTimeInMillis;
			mileage += (spendTimeInMillis/360000)*speed;
			System.out.println("该车已经熄火");
		}
		else {
			System.out.println("该车已经被锁死无法使用");
		}
	}

	public void Locking() {
		if(key22 == 2) {
		key2 = 0;
		System.out.println("锁车成功");
		}
		else {
			System.out.println("该车正在行使，请先熄火再进行操作");
		}
	}

	@Override
	public void ShowIn() {
//		mileage += (spendTimeInMillis/360)*speed;
		// TODO Auto-generated method stub
		System.out.println("车型："+type);
		System.out.println("车牌："+number);
		System.out.println("座位数："+seat);
		System.out.println("行驶里程"+mileage+"km");
	}
	public void Rseat() {
		System.out.println("该顶尖车型不支持改装座位数");
	}
	public void Iseat() {
		System.out.println("该顶尖车型不支持改装座位数");
	}

}
