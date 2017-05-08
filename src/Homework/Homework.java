package Homework;

public class Homework {
	public static void main(String[] args){
		int a = 3, b = 4;
		System.out.println("before: a=" + a + " b=" + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after: a=" + a + " b=" + b);
	}
}
