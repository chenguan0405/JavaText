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
		System.out.println("请输入序号监控与管理你想要的车型");
		System.out.println("1.Limousine");
		System.out.println("2.Truck");
		System.out.println("3.Passengercar");
		System.out.println("4.退出");
		System.out.println("**********************");
		do {
			try {
				System.out.println("Please input your select : \n");
				
				sel = scanner.nextInt();
				// 创建操作系统进程
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}while(sel < 0 || sel > 4);
		//scanner.close();
		switch(sel) {
		case 0:
			System.out.println("Thanks and Bye");
			System.exit(0);  // 退出程序
			break;
		case 1:
			Limousine car1 = new Limousine();
			while(true){
			System.out.println("请输入序号实现你想要的操作");
			System.out.println("1.行驶");
			System.out.println("2.熄火");
			System.out.println("3.锁车");
			System.out.println("4.显示车辆信息");
			System.out.println("5.改装车辆座位");
			System.out.println("6.退出");
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
			System.out.println("请输入序号实现你想要的操作");
			System.out.println("1.行驶");
			System.out.println("2.熄火");
			System.out.println("3.锁车");
			System.out.println("4.显示车辆信息");
			System.out.println("5.装载货物");
			System.out.println("6.卸载货物");
			System.out.println("7.退出");
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
			System.out.println("请输入序号实现你想要的操作");
			System.out.println("1.行驶");
			System.out.println("2.熄火");
			System.out.println("3.锁车");
			System.out.println("4.显示车辆信息");
			System.out.println("5.增加车辆上的人数");
			System.out.println("6.减少车辆上的人数");
			System.out.println("7.退出");
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
			System.out.println("退出成功");
			break;
		}
		}
	}
}
