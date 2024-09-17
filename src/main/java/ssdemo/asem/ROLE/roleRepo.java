package ssdemo.asem.ROLE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepo extends JpaRepository<Role,Integer> {
}
