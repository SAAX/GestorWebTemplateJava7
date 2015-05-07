package com.saax.gestorweb.presenter;

import com.saax.gestorweb.GestorMDI;
import com.saax.gestorweb.model.StartPageModel;
import com.saax.gestorweb.util.GestorWebImagens;
import com.saax.gestorweb.view.StartPageView;
import com.saax.gestorweb.view.StartPageViewListener;
import com.vaadin.ui.UI;
import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * Presenter da Pagina Inicial Esta classe é responsável captar todos os eventos
 * que ocorrem na View e dar o devido tratamento, utilizando para isto o modelo
 *
 *
 * @author Rodrigo
 */
public class StartPagePresenter implements StartPageViewListener, Serializable {

    // Todo presenter mantem acesso à view e ao model
    private final transient StartPageView view;
    private final transient StartPageModel model;

    // Referencia ao recurso das mensagens:
    private final transient ResourceBundle mensagens = ((GestorMDI) UI.getCurrent()).getMensagens();
    private final transient GestorWebImagens imagens = ((GestorMDI) UI.getCurrent()).getGestorWebImagens();

    /**
     * Cria o presenter ligando o Model ao View
     *
     * @param model
     * @param view
     */
    public StartPagePresenter(StartPageModel model,
            StartPageView view) {

        this.model = model;
        this.view = view;

        view.setListener(this);
    }

    
}
