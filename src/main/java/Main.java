
import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        System.out.println("Check if the year you type in is a leap year or not!: ");


    Scanner input = new Scanner(System.in);
            int year = input.nextInt();


            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year! ");
    }
            else {
        System.out.println(year + " is not a leap year. ");
    }
}
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return (year % 4 == 0);
    }

}