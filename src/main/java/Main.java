import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Set your password: ");
        String password = Obj.nextLine();
        System.out.println(PasswordChecker.passwordIsOk(password));
        System.out.println(PasswordChecker.passwordIsValid(password));
    }
}