package br.com.carbone.caminhao.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;

public class MostraTransporte implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("mostrando dados da empresa - Chamando MostaEmpresa.java");
								
				//Lendo o parametro
				String paramId = request.getParameter("id");
				
				//Fazendo o parse de String para Integer (obrigatorio no servlet)
				Integer id = Integer.valueOf(paramId);
				
				Banco banco = new Banco();
				Transporte empresa = banco.buscaEmpresaPelaId(id);
				
				System.out.println(empresa.getNome());
				
				request.setAttribute("empresa", empresa);
				return "forward:formAlteraTransporte.jsp";
				//System.out.println("Executou o request dispacher - MostraEmpresa.java");
				//rd.forward(request, response);
				//System.out.println("Executou rd.forward - MostraEmpresa.java");
		
	}

}
