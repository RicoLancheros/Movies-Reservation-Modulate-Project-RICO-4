package rico.user_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rico.user_service.model.User;
import rico.user_service.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}