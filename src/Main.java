public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_1";
        try {
            ServiceInterface.check(login, password, confirmPassword);
        }  catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Данные обработаны");
        }
    }
}