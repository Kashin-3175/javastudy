package day1;

import java.util.Scanner;

/*出力結果
☆★☆★☆★☆★☆★☆★☆★☆
HAPPY BIRTHDAY
★★★★★★FRIEND☆☆☆☆☆☆
*/

public class Task {
    public static void main(String[] args){

        String star = "☆";

        Scanner scanner =new Scanner(System.in);

        System.out.println("名前を入力してください");

        String friendName = scanner.next();

        for(int sum = ; sum <= ; sum++){
            //swich文
            switch (star) {
                case "☆":
                 System.out.print(star);
                 star = "★";
                 ;

                default:
                 System.out.print();
                 star = "☆";
                 break;
            }
        }
        //HAPPY BIRTHDAYを出力
        System.out.println();
        System.out.println("HAPPY BIRTHDAY");

        //while文
        int sum = 0;
        while (sum < ) {
            if(sum >= 0 && sum <= 5){
                System.out.print(star);
                star = "★";
                sum++;
            }else if(sum >=  && sum <= ){
                System.out.print(star);
                sum++;
            }else{
                System.out.print(friendName);
                star = "☆";
                ;
            }
        }
    }
}





/*
import java.util.Scanner;

出力結果
☆★☆★☆★☆★☆★☆★☆★☆
HAPPY BIRTHDAY
★★★★★★FRIEND☆☆☆☆☆☆


public class Task {
    public static void main(String[] args){

        String star = "☆";

        Scanner scanner =new Scanner(System.in);

        System.out.println("名前を入力してください");

        String friendName = scanner.next();

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
        //HAPPY BIRTHDAYを出力
        System.out.println();
        System.out.println("HAPPY BIRTHDAY");

        //while文
        int sum = 0;
        while (sum < 13) {
            if(sum >= 0 && sum <= 5){
                System.out.print(star);
                star = "★";
                sum++;
            }else if(sum >= 7 && sum <= 12){
                System.out.print(star);
                //star = "☆";
                sum++;
            }else{
                System.out.print(friendName);
                star = "☆";
                sum++;
            }
        }
    }
}
*/
