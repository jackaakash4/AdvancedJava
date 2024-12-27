<!DOCTYPE html>
<html>
    <head><title>Simple JSP</title>
    </head>
    <body>
        <h1>Displaying my name 10 times </h1>
        <table>
            <% for(int i = 0; i < 10; i++) { %>
            <tr><td>Jack Aakash</td></tr>
            <% } %>
        </table>
    </body>
</html>
