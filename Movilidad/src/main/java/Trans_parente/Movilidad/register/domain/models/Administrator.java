package Trans_parente.Movilidad.register.domain.models;

public class Administrator extends User{
    private String codigo;

    public Administrator(Long id, String name, String email, String password, String location, String codigo) {
        super(id, name, email, password, location);
        this.codigo = codigo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
}
