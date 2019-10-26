package br.com.carbone.caminhao.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.carbone.caminhao.modelo.Banco;
import br.com.carbone.caminhao.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//Le os dois parametros que vem de formLogin.jsp
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando " + login);
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		
		if (usuario != null) {
			System.out.println("Usuario exite");
			return "redirect:entrada?acao=ListaTransportes";
			
		} else {
			return "redirect:entrada?acao=LoginForm";
		}
		
		
	}

}
