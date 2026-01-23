package Trans_parente.Movilidad.register.domain.ports.out;

import Trans_parente.Movilidad.register.domain.models.User;

public interface IRegisterRepository {
    User save(User user);
}
