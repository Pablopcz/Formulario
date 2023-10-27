<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>FORMULARIO DE SRE OK!</h1>
        <form action="Resultados.jsp" method="get">
         SELECCIONAR LA INSTITUCION: <select name)="selectPro">  
             <option value="El Prado Bachillerato">El Prado Bachillerato</option>
             <option value="Colegio Delicias">Colegio Delicias</option>
             <option value="Colegio Delicias">Colegio Delicias</option>
             <option value="Colegio Calipso">Colegio Calipso</option>
         </select><br>
         USUARIO/CODIGO: <input type="text" name="txtPre" ><br>  
         CONTRASEÑA: <input type="text" name="txtPre" ><br>
            <input type="submit" name="btn1" value="Ingresar">
        </form>
    </body>
</html>
