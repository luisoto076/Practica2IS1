package test;

import Mapeo.Usuario;
import Mapeo.Login;
import controlador.UsuarioDaoHibernate;
import controlador.LoginDaoHibernate;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 *
 * @author
 */
public class Main {

    public static void main(String[] args) {
        UsuarioDaoHibernate usuarioDAO = new UsuarioDaoHibernate();
        LoginDaoHibernate loginDao = new LoginDaoHibernate();
        Date fecha = new Date(2016,3,15);
        Login login = new Login();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(4);
        usuario.setNombre("Juan");
        usuario.setApellidos("Perez");
        usuario.setCorreo("cuenta2@gmail.com");
        usuarioDAO.save(usuario);
        System.out.println("Todo salio bien en el insert");
        usuario.setNombre("Caen");
        usuarioDAO.update(usuario);
        System.out.println("Todo salio bien en el update");
        //login.setIdLog(1);
        //login.setUsuario(usuario);
        //login.setFecha(fecha);
        loginDao.save(login);
        List<Usuario> lista = usuarioDAO.findAll();
        for (Usuario user : lista) {
            System.out.println(user.toString());
        }

    }
}
