package Trans_parente.Movilidad.registrationApi.application.usecases;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import Trans_parente.Movilidad.registrationApi.domain.models.Driver;
import Trans_parente.Movilidad.registrationApi.domain.ports.in.ISaveDriver;
import Trans_parente.Movilidad.registrationApi.domain.ports.out.IRegisterRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaveDriverUseCase implements ISaveDriver{
    private final IRegisterRepository registerRepository;

    @Override
    @Transactional
    public Driver save(Driver driver) {
        try {
            Driver savedDriver = (Driver) registerRepository.save(driver);
            return savedDriver;
        } catch (Exception e) {
            throw e;
        }
        
    }

    
}
