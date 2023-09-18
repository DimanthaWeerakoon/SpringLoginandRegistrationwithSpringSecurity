package login_registration.Service;

import login_registration.Entity.Role;
import login_registration.Entity.User;
import login_registration.Model.UserModel;
import login_registration.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserModel userModel) {
        User user = new User(userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(), userModel.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
