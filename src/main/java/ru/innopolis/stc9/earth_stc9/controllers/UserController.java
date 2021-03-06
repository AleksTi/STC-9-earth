package ru.innopolis.stc9.earth_stc9.controllers;

import ru.innopolis.stc9.earth_stc9.pojo.User;
import ru.innopolis.stc9.earth_stc9.services.IUsersService;
import ru.innopolis.stc9.earth_stc9.services.UsersService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class NOT REALIZED. For current user
 */
@WebServlet("/users/*")
public class UserController extends AbstractController {
    private IUsersService service = new UsersService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("doGet" + this.getClass().getName());
        resp.getWriter().println("any");
        try {
            int idUser = Integer.parseInt(req.getPathInfo().substring(1));
            User userById = service.getUserById(idUser);
            req.setAttribute("user", userById);
            req.getRequestDispatcher("../pages/user.jsp");
        } catch (NumberFormatException e) {
            logger.warn(e);
        }
    }
}
