import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validation {

    private String regex = "[a-zA-Z0-9_]*";//разрешенные символы

    //System.out.println(login.matches(regex));

    void loginVerification(String login) {
        if (login.length() <= 20 && login.matches(regex)) {

        } else {
           throw new WrongLoginException("Слишком длинный логин или используются запрещенные символы");
        }
    }
}
