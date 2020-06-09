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
@WebServlet(name = "ejercicio5", urlPatterns = {"/ejercicio5"})
public class ejercicio5 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
        int paso = 1, cont = 1;
        int a[][] = new int[11][11];
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejercicio N° 5</title>");            
            out.println("</head>");
            out.println("<body>");            
            out.println("<h1>Ejercicio N° 5</h1>");
            out.println("<h3>Instrucciones</h3>");
            out.println("<h4>Inserta un numero y presione el boton enviar</h4>");
            out.println("<h4>debe insertar un numero del 1 al 10</h4>");
            out.println("<form action='' method='post'>");
            out.println("<input type='number' name='n1' min='1' max='10'>");
            out.println("<input type='submit'>");
            out.println("</form><br>");
            
            int n1 = Integer.parseInt(request.getParameter("n1"));

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n1; j++) {
                    a[i][j] = 0;
                }
            }
            
            for (int i = 0; i < n1; i++) {

                if (paso == 1) {
                    for (int j = 0; j < n1; j++) {
                        if (a[i][j] == 0) {
                            a[i][j] = cont++;
                        }
                    }
                }
                paso++;

                if (paso == 2) {
                    for (int j = 0; j < n1; j++) {
                        if (a[j][n1 - (i + 1)] == 0) {
                            a[j][n1 - (i + 1)] = cont++;
                        }
                    }
                }

                paso++;
                if (paso == 3) {
                    for (int j = n1 - 1; j >= 0; j--) {
                        if (a[n1 - (i + 1)][j] == 0) {
                            a[n1 - (i + 1)][j] = cont++;
                        }
                    }
                }
                paso++;

                if (paso == 4) {
                    for (int j = n1 - 1; j >= 0; j--) {
                        if (a[j][i] == 0) {
                            a[j][i] = cont++;
                        }
                    }
                }
                paso = 1;

            }
            for (int ii = 0; ii < n1; ii++) {
                for (int j = 0; j < n1; j++) {
                    if (a[ii][j] < 10) {
                        out.print("0");
                    } 
                    out.println(a[ii][j] + "&emsp;");
                }
                out.println("<br>");
            }       
            out.println("<br>");
            out.println("<center><a href='index.jsp'>Pzgina principal</a></center>");
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
