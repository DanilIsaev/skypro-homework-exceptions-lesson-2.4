import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Validation {

    private final String regex = "[a-zA-Z0-9_]*";//разрешенные символы
    private final int fieldLength = 20;

    void loginVerification(String login) {
        checkingLength(login, fieldLength);
        checkingСharacters(login, regex);
    }

    void passwordVerification(String password) {
        checkingLength(password, fieldLength);
        checkingСharacters(password, regex);
    }

    private void checkingLength(String string, int lengh) {
        try {
            if (string.length() <= lengh) {

            } else {
                throw new WrongLoginException("Количество знаков превышено");
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }

    private void checkingСharacters(String string, String regex) {
        try {
            if (string.matches(regex)) {

            } else {
                throw new WrongLoginException("Используются запрещенные символы");
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }

}
