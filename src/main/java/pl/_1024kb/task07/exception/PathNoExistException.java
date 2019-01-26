package pl._1024kb.task07.exception;

public class PathNoExistException extends RuntimeException
{
    public PathNoExistException()
    {
    }

    public PathNoExistException(String message) {
        super(message);
    }
}
