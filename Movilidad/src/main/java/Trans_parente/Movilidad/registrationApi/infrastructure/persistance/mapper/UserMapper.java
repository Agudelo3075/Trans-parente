package Trans_parente.Movilidad.registrationApi.infrastructure.persistance.mapper;

import org.springframework.stereotype.Component;

import Trans_parente.Movilidad.registrationApi.domain.models.Administrator;
import Trans_parente.Movilidad.registrationApi.domain.models.Driver;
import Trans_parente.Movilidad.registrationApi.domain.models.User;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities.AdministratorEntity;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities.DriverEntity;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities.UserEntity;

@Component
public class UserMapper {

    public User toDomain(UserEntity entity){
        try {
            
            if (entity instanceof DriverEntity) {
                DriverEntity driverEntity = (DriverEntity) entity;
                Driver driver = new Driver(
                    driverEntity.getId(),
                    driverEntity.getName(), 
                    driverEntity.getEmail(), 
                    driverEntity.getPassword(),
                    driverEntity.getLocation(), 
                    driverEntity.getConfiablidad()
                );
                return driver;

            } else if (entity instanceof AdministratorEntity) {
                AdministratorEntity administratorEntity = (AdministratorEntity) entity;
                Administrator administrator = new Administrator(
                    administratorEntity.getId(),
                    administratorEntity.getName(), 
                    administratorEntity.getEmail(), 
                    administratorEntity.getPassword(),
                    administratorEntity.getLocation(), 
                    administratorEntity.getCodigo()
                );
                return administrator;
            }

            throw new IllegalArgumentException("No se encuentra el usuario");
        } catch (Exception e) {
            throw e;
        }
    }
}
