package br.com.carbone.caminhao.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;

public class ListaTransportes implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("Listando empresa - ListaEmpresa.java");
		
		Banco banco = new Banco();
		List<Transporte> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		return "forward:listaTransportes.jsp";
		
	}

}
