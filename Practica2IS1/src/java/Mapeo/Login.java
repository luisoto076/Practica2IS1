package Mapeo;
// Generated 5/04/2016 12:36:14 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private int idLogin;
     private int idUsuario;
     private String nikname;
     private String clave;

    public Login() {
    }

    public Login(int idLogin, int idUsuario, String nikname, String clave) {
       this.idLogin = idLogin;
       this.idUsuario = idUsuario;
       this.nikname = nikname;
       this.clave = clave;
    }
   
    public int getIdLogin() {
        return this.idLogin;
    }
    
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNikname() {
        return this.nikname;
    }
    
    public void setNikname(String nikname) {
        this.nikname = nikname;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }




}

