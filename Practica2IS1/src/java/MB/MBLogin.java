/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MB;

import javax.faces.bean.RequestScoped;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import Mapeo.Login;
import Mapeo.Usuario;
import controlador.UsuarioDaoHibernate;
import controlador.LoginDaoHibernate;


@ManagedBean
@RequestScoped


/**
 *
 * @author luis
 */
public class MBLogin {
    
    private String nikname;
    private String clave;
    private String msn;
    private String msn1;
    private Usuario usuario;
    
    public String login() {
        LoginDaoHibernate loginDAO = new LoginDaoHibernate();
        List<Login> logins = loginDAO.findAll();
        for(Login l : logins){
            if(l.getNikname().equals(getNikname()) && l.getClave().equals(getClave())){
                msn = "Bienvenido "+ getNikname();
                msn1 = getNikname();
                UsuarioDaoHibernate usuarioDao = new UsuarioDaoHibernate(); 
                List<Usuario> usuarios = usuarioDao.findAll();
                for(Usuario u: usuarios){
                    if(u.getIdUsuario()==l.getIdUsuario()){
                         setUsuario(u);
                        return "perfil";
                    }
                }
            }
        }
        msn = "error! Usuario o contraseña incorrectos";
        return "index";
    }
    
    public String salir() {
        msn = "Adios";
        return "index";
    }
    
    public String perfil(){
        System.out.println(getNikname());
        return "perfil";
    }
    
    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nickname) {
        this.nikname = nickname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getMsn1() {
        return msn1;
    }

    public void setMsn1(String msn1) {
        this.msn1 = msn1;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
