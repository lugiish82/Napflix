import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/ajax/getcart")
public class GetCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Gson gson = new Gson();
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        //TODO: Remove this test code after we are done
//        if (cart == null){
//            cart = new Cart();
//            cart.addItem(new CartItem("1", "1",1,1f));
//            session.setAttribute("cart", cart);
//        }
        resp.getWriter().write(gson.toJson(cart));
// 5 minutes +
    }
}
