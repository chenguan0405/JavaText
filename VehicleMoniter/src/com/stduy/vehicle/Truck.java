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
		type = "����x3000";
		speed = 40.00;
		number = "��N20010405";
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
			System.out.println("���ƺ�Ϊ����N20010405���ĵ���x3000�Ѿ���ʼ��ʻ");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
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
			System.out.println("�ó��Ѿ�Ϩ��");
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
		}
	}

	@Override
	public void Locking() {
		// TODO Auto-generated method stub
		if(key11 == 2) {
		key1 = 0;
		System.out.println("�����ɹ�");
		}
		else {
			System.out.println("�ó�������ʹ������Ϩ���ٽ��в���");
		}
	}

	@Override
	public void ShowIn() {
		// TODO Auto-generated method stub
		System.out.println("���ͣ�"+type);
		System.out.println("���ƣ�"+number);
		System.out.println("���أ�"+weight);
		System.out.println("��ʻ���"+mileage+"km");
	}
	public void Rweight() {
		System.out.println("���������ؽ���");
		double weight1 = scanner.nextDouble();
		this.weight += weight1;
		System.out.println("�ɹ�����"+weight1+"��");
	}
	public void Iweight() {
		System.out.println("������ж������");
		double weight2 = scanner.nextDouble();
		this.weight -= weight2;
		System.out.println("�ɹ�ж��"+weight2+"��");
	}

}
