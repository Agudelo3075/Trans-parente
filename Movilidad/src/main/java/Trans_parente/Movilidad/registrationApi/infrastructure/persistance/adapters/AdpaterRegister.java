package Trans_parente.Movilidad.registrationApi.infrastructure.persistance.adapters;

import org.springframework.stereotype.Component;

import Trans_parente.Movilidad.registrationApi.domain.models.User;
import Trans_parente.Movilidad.registrationApi.domain.ports.out.IRegisterRepository;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities.UserEntity;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.mapper.UserMapper;
import Trans_parente.Movilidad.registrationApi.infrastructure.persistance.repositories.ORMregister;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AdpaterRegister implements IRegisterRepository {
    
    private final ORMregister ormRegister;
    private final UserMapper userMapper;

    @Override
    public User save(User user) {
            UserEntity userEntity = userMapper.toEntity(user);

            UserEntity savedUserEntity = ormRegister.save(userEntity);

            User savedUser = userMapper.toDomain(savedUserEntity);
            return savedUser;
    }
}
