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
		type = "��������Veneno";
		speed = 340.00;
		mileage = 0.00;
		number = "��D0405";
		seat = 2;
	}
	
	Calendar cal = Calendar.getInstance();
	@Override
	public void Runing() {
		// TODO Auto-generated method stub
		if(key2 == 1) {
			key22 = 1;
			System.out.println("���ƺ�Ϊ����D0405������������Veneno�Ѿ���ʼ��ʻ");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
		}
	}

	public void Flameout() {
		// TODO Auto-generated method stub
		if(key2 == 1) {
			key22 = 2;
			endTimeInMillis=Calendar.getInstance().getTimeInMillis();
			spendTimeInMillis=endTimeInMillis-startTimeInMillis;
			mileage += (spendTimeInMillis/360000)*speed;
			System.out.println("�ó��Ѿ�Ϩ��");
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
		}
	}

	public void Locking() {
		if(key22 == 2) {
		key2 = 0;
		System.out.println("�����ɹ�");
		}
		else {
			System.out.println("�ó�������ʹ������Ϩ���ٽ��в���");
		}
	}

	@Override
	public void ShowIn() {
//		mileage += (spendTimeInMillis/360)*speed;
		// TODO Auto-generated method stub
		System.out.println("���ͣ�"+type);
		System.out.println("���ƣ�"+number);
		System.out.println("��λ����"+seat);
		System.out.println("��ʻ���"+mileage+"km");
	}
	public void Rseat() {
		System.out.println("�ö��⳵�Ͳ�֧�ָ�װ��λ��");
	}
	public void Iseat() {
		System.out.println("�ö��⳵�Ͳ�֧�ָ�װ��λ��");
	}

}
