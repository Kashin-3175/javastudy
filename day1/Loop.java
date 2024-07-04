package day1;

public class Loop {

	public static void main(String[] args) {

		// ■
		// ■■
		// ■■■
		// ■■■■
		// ■■■■■
		for(int i = 1; i <=5; i++) {

			for(int j = 1; j <= i; j++) {
				System.out.print("■");
			}

			System.out.println("");
		}

		System.out.println("");

		for(int i = 5; i >=1; i--) {
			for(int j = 5; j >= 6-i; j--) {
				System.out.print("■");
			}
			System.out.println("");
		}


		// ■■■■■
		// ■■■■
		// ■■■
		// ■■
		// ■

		// 2~9段まで九九処理を作成
		for(int i = 2; i<= 9; i++) {
		    for(int j = 1; j <= 9; j++) {
			    System.out.println(i + "×" +  j + "＝" + (i * j));
		    }
		}
	}

}
