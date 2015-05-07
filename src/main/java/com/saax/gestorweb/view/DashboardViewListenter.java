package com.saax.gestorweb.view;

/**
 * Interface com todos os eventos disparados pela View do dashboard
 * 
 * @author Rodrigo
 */
public interface DashboardViewListenter {
   
    void logout();
    void init();

    public void createsNewTaskByTemplate();

    public void applyAutoFilter();

    public void removerFiltrosPesquisa();
    

    
}
