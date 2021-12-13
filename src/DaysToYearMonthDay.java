
//This program converts the date, which is given in days, to "Year: <years>,
// Month:<months>,Day:<days> format.

import java.util.Scanner;

public class DaysToYearMonthDay {

    public static void main(String[] args) {

        // ENTER NUMBER OF DAYS
        Scanner input =new Scanner(System.in);
        System.out.print("Number of days:");

        int number =input.nextInt();
        int Year =number / 365;
        System.out.print("Year: "+Year);
        int remainingNumber = number - (Year*365);
        int month= remainingNumber / 31  ;

        System.out.print(", Month: "+month);
        int day = remainingNumber -(month*31);
        System.out.print(", Day:"+day);


    }
}

