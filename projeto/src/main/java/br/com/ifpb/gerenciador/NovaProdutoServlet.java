package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NovaProduto")
public class NovaProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NovaProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeProduto = (String) req.getParameter("nome");
		String precoProduto = (String) req.getParameter("preco");
		String paramValidade = (String) req.getParameter("validade");
		
		Date validade = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			validade = sdf.parse(paramValidade);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Produto prod = new Produto(nomeProduto, Double.parseDouble(precoProduto), validade);
		
		Banco banco = new Banco();
		banco.adiciona(prod);
		req.setAttribute("nomeProduto", nomeProduto);
		
		resp.sendRedirect("listaProdutos");		
	}

}
