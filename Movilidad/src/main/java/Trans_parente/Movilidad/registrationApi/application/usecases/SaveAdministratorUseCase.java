package Trans_parente.Movilidad.registrationApi.application.usecases;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Trans_parente.Movilidad.registrationApi.domain.models.Administrator;
import Trans_parente.Movilidad.registrationApi.domain.ports.in.IsaveAdministrator;
import Trans_parente.Movilidad.registrationApi.domain.ports.out.IRegisterRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaveAdministratorUseCase implements IsaveAdministrator{
    private final IRegisterRepository registerRepository;

    @Override
    @Transactional
    public Administrator save(Administrator administrator) {
        try {
            Administrator savedAdministrator = (Administrator) registerRepository.save(administrator);
            return savedAdministrator;   
        } catch (Exception e) {
            throw e;
        }
    }
}
