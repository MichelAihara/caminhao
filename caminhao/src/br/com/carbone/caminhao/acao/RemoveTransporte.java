package br.com.carbone.caminhao.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;

public class RemoveTransporte implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		System.out.println("acao removendo empresa");
		
		String paramId = request.getParameter("id");
		
		//Fazendo um parse da String de request.getParameter para Integer
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		
		return "redirect:entrada?acao=ListaTransportes";
	}

}
