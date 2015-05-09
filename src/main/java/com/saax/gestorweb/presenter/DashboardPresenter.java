package com.saax.gestorweb.presenter;

import com.saax.gestorweb.GestorMDI;
import com.saax.gestorweb.model.DashboardModel;
import com.saax.gestorweb.model.datamodel.Usuario;
import com.saax.gestorweb.util.GestorSession;
import com.saax.gestorweb.util.GestorWebImagens;
import com.saax.gestorweb.view.DashboardView;
import com.saax.gestorweb.view.DashboardViewListenter;
import com.vaadin.ui.UI;
import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * Dashboard Presenter <br>
 * This class is responsible capture all events that occur in the View and give the
 * proper treatment, using this model.
 *
 *
 * @author Rodrigo
 */
public class DashboardPresenter implements DashboardViewListenter, Serializable {

    //Creates the presenter connecting the Model and View
    private final transient DashboardView view;
    private final transient DashboardModel model;

    // message resource
    private final transient ResourceBundle mensagens = ((GestorMDI) UI.getCurrent()).getMensagens();
    // image resource
    private final transient GestorWebImagens imagens = ((GestorMDI) UI.getCurrent()).getGestorWebImagens();
    // user resource
    private Usuario loggedUser;

    /**
     * init the presenter
     */
    @Override
    public void init() {

        loggedUser = (Usuario) GestorSession.getAttribute("loggedUser");
    }

    @Override
    public void createsNewTaskByTemplate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void applyAutoFilter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeSearchFilters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // Enumeration of the type of research
    public enum ResearchType {

        INCLUSIVA_OU, EXCLUSIVA_E
    };

    /**
     * Creates the presenter connecting the Model and View
     *
     * @param model
     * @param view
     */
    public DashboardPresenter(DashboardModel model,
            DashboardView view) {

        this.model = model;
        this.view = view;

        view.setListener(this);

    }

    /**
     * call the logout
     */
    @Override
    public void logout() {

        ((GestorMDI) UI.getCurrent()).logout();
    }



}
