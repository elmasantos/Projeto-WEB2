package controllers;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import dominio.ONG;

@ManagedBean
@RequestScoped
public class ONGMB {
	private ONG ong;
	
	public ONGMB() {
		ong = new ONG();
	}
	
	public ONG getONG() {
		return ong;
	}

	public void setONG(ONG ong) {
		this.ong = ong;
	}
	
	public void cadastrar() {
		//listaContatos.add(contato);
		//FacesMessage msg = new FacesMessage("Contato adicionado com sucesso");
		//msg.setSeverity(FacesMessage.SEVERITY_INFO);
		//FacesContext.getCurrentInstance().addMessage("", msg);
		//contato = new Contato();
		//return "/interna/lista.jsf";
	}
}