package login_registration.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserModel(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public UserModel() {
    }
}
