<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tres en Raya</title>

    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f5f5f5;
        }

        table {
            border-collapse: collapse;
        }

        td {
            width: 120px;
            height: 120px;
            border: 2px solid #999;
            text-align: center;
            vertical-align: middle;
        }

        .circle {
            width: 70px;
            height: 70px;
            border: 8px solid black;
            border-radius: 50%;
            margin: auto;
        }

        .cross {
            font-size: 80px;
            color: #c62828;
            font-weight: bold;
        }
    </style>
</head>

<body>

<table>
<%
    String[][] tablero = (String[][]) request.getAttribute("tablero");

    for (int i = 0; i < 3; i++) {
%>
    <tr>
    <%
        for (int j = 0; j < 3; j++) {
            String valor = tablero[i][j];
    %>
        <td>
            <%
                if ("O".equals(valor)) {
            %>
                <div class="circle"></div>
            <%
                } else if ("X".equals(valor)) {
            %>
                <div class="cross">✖</div>
            <%
                }
            %>
        </td>
    <%
        }
    %>
    </tr>
<%
    }
%>
</table>

</body>
</html>
