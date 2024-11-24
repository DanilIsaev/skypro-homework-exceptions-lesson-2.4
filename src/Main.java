import javax.xml.transform.SourceLocator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        Validation validation = new Validation();

        validation.loginVerification(login);
        validation.passwordVerification(password);
        validation.passwordComparison(password, confirmPassword);
    }
}