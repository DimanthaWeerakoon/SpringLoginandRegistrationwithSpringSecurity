package login_registration.Controller;

import login_registration.Model.UserModel;
import login_registration.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserModel userModel() {
        return new UserModel();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserModel userModel) {
        userService.save(userModel);
        return "redirect:/registration?success";
    }
}
