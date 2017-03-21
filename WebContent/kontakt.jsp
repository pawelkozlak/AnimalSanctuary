<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="includes/header.jsp"></jsp:include>

	<article>
		<section>
		<p>
		 Jeśli chcesz skontaktować się z nami wypełnij poniższy formularz i wyślij wiadomość.		
		</p>
		<form action="MessageController" method="post">
		<fieldset>
		<legend>Formularz kontaktowy</legend>
		<dl>
		<dt><strong>Wiadomość</strong></dt>
		<input type="textarea" name="message" placeholder="wiadomość" required="" autofocus=""></textarea><br>
		</dl>
		<p class="przycisk"><input type="submit" value="Wyślij"> </p>
		</fieldset>
		</form>
		</section>
	</article>
	<aside>
		<img src="images/kot.png">
	</aside>
<jsp:include page="includes/footer.jsp"></jsp:include>