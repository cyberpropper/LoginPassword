
public interface ServiceInterface {
    static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин не может содержать больше 20 символов");
        }

        if (!containsValidCharacters(login))  {
            throw new WrongLoginException("Логин не может содержать недопустимые символы");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не может содержать больше 20 символов");
        }

        if (!containsValidCharacters(password))  {
            throw new WrongPasswordException("Пароль не может содержать недопустимые символы");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword не совпадают");
        }
    }

    static boolean containsValidCharacters (String string) {
        String charValid = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_";
        char e, e1;
        boolean charIsValid = false;
        for  (int i = 0; i < string.length(); i++) {
            e = string.charAt(i);
            for (int l = 0; l < charValid.length(); l++) {
                e1 = charValid.charAt(l);
                if (e == e1) {
                    charIsValid = true;
                    break;
                } else {
                    charIsValid = false;
                }
            }
        }
        return charIsValid;
    }
}
