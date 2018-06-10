<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<head>
     <title>Save Employee</title>
     
     <link type="text/css"
           rel="stylesheet"
           href="${pageContext.request.contextPath}/resources/css/style.css" />
           
     <link type="text/css"
           rel="stylesheet"
           href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />      
</head>

<body>

      <div id="wrapper">
           <div id="header">
                <h2>CRM - Employee Relationship Manager</h2>
           </div>      
      </div>
      
      <div id="container">
           <h3>Save Employee</h3>  
           
           <form:form action="saveEmployee" modelAttribute="employee" method="POST">
           
           <!-- need to associate this data with customer id -->
           <form:hidden path="id"/>
           
           <table>
                 <tbody>
                 
                     <tr>
                          <td><label>First name</label></td>
                          <td><form:input path="firstName"/></td>
                     </tr>
                     
                     <tr>
                          <td><label>Last name</label></td>
                          <td><form:input path="lastName"/></td>
                     </tr>
                     
                     <tr>
                          <td><label>Company</label></td>
                          <td><form:input path="company"/></td>
                     </tr>
                     
                     <tr>
                          <td><label></label></td>
                          <td><input type="submit" value="SAVE" class="save"/></td>
                     </tr>
                 
                 </tbody>           
           </table>           
           
           </form:form>
           
           <div style="clear; both;"></div>
           
           <p>
                 <a href="${pageContext.request.contextPath}/employee/list ">Back to List</a>
           </p>
          
      </div>

</body>

</html>