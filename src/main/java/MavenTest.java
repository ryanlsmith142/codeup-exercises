import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTest {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Something: ");
//        String userInput = sc.nextLine();
//        System.out.println("You entered: " + userInput);
//        if(StringUtils.isNumeric(userInput)) {
//            System.out.println("That's a number");
//        } else {
//            System.out.println("That's not a number");
//        }
//
//        System.out.println("Reverse case: " + StringUtils.reverse(userInput));
//
//        System.out.println("Flip case: " + StringUtils.swapCase(userInput));

        Faker faker = new Faker();

        System.out.println(faker.princessBride().quote());
        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

        System.out.println(name);

        System.out.println(firstName);

        System.out.println(lastName);

        System.out.println(streetAddress);


    } //main()
} //MavenTest Class
