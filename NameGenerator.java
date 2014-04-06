
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private String name;
    private String primerApellido;
    private String segundoApellido;
    private String ciudadNacimiento;

    /**
     * @param name tu nombre
       @param primerApellido tu apellido
       @param segundoApellido tu segundo apellido
       @param ciudadNacimiento la ciudad donde naciste
     */
    public NameGenerator(String name,String primerApellido,String segundoApellido, String ciudadNacimiento)
    {
        this.name = name;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public String generateStarWarsName()
    {
    }
}
