package day1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		System.out.println("整数を入力してください:");
		int number = scanner.nextInt();

		if(number % 2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}


	}

}
