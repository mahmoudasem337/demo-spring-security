package ssdemo.asem.SECURITY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ssdemo.asem.USER.User;
import ssdemo.asem.USER.userRepo

import java.util.Optional;

@Service
public class UDS implements UserDetailsService {

    @Autowired
    private userRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve user from the database
        Optional<User> userEntity = userRepository.findByUsername(username);
        if (userEntity.isEmpty()) {
            throw new UsernameNotFoundException("User not found");
        }

        // Build a UserDetails object
        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(userEntity.get().getUsername())
                .password(userEntity.get().getPassword())
                .roles(userEntity.get().getRole())//getRole return Role , function require String as return type.
                .build();

        return userDetails;
    }
}
