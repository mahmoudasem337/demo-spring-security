package ssdemo.asem.USER;

import org.springframework.stereotype.Service;

@Service
public class userService {
    private final userRepo userRepo;

    public userService(ssdemo.asem.USER.userRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User adduser(User user){
        User u=userRepo.save(user);
        return u;
    }
    public void deleteuser(int id){
        userRepo.deleteById(id);
    }
}
