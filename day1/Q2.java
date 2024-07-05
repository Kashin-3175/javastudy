package day1;

public class Q2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {1,2,3,4,5};
		int[] doubledNumbers = new int[numbers.length];

		for(int i = 0; i < numbers.length; i++) {
			doubledNumbers[i] = numbers.length * 2;
		}
		for(int num : doubledNumbers) {
			System.out.println(num);
		}

	}

}
