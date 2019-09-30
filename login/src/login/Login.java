package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		//Lấy dữ liệu từ form
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		String result = "";
		
		//Kiểm tra dữ liệu người dùng
		if (name.equals("admin") && pass.equals("0")) {
			result = "Welcome";
		} else {
			result = "Invalid username or password";
		}
		
		//Tạo ra 1 trang HTML để hiển thị ra màn hình thông báo
		out.println("<html><head><title>Login Servlet</title></head><body>");
		out.println("<h1>" + result + "</h1>");
		out.println("</body></html>");
		out.close();
	}
}
