package resources;

import model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    public ResponseEntity<User> findAll(){
        User user = new User(1L,"maik");
        return ResponseEntity.ok().body(user);
    }
}
