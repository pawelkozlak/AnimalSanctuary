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
<a href="home"><img src="images/schronisko_w_krzesimowie.png" alt="schronisko"></a>
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
			<form action="MainController" method="post">
			<input type="text" name="imie" required="" placeholder="imie"><br>
			<input type="text" name="rasa" required="" placeholder="rasa"><br>
			<input type="text" name="wiek" required="" placeholder="wiek"><br>
				<button type="submit">
				Dodaj zwierze
				</button>
			</form>
		</section>
	</article>
	<aside>
		<img src="images/pies.png">
	</aside>
</div>
<footer>Copyright &copy; 2017 Paweł Koźlak. Wszystkie prawa zastrzeżone</footer>
</body>
</html>