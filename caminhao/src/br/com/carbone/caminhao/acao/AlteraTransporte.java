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

public class AlteraTransporte implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//Le os parametros
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("acao altera transporte " + id);
		
		//Fazendo o parse
		
		Date dataAbertura = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (ParseException e) {
				throw new ServletException(e);
		}
		
		
		//popular modelo
		//Substituindo o update para o banco
		Banco banco = new Banco();
		Transporte empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		
		//Realizando o redirecionamento
		return "redirect:entrada?acao=ListaTransportes";
		
		
	}

}
