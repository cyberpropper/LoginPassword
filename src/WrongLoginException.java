
public class WrongLoginException extends IllegalAccessException{
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String massage) {
        super(massage);
    }
}
