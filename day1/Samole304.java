package day1;

import java.util.Scanner;

public class Samole304 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		System.out.println("1-7までの数字を入力");
		int dice = sc.nextInt();

		System.out.println("さいころの目："+dice);

		if(1 <= dice && dice <= 6) {
			if(dice == 2 || dice == 4 || dice == 6) {
				System.out.println("丁（ちょう）です。");
			}else {
				System.out.println("半＜はん＞です。");
			}
		}else {
			System.out.println("範囲外の数値です。");
		}

		int one = 1;
		System.out.println();

	}

}
