package br.com.carbone.caminhao.lixo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;


//@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Lendo o parametro
		String paramId = request.getParameter("id");
		
		//Fazendo o parse de String para Integer (obrigatorio no servlet)
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Transporte empresa = banco.buscaEmpresaPelaId(id);
		
		System.out.println(empresa.getNome());
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
		
	}

}
