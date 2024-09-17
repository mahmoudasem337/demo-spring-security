package ssdemo.asem.ROLE;

import org.springframework.stereotype.Service;

@Service
public class roleservice{
    private final roleRepo roleRepository;
    public roleservice(roleRepo roleRepository) {
        this.roleRepository = roleRepository;
    }
    public void addRole(Role role) {
         roleRepository.save(role);
    }
    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }
}
