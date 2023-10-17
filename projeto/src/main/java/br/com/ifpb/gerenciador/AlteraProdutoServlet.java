package br.com.ifpb.gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraProdutoServlet
 */
@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlteraProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramNomeProduto = (String) request.getParameter("nome");
		String paramPrecoProduto = (String) request.getParameter("preco");
		String paramData = (String) request.getParameter("validade");
		String paramID = (String) request.getParameter("id");
		Integer id = Integer.valueOf(paramID);
		
		Date validade = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			validade = sdf.parse(paramData);
		}catch(ParseException ex) {
			ex.printStackTrace();
		}
		
		Banco banco = new Banco();
		Produto prod = banco.buscaProdutoPeloId(id);
		prod.setNome(paramNomeProduto);
		prod.setPreco(Double.parseDouble(paramPrecoProduto));
		prod.setValidade(validade);
		
		response.sendRedirect("listaProdutos");
		
		
	}

}
