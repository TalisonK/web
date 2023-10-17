package br.com.ifpb.gerenciador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraProdutoServlet
 */
@WebServlet("/mostraProduto")
public class MostraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostraProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramID = request.getParameter("id");
		int id = Integer.valueOf(paramID);
		Banco banco = new Banco();
		Produto emp = banco.buscaProdutoPeloId(id);
		
		request.setAttribute("Produto", emp);
		
		RequestDispatcher rd = 
				request.getRequestDispatcher("/formAlteraProduto.jsp");
		rd.forward(request, response);
	}
}
