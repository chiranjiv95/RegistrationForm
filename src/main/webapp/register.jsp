<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
 
 	 <h1>Registration Form</h1>
    <p>Please fill out this form with the required information</p>
    <form action="ControllerServlet" method="post">
      <fieldset>
        <label>Enter Your First Name: <input type="text" name="first-name" required /></label>
        <label>Enter Your Last Name: <input type="text" name="last-name" required /></label>
        <label>Enter Your Email: <input type="email" name="email" required /></label>
        <label>Create a New Password: <input type="password" name="password" pattern="[a-z0-5]{8,}" required /></label>
        <label>Input your age (years): <input type="number" name="age" min="13" max="120" /></label>
			  
    
      </fieldset>
      
    
      <fieldset>
        <label>
          <input type="checkbox" name="terms" class="inline"  required /> I accept the <a href="https://www.freecodecamp.org/news/terms-of-service/">terms and conditions</a>
			  </label>
  		 </fieldset>
  
      <fieldset>
        <label>Select your course:
          <select name="course">
            <option value="">(select one)</option>
            <option value="Java FSD">Java FSD</option>
            <option value="MERN Stack">MERN Stack</option>
            <option value="MEAN Stack">MEAN Stack</option>
            <option value="Python">Python</option>
          </select>
        </label>
      </fieldset>
 
    
      <input type="submit" value="Submit" />
    </form>
</body>
</html>