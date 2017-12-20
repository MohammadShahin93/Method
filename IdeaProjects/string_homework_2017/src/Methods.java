import java.text.SimpleDateFormat;
import java.util.Date;

public class Methods {

    public static void main(String[] args){

        //displays the current date
        System.out.println(getCurrentDate());

        // finds the square root of the given value
        printDoubleValue(squareRoot(81));

        // gets the season if the month is December
        printToConsole(nameOfSeason("December"));

        // adds x + y
        printDoubleValue(addition(5, 5));

        // subtracts x - y
        printDoubleValue(subtraction(10, 6));

        // multiplies x * y
        printDoubleValue(multiplication(5, 6));

        // divides x / y
        printDoubleValue(division(25, 5));
    }


    public static void printToConsole (String value){
        System.out.println(value);
    }

    public static void printDoubleValue (double value){
        System.out.println(value);
    }

    public static String getCurrentDate(){

        /**
         1. Create a method the prints todays date in this format dd/MM/yyyy
         */

        Date myDate = new Date();
        SimpleDateFormat todaysDate = new SimpleDateFormat("dd/MM/yyy");

        String currentDate = todaysDate.format(myDate);
        return currentDate;
    }

    /**
     2. Create a method that always returns a sqrt of any number which is passed on to method
     */
    public static double squareRoot (double x){
        Double getResult = (Math.sqrt(x));
        return getResult;

    }

    /**
     3. Create a method that that prints the month name based on the season name
     */

    public static String nameOfSeason (String month){

        String currentSeason = null;

        switch (month){
            case "March":
            case "April":
            case "May":
                currentSeason = "Spring";
                System.out.println(currentSeason);
                return month;
            case "June":
            case "July":
            case "August":
                currentSeason = "Summer";
                System.out.println(currentSeason);
                return month;
            case "September":
            case "October":
            case "November":
                currentSeason = "Fall";
                System.out.println(currentSeason);
                return month;
            case "December":
            case "January":
            case "February":
                currentSeason = "Winter";
                System.out.println(currentSeason); }
        return month;
    }

    /**
     * 4. Create a simple calculator which allows user to add, subtract, multiply and divide any two numbers and prints the results
     */


    public static double addition (double x, double y){

        return x + y;
    }
    public static double subtraction (double x, double y){

        return x - y;
    }
    public static double multiplication (double x, double y){

        return x * y;
    }
    public static double division (double x, double y){

        return x / y;
    }


}
