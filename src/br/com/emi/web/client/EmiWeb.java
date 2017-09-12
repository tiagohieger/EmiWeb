package br.com.emi.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import br.com.emi.web.client.resources.IResources;
import br.com.emi.web.client.ui.home.HomeUi;
import gwt.material.design.components.client.theme.ThemeManager;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class EmiWeb implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		ThemeManager.applyTheme(IResources.INSTANCE.theme_blue_grey__cyan());	
		RootPanel.get().add(new HomeUi());
	}
}
