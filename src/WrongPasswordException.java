public class WrongPasswordException extends IllegalAccessException{
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String massage) {
        super(massage);
    }
}

