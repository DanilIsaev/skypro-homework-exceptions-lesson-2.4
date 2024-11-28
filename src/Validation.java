import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validation {

    private final String regex = "[a-zA-Z0-9_]*";//разрешенные символы
    private final int fieldLength = 20;
    boolean isCredentialsCorrect;

    void loginVerification(String login) {
        isCredentialsCorrect = login.length() <= fieldLength && login.matches(regex);
        if (!isCredentialsCorrect) {
            throw new WrongLoginException("Количество знаков превышено или используются недопустимые символы");
        }
    }

    void passwordVerification(String password) {
        isCredentialsCorrect = password.length() <= fieldLength && password.matches(regex);
        if (!isCredentialsCorrect) {
            throw new WrongPasswordException("Количество знаков превышено или используются недопустимые символы");
        }
    }

    void passwordComparison(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }


}
