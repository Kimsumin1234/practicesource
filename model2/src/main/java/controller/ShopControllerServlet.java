package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ShopListAction;

@WebServlet("*.do")
public class ShopControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 한글처리
        req.setCharacterEncoding("utf-8");
        // 2. URI 분리
        String requestUri = req.getRequestURI();
        String contextPath = req.getContextPath();
        String cmd = requestUri.substring(contextPath.length());
        // 3. cmd 를 가지고 action 생성
        Action action = null;
        if (cmd.equals("/list.do")) {
            action = new ShopListAction(contextPath);
        }

        // 4. 생성된 action 에게 일 시키기

        // 5. 이동방식과 경로에 따라 움직이기

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
