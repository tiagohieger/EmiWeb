package br.com.emi.web.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface IResources extends ClientBundle {
	public static final IResources INSTANCE = GWT.create(IResources.class);

	// ////////////////////////////////////////
	// Images
	// ////////////////////////////////////////

	@Source("img/logo.png")
	ImageResource logo();
	
	@Source("img/background.jpeg")
	ImageResource background();

	// ////////////////////////////////////////
	// Themes
	// ////////////////////////////////////////
	@Source("css/theme_blue_grey__cyan.css")
	TextResource theme_blue_grey__cyan();

}
