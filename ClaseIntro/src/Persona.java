public class Persona {
    private String nombre;
    private String cedula;
    private TipoDocumento tipoDocumento;
    private ColorPelo colorPelo;

    public Persona(String nombre, String cedula, TipoDocumento tipoDocuemnto, ColorPelo colorPelo)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipoDocumento = tipoDocuemnto;
        this.colorPelo = colorPelo;
    }
    public Persona(){
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public ColorPelo getColorPelo() {
        return colorPelo;
    }
    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    
}
