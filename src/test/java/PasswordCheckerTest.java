import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordCheckerTest {
    @Test
    void passwordIsValid(){
        assertSame("password should exist",PasswordChecker.passwordIsValid(""));
        assertSame("password should be longer than 8 characters",PasswordChecker.passwordIsValid("P"));
        assertSame("password should have at least one lowercase letter",PasswordChecker.passwordIsValid("PASSWORD1"));
        assertSame("password should have at least one uppercase letter",PasswordChecker.passwordIsValid("password1"));
        assertSame("password should at least have one digit",PasswordChecker.passwordIsValid("Password!"));
        assertSame("password should have at least one special character",PasswordChecker.passwordIsValid("Password1"));
    }
    @Test
    void passwordIsOk(){
         assertSame(false,PasswordChecker.passwordIsOk("P@ssw0rd"));
         assertSame(true,PasswordChecker.passwordIsOk("Passwords"));
    }
}