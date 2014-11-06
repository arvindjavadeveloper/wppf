package org.primefaces.showcase.view.button;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.component.tabview.Tab;
import org.primefaces.component.tabview.TabView;
 
@ManagedBean
public class ButtonView {
	
    public void buttonAction(ActionEvent actionEvent) {   
        Tab tab = new Tab();
        tab.setTitle("Arvind");
        UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
        TabView parent = (TabView) view.findComponent("arvind");
		for (UIComponent uiComponent : view.getChildren()) {
			for (UIComponent uiComponent1 : uiComponent.getChildren()) {
				for (UIComponent uiComponent2 : uiComponent1.getChildren()) {			
					for (UIComponent uiComponent3 : uiComponent2.getChildren()) {
						for (UIComponent uiComponent4 : uiComponent3.getChildren()) {
							if (uiComponent4 instanceof TabView) {
								parent = (TabView) uiComponent4;
							}
						}
					}
				}
			}
		}
		parent.getChildren().add(tab);
    }
}
