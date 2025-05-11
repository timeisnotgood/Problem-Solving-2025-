public class LEAPYEAR {
    public static void main(String[] args){
        int year = 2000;
        boolean isLeapYear = false;

        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If the year is divisible by 100, check if it is also divisible by 400
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400, so it's a leap year
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not by 100, so it's a leap year
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
