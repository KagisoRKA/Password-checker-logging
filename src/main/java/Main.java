import java.util.Scanner;
import org.apache.logging.log4j.*;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = Obj.nextLine();
        logger.debug(PasswordChecker.passwordIsOk(password));
        logger.error(PasswordChecker.passwordIsValid(password));
    }
}