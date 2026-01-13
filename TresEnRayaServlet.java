package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tresenraya")
public class TresEnRayaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Tablero 3x3
        String[][] tablero = new String[3][3];

        // Lista con 3 X, 3 O y 3 espacios vacíos
        List<String> fichas = new ArrayList<>();
        fichas.add("X");
        fichas.add("X");
        fichas.add("X");
        fichas.add("O");
        fichas.add("O");
        fichas.add("O");
        fichas.add("");
        fichas.add("");
        fichas.add("");

        // Mezclar aleatoriamente
        Collections.shuffle(fichas);

        // Llenar el tablero
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = fichas.get(index);
                index++;
            }
        }

        // Enviar el tablero al JSP
        request.setAttribute("tablero", tablero);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
