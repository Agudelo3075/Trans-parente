package Trans_parente.Movilidad.registrationApi.domain.ports.out;

import Trans_parente.Movilidad.registrationApi.domain.models.User;

public interface IRegisterRepository {
    User save(User user);
}
