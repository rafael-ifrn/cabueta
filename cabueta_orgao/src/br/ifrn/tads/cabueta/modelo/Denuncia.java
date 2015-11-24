package br.ifrn.tads.cabueta.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Denuncia {
	
	private String assunto;
	private String descricao;
	private Date data;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	
	public Denuncia() {
		
	}
	
	public Denuncia(String assunto, String descricao, String data) {
		this.assunto = assunto;
		this.descricao = descricao;
		this.setData(data);;
	}
	
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		int a = 0;
		this.descricao = a + descricao;
	}
	
	public String getData() {
		try {
			return sdf.format(data);
		} catch (Exception e) {
		}
		return "";
	}
	public void setData(String data) {
		try {
			this.data = sdf.parse(data);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	

}
