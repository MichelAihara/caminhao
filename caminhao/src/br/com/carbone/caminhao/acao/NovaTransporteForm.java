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
//Somente para carregar o formulario
public class NovaTransporteForm implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		return "forward:formNovaTransporte.jsp";
		
	}

}
