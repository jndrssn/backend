package com.porfolio.janderssen.Security.Repository;

import com.porfolio.janderssen.Security.Entity.Rol;
import com.porfolio.janderssen.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
