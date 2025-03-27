package rico.reservation_service.client;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import rico.reservation_service.client.DTO.UserDTO;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserClient {
    @GetMapping("/user/{userId}")
    ResponseEntity<UserDTO> getUserById(@PathVariable Long userId); // Usa UserDTO
}
