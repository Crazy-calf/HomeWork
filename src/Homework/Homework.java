package Homework;

import java.util.Scanner;

import org.junit.Test;

public class Homework {
	public static void main(String[] args){
		int a = 3, b = 4;
		System.out.println("before: a=" + a + " b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after: a=" + a + " b=" + b);
	}
	
    @Test
	public void Test(){
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}
	}
}
