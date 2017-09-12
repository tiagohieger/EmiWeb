package br.com.emi.web.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.i18n.client.Messages;

public interface IMessages extends Messages {

	public static final IMessages INSTANCE = GWT.create(IMessages.class);
		
	/*
	 * Action's 
	 */
	
	@DefaultMessage("Entrar")
	String act_login();
	
	@DefaultMessage("Sair")
	String act_logout();
	
	@DefaultMessage("Salvar")
	String act_save();
	
	@DefaultMessage("Cadastre-se")
	String act_register();
	
	
	/*
	 * Label's
	 */
		
	@DefaultMessage("Receba indicações e aumente suas vendas")
	String lbl_home_title();
	
	@DefaultMessage("Através do Emi a sua empresa poderá receber indicações de qualquer pessoa a qualquer hora!")
	String lbl_home_description();
	
	@DefaultMessage("Nome")
	String lbl_name();
	
	@DefaultMessage("Razão social")
	String lbl_social_name();
	
	@DefaultMessage("Documento")
	String lbl_document();
	
	@DefaultMessage("Cnpj")
	String lbl_cnpj();
	
	@DefaultMessage("Nome fantasia")
	String lbl_fantasy();
	
	@DefaultMessage("E-mail")
	String lbl_email();
	
	@DefaultMessage("Telefone")
	String lbl_phone();
	
	@DefaultMessage("Tipo")
	String lbl_type();
	
	@DefaultMessage("Descrição")
	String lbl_description();
	
	@DefaultMessage("Foto")
	String lbl_phote();
	
	@DefaultMessage("Logo")
	String lbl_logo();
	
	@DefaultMessage("Identificador")
	String lbl_login();
	
	@DefaultMessage("Senha")
	String lbl_password();
	
	@DefaultMessage("CEP")
	String lbl_postal_code();
	
	@DefaultMessage("Logradouro")
	String lbl_street();
	
	@DefaultMessage("Bairro")
	String lbl_neighborhood();
	
	@DefaultMessage("Número")
	String lbl_number();
	
	@DefaultMessage("Cidade")
	String lbl_city();
	
	@DefaultMessage("Estado")
	String lbl_state();
}

