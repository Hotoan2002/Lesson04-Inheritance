package advance.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person [] = new Person[5];
		Scanner sc = new Scanner(System.in);
		int flag;
		for (int i = 0; i < person.length; i++) {
			System.out.println("Ban muon nhap sinh vien (0) / giao vien (1)");
			flag = sc.nextInt();
			sc.nextLine();
			if(flag == 0) {
				//Nhap sinh vien
				System.out.println("Nhap ten sinh vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi sinh vien");
				int old = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi sinh vien");
				String address = sc.nextLine();
				
				System.out.println("Nhap diem trung binh sinh vien");
				float dtb = sc.nextFloat();
				sc.nextLine();
				
				person [i] = new Student(name, old, address, dtb);
					
			}else{
				//Nhap giao vien
				System.out.println("Nhap ten giao vien");
				String name = sc.nextLine();
				
				System.out.println("Nhap tuoi giao vien");
				int old = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Nhap dia chi giao vien");
				String address = sc.nextLine();
				
				System.out.println("Nhap he so luong giao vien");
				float hsl = sc.nextFloat();
				sc.nextLine();
				
				person [i] = new Student(name, old, address, hsl);
			}			
		}
		print(person);
	}
	
	static void print(Person person[]) {
		for (int i = 0; i < person.length; i++) {
			
		}
	}
}