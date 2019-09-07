<h1>Your new Blog </h1>

<netui:form action="blog">
    <table>
         <tr valign="top">
             <td><label for="field1"> FirstName: </label></td>
             <td><netui:textBox dataSource="actionForm.firstName" tagId="field1"></netui:textBox></td>
         </tr>
         <tr valign="top">
             <td><label for="field2"> LastName: </label></td>
             <td><netui:textBox dataSource="actionForm.lastName" tagId="field2"></netui:textBox></td>
         </tr>
    </table>
    <netui:button value="Submit" type="submit" />
</netui:form>