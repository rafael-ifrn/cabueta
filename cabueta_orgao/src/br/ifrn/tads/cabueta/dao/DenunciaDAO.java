package br.ifrn.tads.cabueta.dao;

import java.util.ArrayList;
import java.util.List;

import br.ifrn.tads.cabueta.modelo.Denuncia;

public class DenunciaDAO {
	
	public DenunciaDAO() {}
	
	public List<Denuncia> getLista() {
		
		List<Denuncia> denuncias= new ArrayList<>();
		
		denuncias.add(new Denuncia("invas�o de terra", "pessoas desconehcidas est�o invadindo terra da uni�o gerando lixo.", "25/11/2015"));
		denuncias.add(new Denuncia("queimada", "Empresa est� promovendo a quemada de uma  grande �rea, gerando muita fuma�a.", "25/11/2015"));
		denuncias.add(new Denuncia("remo��o de areia do rio", "V�rios caminh�es est�o retirando areia do rio. O rio est� assoreando.", "25/11/2015"));
		
		return denuncias;
	}

}
