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
 * Presenter do Dashboard <br>
 * Esta classe é responsável captar todos os eventos que ocorrem na View e dar o
 * devido tratamento, utilizando para isto o modelo.
 *
 *
 * @author Rodrigo
 */
public class DashboardPresenter implements DashboardViewListenter, Serializable {

    // Todo presenter mantem acesso à view e ao model
    private final transient DashboardView view;
    private final transient DashboardModel model;

    // Referencia ao recurso das mensagens:
    private final transient ResourceBundle mensagens = ((GestorMDI) UI.getCurrent()).getMensagens();
    private final transient GestorWebImagens imagens = ((GestorMDI) UI.getCurrent()).getGestorWebImagens();
    private Usuario loggedUser;

    /**
     * Inicializa o presenter
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
    public void removerFiltrosPesquisa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // enumeracao do tipo de pesquisa
    public enum TipoPesquisa {

        INCLUSIVA_OU, EXCLUSIVA_E
    };

    /**
     * Cria o presenter ligando o Model ao View
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
     * Chama o Logout geral do MDI
     */
    @Override
    public void logout() {

        ((GestorMDI) UI.getCurrent()).logout();
    }



}
