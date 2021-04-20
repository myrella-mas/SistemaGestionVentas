package Clases;

/**
 *
 * @author nikol
 */


/**
Es el actor que podra consultar stock de productos, consultar el reporte de 
ventas y consultar los datos de sus clientes.
 */
public class Administrador 
{
   private String Nombre;
   private Integer DNI;
   private Integer Telefono;
   private String Email;
   private String Direccion;
   private Double Sueldo;
   private String ID;
   private String Password;
 
  public Administrador(){}
   public Administrador(String Nombre, Integer DNI, Integer Telefono, String Email, String Direccion, Double Sueldo, String ID, String Password) 
   {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Sueldo = Sueldo;
        this.ID = ID;
        this.Password = Password;
      
    
   }

   public String getNombre() 
   {
        return Nombre;
    
   }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getTelefono() {
        return Telefono;
    }

    public void setTelefono(Integer Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    

    /**
    @roseuid 5DCED5D602D3
     */
    public void ConsultarStock() {
        
        
    }
   
   /**
   @roseuid 5DCED5DC033B
    */
   public void GestionarProducto() {
    
       
   }

 
}
