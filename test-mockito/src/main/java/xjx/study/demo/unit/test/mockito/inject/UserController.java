package xjx.study.demo.unit.test.mockito.inject;

public class UserController {

    private UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    public Object getUserList() {
        return userService.getList();
    }
}
