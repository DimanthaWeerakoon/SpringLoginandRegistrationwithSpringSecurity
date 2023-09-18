package login_registration.Service;

import login_registration.Entity.User;
import login_registration.Model.UserModel;

public interface UserService {
    User save(UserModel userModel);
}
