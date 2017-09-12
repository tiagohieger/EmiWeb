package br.com.emi.web.client.ui.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import br.com.emi.web.client.ui.register.RegisterUi;
import gwt.material.design.components.client.constants.Typography;
import gwt.material.design.components.client.ui.MaterialLabel;
import gwt.material.design.components.client.utils.ResponsiveListener;

public class HomeUi extends Composite {

	private static HomeUiBinder uiBinder = GWT.create(HomeUiBinder.class);

	interface HomeUiBinder extends UiBinder<Widget, HomeUi> {
	}
	
	@UiField
	MaterialLabel titleLbl;
	@UiField
	MaterialLabel descriptionLbl;
	
	private  HandlerRegistration handler;
	
	public HomeUi() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	protected void onLoad() {
		super.onLoad();
		
		handler = ResponsiveListener.register(new ResponsiveListener.Handler() {

			@Override
			public void onPhone() {
				titleLbl.setTypography(Typography.DISPLAY_2);
				descriptionLbl.setTypography(Typography.SUBHEADING_2);
			}
			
			@Override
			public void onTablet() {
				titleLbl.setTypography(Typography.DISPLAY_3);
				descriptionLbl.setTypography(Typography.HEADLINE);
			}
			
			@Override
			public void onDesktop() {
				titleLbl.setTypography(Typography.DISPLAY_4);
				descriptionLbl.setTypography(Typography.HEADLINE);
			}
		});
		
		ResponsiveListener.fire();
	}
	
	@Override
	protected void onUnload() {
		super.onUnload();
		
		if(handler != null) {
			handler.removeHandler();
		}
	}
	
	@UiHandler("registerAct")
	public void goToRegister(final ClickEvent event) {
		RootPanel.get().clear();
		RootPanel.get().add(new RegisterUi());
	}
}
