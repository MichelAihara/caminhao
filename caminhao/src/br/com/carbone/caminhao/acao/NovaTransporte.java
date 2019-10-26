package br.com.carbone.caminhao.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Transporte;

public class NovaTransporte implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		System.out.println("Cadastrando novo Transporte - Chamando NovaTransporte.java");
		
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
		
		System.out.println("request.setAttribute executado");
		
		return "redirect:entrada?acao=ListaTransportes";
		
	}

}
