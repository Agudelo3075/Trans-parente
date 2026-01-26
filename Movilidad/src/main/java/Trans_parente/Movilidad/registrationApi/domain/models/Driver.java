package Trans_parente.Movilidad.registrationApi.domain.models;

public class Driver extends User {
    private int confiablidad;

    public Driver(Long id, String name, String email, String password, String location, int confiablidad) {
        super(id, name, email, password, location);
        this.confiablidad = confiablidad;
    }

    public int getConfiabilidad(){
        return confiablidad;
    }

    public void setConfiabilidad(int confiablidad){
        this.confiablidad = confiablidad;
    }
}
