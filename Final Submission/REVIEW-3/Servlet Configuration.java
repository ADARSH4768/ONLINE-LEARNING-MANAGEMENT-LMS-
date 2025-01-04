@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("UserServlet Initialized");
    }
}
