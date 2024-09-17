package ssdemo.asem.ROLE;

import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {
    private final roleservice roleService;

    public RoleController(roleservice roleService) {
        this.roleService = roleService;
    }
    @PostMapping("/secure/role")
    public void addRole(@RequestBody Role role){
         roleService.addRole(role);
    }

    @DeleteMapping("/secure/role/{id}")
    public void deleteRole(@PathVariable int id){
        roleService.deleteRole(id);
    }
}
