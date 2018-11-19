<%@page isELIgnored="false" %>
<html>
    <body>
        <h2>Hello World!</h2>
        <% out.write("I'm in a JSP, try to avoid using these % surrounded things"); %>

        <p>This is the right way to display computed output, using EL, the expression language:</p>
        <p>Name is: ${model.name}</p>
    </body>
</html>
