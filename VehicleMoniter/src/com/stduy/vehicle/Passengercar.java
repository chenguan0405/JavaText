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
		type = "����SWB6109BEV36����";
		speed = 30.00;
		number = "��CG123456";
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
			System.out.println("���ƺ�Ϊ����CG123456��������SWB6109BEV36�����Ѿ���ʼ��ʻ");
			startTimeInMillis=Calendar.getInstance().getTimeInMillis();
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
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
			System.out.println("�ó��Ѿ�Ϩ��");
		}
		else {
			System.out.println("�ó��Ѿ��������޷�ʹ��");
		}
	}

	@Override
	public void Locking() {
		// TODO Auto-generated method stub
		if(key33 == 2) {
		key3 = 0;
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
		System.out.println("�˿�����"+passenger);
		System.out.println("��ʻ���:"+mileage+"km");
	}
	public void Rpassenger() {
		System.out.println("�������ϳ�����");
		int passenger1 = scanner.nextInt();
		this.passenger += passenger1;
		System.out.println("�ϳ�" + passenger1 + "��");
	}
	public void Ipassenger() {
		System.out.println("�������³�����");
		int passenger2 = scanner.nextInt();
		this.passenger -= passenger2;
		System.out.println("�³�" + passenger2 + "��");
	}

}
