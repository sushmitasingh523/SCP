<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   <%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<h1>Employees List</h1> 

 <%-- 
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>  
   <c:forEach var="erf" items="${empdis}">   
   <tr>  
   <td>${erf.id}</td>  
   <td>${erf.name}</td>  
   <td>${erf.salary}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>   --%>
  
     <display:table name="empdis" pagesize="10" >
    <display:column property="id"/>
    <display:column property="name"/>
    <display:column property="salary"/>
    
</display:table>