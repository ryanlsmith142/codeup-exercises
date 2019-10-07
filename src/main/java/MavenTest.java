import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)) {
            System.out.println("That's a number");
        } else {
            System.out.println("That's not a number");
        }

        System.out.println("Reverse case: " + StringUtils.reverse(userInput));

        System.out.println("Flip case: " + StringUtils.swapCase(userInput));


    } //main()
} //MavenTest Class
