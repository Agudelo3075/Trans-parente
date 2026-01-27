package Trans_parente.Movilidad.registrationApi.infrastructure.persistance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities.UserEntity;

@Repository
public interface ORMregister extends JpaRepository<UserEntity, Long> {
    
}
