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

    public UserEntity toEntity(User user){
        try {
            if(user instanceof Driver){
                DriverEntity entity = new DriverEntity();
                mapCommonFields(user, entity);
                entity.setConfiablidad(((Driver) user).getConfiabilidad());
                return entity;
            }else if(user instanceof Administrator){
                AdministratorEntity entity = new AdministratorEntity();
                entity.setCodigo(((Administrator) user).getCodigo());
                return entity;
            }
            throw new IllegalArgumentException("Unknown user type");
            
        } catch (Exception e) {
            throw e;
        }
    }

    private void mapCommonFields(User domain, UserEntity entity){
        try {
            entity.setId(domain.getId());
            entity.setName(domain.getName());
            entity.setEmail(domain.getEmail());
            entity.setPassword(domain.getPassword());
            entity.setLocation(domain.getLocation());
        } catch (Exception e) {
            throw e;
        }
    }
}
