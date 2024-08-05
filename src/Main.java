public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_1";
        try {
            ServiceInterface.check(login, password, confirmPassword);
        } finally {
            System.out.println("Данные обработаны");
        }
    }
}