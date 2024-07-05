import java.util.Scanner;

public class Task240704 {
    public static void main(String[] args){
        
        String star = "☆";

        Scanner scanner =new Scanner(System.in);

        System.out.println("名前を入力してください");

        String date = scanner.next();

        for(int sum = 0; sum <= 14; sum++){
            //swich文
            switch (star) {
                case "☆":
                 System.out.print(star);
                 star = "★";
                 break;
        
                default:
                 System.out.print(star);
                 star = "☆";
                 break;
            }
        }

        System.out.println("");

        System.out.println("HAPPY BIRTHDAY");

        //while文
        int sum = 0;
        while (sum < 12) {
            if(sum >= 0 && sum <= 4){
                System.out.print(star);
                star = "★";
                sum++;
            }else if(sum >= 6 && sum <= 11){
                System.out.print(star);
                //star = "☆";
                sum++;
            }else{
                System.out.print(date);
                star = "☆";
                sum++;
            }
        }
    }
}
