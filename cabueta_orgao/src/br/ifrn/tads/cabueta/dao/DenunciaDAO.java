package br.ifrn.tads.cabueta.dao;

import java.util.ArrayList;
import java.util.List;

import br.ifrn.tads.cabueta.modelo.Denuncia;

public class DenunciaDAO {
	
	public DenunciaDAO() {}
	
	public List<Denuncia> getLista() {
		
		List<Denuncia> denuncias= new ArrayList<>();
		
		denuncias.add(new Denuncia("invasão de terra", "pessoas desconehcidas estão invadindo terra da união gerando lixo.", "25/11/2015"));
		denuncias.add(new Denuncia("queimada", "Empresa está promovendo a quemada de uma  grande área, gerando muita fumaça.", "25/11/2015"));
		denuncias.add(new Denuncia("remoção de areia do rio", "Vários caminhões estão retirando areia do rio. O rio está assoreando.", "25/11/2015"));
		
		return denuncias;
	}

}
