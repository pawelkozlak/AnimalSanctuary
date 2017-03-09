<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Animal Sanctuary</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<div class="container">
<header>
<a href="index.jsp"><img src="images/schronisko_w_krzesimowie.png" alt="schronisko"></a>
</header>
	<nav>
		<ul class="menu">
		<li><a href="home" title="Strona główna">Strona główna</a></li>
		<li><a href="o_schronisku" title="O schronisku">O schronisku</a></li>
		<li><a href="zwierzeta" title="Zwierzęta">Zwierzęta</a></li>
		<li><a href="szukaj" title="Sponsorzy">Szukaj</a></li>
		<li><a href="kontakt" title="Kontakt">Kontakt</a></li>
		</ul>
	</nav>

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
</div>
<footer>Copyright &copy; 2017 Paweł Koźlak. Wszystkie prawa zastrzeżone</footer>
</body>
</html>