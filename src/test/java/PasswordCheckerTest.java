import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PasswordCheckerTest {
    @Test
    void passwordExist() {
        assertSame("password should exist", PasswordChecker.passwordIsValid(""));
    }
    @Test
    void passwordLength() {
        assertSame("password should be longer than 8 characters",PasswordChecker.passwordIsValid("P"));
    }
    @Test
    void passwordLowercase() {
        assertSame("password should have at least one lowercase letter",PasswordChecker.passwordIsValid("PASSWORD1"));
    }
    @Test
    void passwordUppercase() {
        assertSame("password should have at least one uppercase letter",PasswordChecker.passwordIsValid("password1"));
    }
    @Test
    void passwordDigits() {
        assertSame("password should at least have one digit",PasswordChecker.passwordIsValid("Password!"));
    }
    @Test
    void passwordSpecialChar() {
        assertSame("password should have at least one special character",PasswordChecker.passwordIsValid("Password1"));
    }
    @Test
    void passwordIsOk(){
        assertSame("User password is not ok",PasswordChecker.passwordIsOk("P@ssw0rd"));
        assertSame("User password is ok",PasswordChecker.passwordIsOk("Passwords"));
    }
}