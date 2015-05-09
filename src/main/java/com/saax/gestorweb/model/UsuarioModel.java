package com.saax.gestorweb.model;

import com.saax.gestorweb.model.datamodel.Usuario;
import com.saax.gestorweb.util.GestorEntityManagerProvider;
import com.saax.gestorweb.util.GestorSession;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * 
*User object class of business
 *
 * @author rodrigo
 */
public class UsuarioModel {

    public Usuario findByID(Integer idUsuario) {
        EntityManager em = GestorEntityManagerProvider.getEntityManager();
        return (Usuario) em.createNamedQuery("Usuario.findById")
                .setParameter("id", idUsuario)
                .getSingleResult();

    }

}
