package rico.reservation_service.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long userId) {
        super("El usuario con ID " + userId + " no existe");
    }
}