package Trans_parente.Movilidad.registrationApi.application.service;

import Trans_parente.Movilidad.registrationApi.domain.models.Administrator;
import Trans_parente.Movilidad.registrationApi.domain.models.Driver;
import Trans_parente.Movilidad.registrationApi.domain.ports.in.ISaveDriver;
import Trans_parente.Movilidad.registrationApi.domain.ports.in.IsaveAdministrator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RegistrationService implements ISaveDriver, IsaveAdministrator{
    private final ISaveDriver saveDriver;
    private final IsaveAdministrator saveAdministrador;

    @Override
    public Administrator save(Administrator administrator) {
        try {
            Administrator savedAdministrador=saveAdministrador.save(administrator);
            return savedAdministrador;   
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Driver save(Driver driver) {
        try {
            Driver savedDriver = saveDriver.save(driver);
            return savedDriver;
        } catch (Exception e) {
            throw e;
        }
    }
    
}
