import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters;
        double miles;
        double feet;
        double inches;

        System.out.print("Enter measurement in meters : ");

        if (in.hasNextDouble())
        {
            meters = in.nextDouble();

            System.out.print("The measurement in meters : ");

            System.out.println(meters);

            miles = meters * 0.000621371;

            feet = miles * 5280;

            inches = feet * 12;

            System.out.print("The measurement in miles : ");

            System.out.println(miles);

            System.out.print("The measurement in feet : ");

            System.out.println(feet);

            System.out.print("The measurement in inches : ");

            System.out.println(inches);
        }
        else

        {
            System.out.println("Input meters value is not valid");
        }

    }

}