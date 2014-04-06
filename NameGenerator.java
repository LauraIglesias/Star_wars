
/**
 * genere un nombre para la película siguiendo el método descrito.
 * Hay un rumor en Internet que dice que George Lucas, el director de la saga de películas "Star Wars", 
 * utilizaba una misma formula para crear los nombres de los personajes de dichas películas (Obiwan Kenobi, Jarjar Binks)
    Tu nombre en la película sería:
        Tomando las tres primeras letras de tu primer apellido real
        Añadiendo las tres primeras letras de tu nombre real

    Tu apellido en la película sería:
        Tomando las dos primeras letras del primer apellido real de tu madre
        Añadiendo las 3 primeras letras del nombre de la ciudad donde naciste
 * 
 * @author Laura 
 * @version 6/4/2014
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
