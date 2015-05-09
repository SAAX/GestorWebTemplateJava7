package com.saax.gestorweb.view;

import com.saax.gestorweb.GestorMDI;
import com.saax.gestorweb.model.datamodel.Usuario;
import com.saax.gestorweb.util.GestorWebImagens;
import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import java.util.ResourceBundle;

/**
 * This class is responsible for show the visual components of the start page
 *
 * @author Rodrigo
 */
public class StartPageView extends HorizontalLayout {

    // message resource
    private final transient ResourceBundle messages = ((GestorMDI) UI.getCurrent()).getMensagens();
    // image resource
    private final transient GestorWebImagens images = ((GestorMDI) UI.getCurrent()).getGestorWebImagens();

    // listener interface (presenter in MVP)
    private StartPageViewListener listener;

    public void setListener(StartPageViewListener listener) {
        this.listener = listener;
    }

    // container that will contain the login button
    VerticalLayout rightContainer;
    // container that will contain the image
    VerticalLayout leftContainer;

    /**
     * Builds the home page application with background images and
  buttons to register / login This container (layout) will have two other
  within containers, one for the background image and one for the box with
  login button / sign-up
     */
    public StartPageView() {

        setSizeFull();

        // container that will contain the image
        leftContainer = new VerticalLayout();
        leftContainer.setHeight(450, Unit.PIXELS);

    // container that will contain the login button
        rightContainer = new VerticalLayout();
        rightContainer.setHeight(450, Unit.PIXELS);

        Image logo = images.getPAGINAINICIAL_LOGO();
        leftContainer.addComponent(logo);
        leftContainer.setComponentAlignment(logo, Alignment.MIDDLE_CENTER);


        // button to dashboard
        final Button previewDashboardButton = new Button("dashboard preview", (Button.ClickEvent event) -> {
            ((GestorMDI) UI.getCurrent()).carregarDashBoard();
        });

        
        // button to previw of new tab
        BrowserWindowOpener opener = new BrowserWindowOpener("http://google.com");// 
        opener.setWindowName("_blank");// _new, _blank, _top, etc.

        final Button previewNewTabButton = new Button("Nova Aba");
        opener.extend(previewNewTabButton);

        //button bar
        HorizontalLayout barraBotoes = new HorizontalLayout();
        rightContainer.addComponent(barraBotoes);
        rightContainer.setComponentAlignment(barraBotoes, Alignment.MIDDLE_CENTER);

        barraBotoes.addComponent(previewDashboardButton);

        // It includes the two containers
        addComponent(leftContainer);
        setComponentAlignment(leftContainer, Alignment.MIDDLE_LEFT);
        addComponent(rightContainer);
        setComponentAlignment(rightContainer, Alignment.MIDDLE_RIGHT);

    }

}
