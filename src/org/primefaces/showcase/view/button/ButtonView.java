package org.primefaces.showcase.view.button;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.component.tabview.Tab;
 
@ManagedBean
public class ButtonView {
     
    public void buttonAction(ActionEvent actionEvent) {   
        Tab tab = new Tab();
        tab.setTitle("Arvind");
        tab.setRendered(true);
        UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
        UIComponent parent = view.findComponent("arvind");
        tab.setParent(parent);
    }
}
