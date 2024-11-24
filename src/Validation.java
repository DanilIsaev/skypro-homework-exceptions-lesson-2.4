import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validation {

    private final String regex = "[a-zA-Z0-9_]*";//разрешенные символы
    private final int fieldLength = 20;

    void loginVerification(String login) {
        if (login.length() <= fieldLength && login.matches(regex)) {

        } else {
            throw new WrongLoginException("Количество знаков превышено или используются недопустимые символы");
        }
    }

    void passwordVerification(String password) {
        if (password.length() <= fieldLength && password.matches(regex)) {

        } else {
            throw new WrongPasswordException("Количество знаков превышено или используются недопустимые символы");
        }
    }



}
