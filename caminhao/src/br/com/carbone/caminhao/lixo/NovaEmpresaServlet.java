package br.com.carbone.caminhao.lixo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
//@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
			
			throw new ServletException(e);
		}
		
		
		
		Transporte empresa = new Transporte();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		//simula add ao banco de dados
		Banco banco = new Banco();
		banco.adicona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		
		response.sendRedirect("listaEmpresas");
		
		
//		//Chamar o JSP
//		RequestDispatcher rd =request.getRequestDispatcher("/novaEmpresaCriada.jsp");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
		
		
		//substituido html no java não é boa pratica
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>Empresa "+ nomeEmpresa + " cadastrada com sucesso!</body></html>");
		
	}

}
