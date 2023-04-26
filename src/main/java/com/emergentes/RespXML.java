/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
 * @author CRISTHIAN
 */
@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<?xml version=\"1.0\" enconding=\"UTF-8\"?>");
            out.println("<CATALOGO>");
            out.println("<CD>");
            out.println("<TITULO> Tinta roja</TITULO>");
            out.println("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>5.90</PRECIO>");
            out.println("<ANO>2006</ANO>");
            out.println("</CD>");
            out.println("<CD>");
            out.println("<TITULO>La Lengua Popular</TITULO>");
            out.println("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.println("<ORIGEN>AR</ORIGEN>");
            out.println("<PRECIO>9.90</PRECIO>");
            out.println("<ANO>2007</ANO>");
            out.println("</CD>");
            out.println("</CATALOGO>");
        }finally{
            out.close();
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
