package com.example.helloword;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

//Esta es una anotacion, un path o una key para enlazarme
//al server.
@WebServlet("/servlet")

public class HelloServlet extends HttpServlet {
    //Indicamos el metodo a utilizar en el server
    //Enviamos los datos mediante un link utilizamos el metodo get
    //Enviamos los datos mediante un formulario utilizamos el metodo post

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Seteo el tipo de contenido que me a devolver el servidor
        resp.setContentType("text/html");
        //Defino una varialbe del tipo PrintWriter
        //Para mostrar contenido en pantalla
        PrintWriter out = resp.getWriter();

        // Obtener parámetros de la URL

        //out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<h1 style=\"color: blue;\">Hola Mundo desde Servlet</h1>");// Saludo personalizado



        out.print("</body>");
        out.print("</html>");
    }
}