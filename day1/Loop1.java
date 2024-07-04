package day1;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input num");
		System.out.println("1.input ")

		String input = sc.next();

		while(!input.equals("0")) {
		 System.out.println(input + "を入力しました。");
		 System.out.println("0を入力すると終了");
		 System.out.println("input num");
		 input = sc.next();

		}
		System.out.println("program is finished");

	}

}
