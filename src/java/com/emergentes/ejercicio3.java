/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eva Carmen huaylliri Ajata
 */
@WebServlet(name = "ejercicio3", urlPatterns = {"/ejercicio3"})
public class ejercicio3 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String boton = request.getParameter("boton");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                 out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lee</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio 3</h1>");
            out.print("<form action='' method='post'>");
            out.println("Primer Numero:");
            out.println("<input type='text' name='numeroA' required>");
            out.println("<br><br>");
            out.println("Segundo Numero:");
            out.println("<input type='text' name='numeroB' required>");
            out.println("<br><br>");
            out.println("<select>");
            out.println("<option value='suma'>Suma</option>");
            out.println("<option value='resta'>Resta</option>");
            out.println("<option value='multi'>Multiplicación</option>");
            out.println("<option value='divi'>División</option>");
            out.println("</select>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<center><a href='index.jsp'>Pagina principal</a></center>");
            String numeroA=request.getParameter("numeroA");
            String numeroB=request.getParameter("numeroB");
            if (numeroA != null && numeroB != null) {
                out.println("Resultado: "+(Integer.parseInt(numeroA)+Integer.parseInt(numeroB)));
            }
            
            out.println("</body>");
            out.println("</html>");
        }
         
    }
   
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


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
