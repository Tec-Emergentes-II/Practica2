# Practica2
<%-- 
    Document   : index
    Author     : Eva Carmen Huaylliri Ajata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica N° 2</title>
    </head>
    <body>
    <center>
        <h1>PRACTICA N° 2</h1>
        <h1>SERVLETS</h1>
        <table border="5">
            <tr>
                <th>Carrera:</th>
                <td>Ingenieria de Sistemas</td>
                <td rowspan="20"><h1>H.</h1></td>
            </tr>
            <tr>
                <th>Materia:</th>
                <td>Tecnologías Emergentes II</td>
            </tr>
            <tr>
                <th>Apellidos y nombres:</th>
                <td>Huaylliri Ajata Eva Carmen</td>
            </tr>
            <tr>
                <th>C.I:</th>
                <td>9125413 L.P.</td>
            </tr>
            <tr>
                <th>Lugar y Fecha:</th>
                <td>El Alto, 17 de Marzo del 2020</td>
            </tr>
        </table>
        </center>
        <ol>
            <li><a href="ejercicio1">Ejercicio N° 1</a></li>
            <li><a href="ejercicio2">Ejercicio N° 2</a></li>
            <li><a href="ejercicio3">Ejercicio N° 3</a></li>
            <li><a href="ejercicio4">Ejercicio N° 4</a></li>
            <li><a href="ejercicio5">Ejercicio N° 5</a></li>
        </ol>
    </body>
</html>package com.emergentes;

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
ejercicio 1
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
@WebServlet(name = "ejercicio2", urlPatterns = {"/ejercicio2"})
public class ejercicio2 extends HttpServlet {
    protected void processRequest(HttpServletRequest request,
   HttpServletResponse response) throws ServletException, IOException { 
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio N° 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center> Ejercicio N° 2</center></h1>");
            out.println("<form action='' method='post'>");
            out.println("<label>Convertir</label>");
            out.println("<select name='tipo'>");
            out.println("<option value=''></option>");
            out.println("<option value='dolares'>Bolivianos a Dolares</option>");
            out.println("<option value='bolivianos'>Dolares a Bolivianos </option>");
            out.println("</select>");
            out.println("<br>");
            out.println("<br>");
            out.println("<label>Monto</label>");
            out.println("<input type='text' name='monto'>");
            out.println("<input type='submit' value='convertir'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<center><a href='index.jsp'>Pagina principal</a></center>");
            
          
            float monto = Float.parseFloat(request.getParameter("monto"));
            String tipo = request.getParameter("tipo");
            float cotizacion = 6.92f;
          
            if(tipo.equals("dolares")){
                float cambio = monto / cotizacion;
                out.println("<h4>Resultado: " + cambio + " $us. </h4>");
            }
            else if(tipo.equals("bolivianos")){
                float cambio = monto * cotizacion;
                out.println("<h4>Resultado: " + cambio + " Bs. </h4>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
