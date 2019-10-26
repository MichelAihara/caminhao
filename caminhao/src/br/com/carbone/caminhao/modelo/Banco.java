package br.com.carbone.caminhao.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Transporte> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	private static Integer chaveSequencial = 1;
	
	static {
		Transporte empresa = new Transporte();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Distribuidora1");
		
		Transporte empresa2 = new Transporte();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Distribuidora2");
		lista.add(empresa);
		lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("denis");
		u1.setSenha("123");
		
		Usuario u2 = new Usuario();
		u2.setLogin("michel");
		u2.setSenha("123");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
		
	}

	public void adicona(Transporte empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
		
	}
	
	public List<Transporte> getEmpresas(){
		return Banco.lista;
		
		
	}

	
	// Removendo empresa da coleção usando o Iterator
	public void removeEmpresa(Integer id) {
		
		Iterator<Transporte> it = lista.iterator();
		
		while (it.hasNext()) {
			Transporte emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
					
	}

	public Transporte buscaEmpresaPelaId(Integer id) {

		for (Transporte empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
				
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario: listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
				
			}
		
		}
			
			return null;
		
	}

}
