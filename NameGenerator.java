
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
    /**
     * Crea el nombre cogiendo las 3 primeras letras del primer apellido y las 3 primeras letras del nombre
     * Crea el apellido cogiendo las 2 primeras letras del segundo apellido y las 3 primeras letras de la ciudad donde nacio 
     */
    public String generateStarWarsName()
    {
        String nombre = primerApellido.substring(0,3) + name.substring(0,3);
        String apellido = segundoApellido.substring(0,2) + ciudadNacimiento.substring(0,3);
        return nombre + " " + apellido;
    }
}
