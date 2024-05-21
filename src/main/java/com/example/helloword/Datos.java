package com.example.helloword;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formulario")
public class Datos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edad = request.getParameter("edad");
        String curso = request.getParameter("curso");
        String mensaje = request.getParameter("mensaje");
        String email = request.getParameter("email");
        String lenguaje = request.getParameter("lenguaje");
        String genero = request.getParameter("genero");


        // Imprimir los datos recibidos en la consola del servidor
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.printf("Email: ", email);
        System.out.println("Lenguaje"+lenguaje);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Genero: "+genero);

        // Responder al cliente con un mensaje simple
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<center>");
        out.println("<h2>BIENVENIDO</h2>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Apellido: " + apellido + "</p>");
        out.println("<p>Edad: " + edad + "</p>");
        out.println("<p>Curso: " + curso + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Lenguaje"+lenguaje + "</p>");
        out.println("<p>Mensaje: " + mensaje + "</p>");
        out.println("<p>Genero: " + genero + "</p>");
        out.println("</center>");
        out.println("</body></html>");
    }
}

