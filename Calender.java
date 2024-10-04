import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

class MyCalander{

        // Method to print the calendar for a given month and year
        public static void MySimpleCalender(int year,int month){

            // Create a calendar object for the given month and year

            GregorianCalendar calendar=new GregorianCalendar(year,month-1,1);

            // Get the number of days in the month
            int daysInMonth=calendar.getActualMaximum(calendar.DAY_OF_MONTH);

            // Get the starting day of the week for the first day of the month
            int startDay=calendar.get(calendar.DAY_OF_WEEK);

            // Print the calendar header
            System.out.println(" "+calendar.getDisplayName(calendar.MONTH,calendar.LONG,java.util.Locale.ENGLISH)+" "+year);
            System.out.println(" su mo tu we th fr sa");

            // Print leading spaces for the first week
            for(int i=1;i<startDay;i++)
            {
                System.out.printf("   ");
            }

            // Print the days of the month
            for(int Day=1;Day<=daysInMonth;Day++){
                System.out.printf("%2d ",Day);

                // Move to the next line after every Saturday
                if((Day+startDay-1)%7==0){
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // Get the year from the user
        System.out.print("enter year:");
        int year=sc.nextInt();

        // Get the month from the user
        System.out.print("enter month(1-12):");
        int month=sc.nextInt();

        // Print the calendar for the given month and year
        MySimpleCalender(year,month);

    }
}
