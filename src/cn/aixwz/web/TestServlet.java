package cn.aixwz.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/www.aixwz.cn")
public class TestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("TestServlet.service");

        System.out.println(".........");
        System.out.println(".........");
        test();
        test1();
        test3();


        // 请求转发到index.jsp
        req.getRequestDispatcher("WEB-INF/hello.jsp").forward(req,resp);
    }

    private void test(){
        System.out.println("测试更新！");
    }
    private void test1(){
        System.out.println("测试！");
    }
    private void test2(){
        System.out.println("第二种测试！");
    }
    private void test3(){
        System.out.println("第二次测试！");
    }

}
