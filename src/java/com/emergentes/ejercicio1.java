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
 * @author Eva Carmen Huaylliri Ajata
 */
@WebServlet(name = "ejercicio1", urlPatterns = {"/ejercicio1"})
public class ejercicio1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        declaramos 3 String para recibir los datos enviados por la url
        */
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio N°1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center> Ejercicio N° 1</center></h1>");
            if (nombre != null && telefono != null && correo != null)
            {
           
            out.println("<h2>Nombre: " +nombre+ "</h2>");
            out.println("<h2>Telefono: " +telefono+ "</h2>");
            out.println("<h2>Correo: " +correo+ "</h2>");
            }
            else
            {
                out.println("<h3>Ingrese datos en la url</h3>");
                out.println("<h3>Ejemplo</h3>");
                out.println("<h3>localhost:8080/Practica2/Ejercicio1?nombre=Eva&telefono=77712876&correo=Eva.Huaylliri@gmail.com</h3>");
            }
            out.println("<br>");
            out.println("<center><a href='index.jsp'>Pagina principal</a></center>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}