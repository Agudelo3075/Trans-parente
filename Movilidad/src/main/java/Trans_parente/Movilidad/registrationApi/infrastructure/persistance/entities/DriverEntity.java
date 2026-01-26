package Trans_parente.Movilidad.registrationApi.infrastructure.persistance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")

public class DriverEntity extends UserEntity{

    @Column(name = "confiabilidad", nullable = false)
    private int confiablidad;
}
