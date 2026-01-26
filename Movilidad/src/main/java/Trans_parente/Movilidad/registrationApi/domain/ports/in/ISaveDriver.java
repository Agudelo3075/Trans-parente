package Trans_parente.Movilidad.registrationApi.domain.ports.in;

import Trans_parente.Movilidad.registrationApi.domain.models.Driver;

public interface ISaveDriver {
    Driver save(Driver driver);
}
