package controlador;

import Mapeo.Login;
import java.util.List;

/**
 *
 * @author 
 */
public class LoginDaoHibernate extends AbstractDao {

    public LoginDaoHibernate() {
        super();
    }

    /**
     * Insert a new Login into the database.
     *
     * @param usuario
     */
    public void save(Login usuario) throws DataAccessLayerException {
        super.save(usuario);
    }

    /**
     * Updates a new Login into the database.
     *
     * @param usuario
     */
    public void update(Login usuario) throws DataAccessLayerException {
        super.update(usuario);
    }

    /**
     * Delete a detached Login from the database.
     *
     * @param usuario
     */
    public void delete(Login usuario) throws DataAccessLayerException {
        super.delete(usuario);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Login find(Long id) throws DataAccessLayerException {
        return (Login) super.find(Login.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Login.class);
    }
}
