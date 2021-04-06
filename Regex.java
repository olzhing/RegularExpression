import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



            System.out.println("Good day, please enter your license plate number.");
            System.out.println("License plate number: ");
            String plateNumber = scanner.nextLine();

            plateNumber = plateNumber.toUpperCase();




            Matcher m = Pattern.compile("^KZ[0-9]{3}[A-Z]{3}02$").matcher(plateNumber);
            Matcher n = Pattern.compile("^A[0-9]{3}[A-Z]{3}$").matcher(plateNumber);
            if (m.find()) {
                System.out.println("Yes");
            }
            else if (n.find()) {
                System.out.println("Yes");
            }

                else
            {
                System.out.println("No");
            }

        }

}
