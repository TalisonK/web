package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaProdutos")
public class ListaProdutoServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Produto> lista = banco.getProdutos();
		
		RequestDispatcher rd = 
				req.getRequestDispatcher("/ListaProduto.jsp");
		req.setAttribute("listaProdutos", lista);
		rd.forward(req, resp);
	}

}
