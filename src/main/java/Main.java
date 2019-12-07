import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = Obj.nextLine();
        String message = PasswordChecker.passwordIsValid(password);
        logger.debug(PasswordChecker.passwordIsOk(password));
        logger.error(message);
        try {
            FileWriter writer = new FileWriter("errors.log");
            writer.write(message);
            writer.close();
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}
