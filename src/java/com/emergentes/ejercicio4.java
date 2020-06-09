/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eva Carmen Huaylliri Ajata
 */

@WebServlet(name = "ejercicio4", urlPatterns = {"/ejercicio4"})
public class ejercicio4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          Random aleatorio = new Random();
        
        int n1 = 1+ aleatorio.nextInt(6);
        /* para que nos genere un numero alazar de 0 a 5 ponemos 6 en la funcion random */
        int n2 = 1+ aleatorio.nextInt(6);
        /*
            sumamos los dos numeros aleatorios y almacenamos el resultado en la 3era variable
        */
        int n = n1 +n2;
         String boton = request.getParameter("boton");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejercicio4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center> Ejercicio N° 4</center></h1>");
            out.println("<form action='' method='post'>");
         
            out.println("<input type='submit' value='Lanzar' name='boton'>");
            out.println("</form>");
           
            out.println("<h3>Instrucciones</h3>");
            out.println("<h4>Para lanzar los dados debes presionar el boton Lanzar</h4>");
            out.println("<h4>Si sacas 7 o 11 Ganas y si sacas otro numero pierdes</h4>");
            if(boton != null)
            {
            out.println("<h2> Primer Dado: "+n1+" Segundo Dado: "+n2+"</h2>");
            }
            else
            {
                out.println("<h2>Lanza los Dados</h2>");
            }
            if (n == 7 || n == 11)
            {
                out.println("<h1>Ganaste</h1>");
            }
            else
            {
                out.println("<h1>Perdiste</h1>");
            }
            out.println("<br>");
            out.println("<center><a href='index.jsp'>Inicio</a></center>");    
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
