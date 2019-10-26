package br.com.carbone.caminhao.lixo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;

/**
 * Servlet implementation class ListaEmpresasServlets
 */
//@WebServlet("/listaEmpresas")
public class ListaEmpresasServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Transporte> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
		
		
	}

}
