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
 * This class is responsible for capturing all events
 *  occurring in view and provide appropriate treatment, using this model
 *
 *
 * @author Rodrigo
 */
public class StartPagePresenter implements StartPageViewListener, Serializable {

  
    private final transient StartPageView view;
    private final transient StartPageModel model;

    // message resource
    private final transient ResourceBundle messages = ((GestorMDI) UI.getCurrent()).getMensagens();
    // image resource
    private final transient GestorWebImagens images = ((GestorMDI) UI.getCurrent()).getGestorWebImagens();

    /**
     * Creates the presenter connecting the Model and View
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
