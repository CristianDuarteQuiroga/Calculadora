/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBEAN.CalBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cristian
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalBeanLocal calBean;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
           String res = request.getParameter("r1");
           int a,b;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            for (int i = 0; i < res.length(); i++) 
            {
                if (res.charAt(i) == '+') {
                    out.println("<h1>Resultado = " + calBean.sumar(Integer.parseInt(res.split("\\+")[0]),Integer.parseInt(res.split("\\+")[1])) + "</h1>");
                }
                else if (res.charAt(i) == '-') {
                    out.println("<h1>resultado = " + calBean.restar(Integer.parseInt(res.split("-")[0]),Integer.parseInt(res.split("-")[1])) + "</h1>");
                }
                else if (res.charAt(i) == '*') {
                    out.println("<h1>resultado = " + calBean.multiplicar(Integer.parseInt(res.split("\\*")[0]),Integer.parseInt(res.split("\\*")[1])) + "</h1>");
                }
                else if (res.charAt(i) == '/') {
                    out.println("<h1>resultado = " + calBean.dividir(Integer.parseInt(res.split("/")[0]),Integer.parseInt(res.split("/")[1])) + "</h1>");
                }
                else if (res.charAt(i) == '^') {
                    out.println("<h1>resultado = " + calBean.potenciacion(Integer.parseInt(res.split("\\^")[0]),Integer.parseInt(res.split("\\^")[1])) + "</h1>");
                }
                else if (res.charAt(i) == '%') {
                    out.println("<h1>resultado = " + calBean.modulo(Integer.parseInt(res.split("%")[0]),Integer.parseInt(res.split("%")[1])) + "</h1>");
                }
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
