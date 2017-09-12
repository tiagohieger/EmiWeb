package br.com.emi.web.client.ui.register;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RegisterUi extends Composite {

	private static HomeUiBinder uiBinder = GWT.create(HomeUiBinder.class);

	interface HomeUiBinder extends UiBinder<Widget, RegisterUi> {
	}
	
	public RegisterUi() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
}
