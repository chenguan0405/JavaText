package com.stduy.vehicle;

import java.util.Scanner;

public class Menu {
    int sel;
    int sel1;
    int sel2;
    int sel3;
    int key=0;
    int key1=0;
    int key2=0;
    int key3=0;
    Scanner scanner = new Scanner(System.in);
	public void menu() {
		while(true){
		System.out.println("*********menu********");
		System.out.println("��������ż�����������Ҫ�ĳ���");
		System.out.println("1.Limousine");
		System.out.println("2.Truck");
		System.out.println("3.Passengercar");
		System.out.println("4.�˳�");
		System.out.println("**********************");
		do {
			try {
				System.out.println("Please input your select : \n");
				
				sel = scanner.nextInt();
				// ��������ϵͳ����
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}while(sel < 0 || sel > 4);
		//scanner.close();
		switch(sel) {
		case 0:
			System.out.println("Thanks and Bye");
			System.exit(0);  // �˳�����
			break;
		case 1:
			Limousine car1 = new Limousine();
			while(true){
			System.out.println("���������ʵ������Ҫ�Ĳ���");
			System.out.println("1.��ʻ");
			System.out.println("2.Ϩ��");
			System.out.println("3.����");
			System.out.println("4.��ʾ������Ϣ");
			System.out.println("5.��װ������λ");
			System.out.println("6.�˳�");
			do {
				try {
					System.out.println("Please input your select : \n");
					sel1 = scanner.nextInt();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}while(sel < 0 || sel > 5);
			
			switch(sel1){
			case 1:
				car1.Runing();
				break;
			case 2:
				car1.Flameout();
				break;
			case 3:
				car1.Locking();
				break;
			case 4:
				car1.ShowIn();
				break;
			case 5:
				car1.Rseat();
				break;
			case 6:
				key1 = 520;
				break;
			default:
				System.out.println("Wrong choice!");	
			}
			if(key1 == 520) {
				break;
			}
			}
			break;
		case 2: 
			Truck car2 = new Truck();
			while(true) {
			System.out.println("���������ʵ������Ҫ�Ĳ���");
			System.out.println("1.��ʻ");
			System.out.println("2.Ϩ��");
			System.out.println("3.����");
			System.out.println("4.��ʾ������Ϣ");
			System.out.println("5.װ�ػ���");
			System.out.println("6.ж�ػ���");
			System.out.println("7.�˳�");
			do {
				try {
					System.out.println("Please input your select : \n");
					sel2 = scanner.nextInt();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}while(sel < 0 || sel > 6);
			//scanner.close();
			switch(sel2){
			case 1:
				car2.Runing();
				break;
			case 2:
				car2.Flameout();
				break;
			case 3:
				car2.Locking();
				break;
			case 4:
				car2.ShowIn();
				break;
			case 5:
				car2.Rweight();
				break;
			case 6:
				car2.Iweight();
				break;
			case 7:
				key2 = 520;
				break;
			default:
				System.out.println("Wrong choice!");	
			}
			if(key2 == 520) {
				break;
			}
			}
			break;
		case 3:
			Passengercar car3 = new Passengercar();
			while(true) {
			System.out.println("���������ʵ������Ҫ�Ĳ���");
			System.out.println("1.��ʻ");
			System.out.println("2.Ϩ��");
			System.out.println("3.����");
			System.out.println("4.��ʾ������Ϣ");
			System.out.println("5.���ӳ����ϵ�����");
			System.out.println("6.���ٳ����ϵ�����");
			System.out.println("7.�˳�");
			do {
				try {
					System.out.println("Please input your select : \n");
					sel3 = scanner.nextInt();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}while(sel < 0 || sel > 6);
			//scanner.close();
			switch(sel3){
			case 1:
				car3.Runing();
				break;
			case 2:
				car3.Flameout();
				break;
			case 3:
				car3.Locking();
				break;
			case 4:
				car3.ShowIn();
				break;
			case 5:
				car3.Rpassenger();
				break;
			case 6:
				car3.Ipassenger();
				break;
			case 7:
				key3 = 520;
				break;
			default:
				System.out.println("Wrong choice!");	
			}
			if(key3 == 520) {
				break;
			}
			}
			break;
		case 4:
			key = 520;
			break;
		default:
			System.out.println("Wrong choice!");
		}
		if(key == 520) {
			System.out.println("�˳��ɹ�");
			break;
		}
		}
	}
}
