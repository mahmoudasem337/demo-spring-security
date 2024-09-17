package ssdemo.asem.USER;

import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

    private final userService userService;

    public userController(ssdemo.asem.USER.userService userService) {
        this.userService = userService;
    }

    @GetMapping("/secure")
    public  String sayhello () {
        return "Secure Hello";
    }
    @GetMapping("/notsecure")
    public  String sayHello () {
        return "Hello";
    }


    @PostMapping("/secure/user")
    public User addUser(@RequestBody User user){
        User u=userService.adduser(user);
         return u;}

    @DeleteMapping("/secure/user/{id}")
    public void deleteUser(@PathVariable int id){
         userService.deleteuser(id);}
}
