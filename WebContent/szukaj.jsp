<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
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
		<li><a href="szukaj" title="Sponsorzy">Szukaj</a></li>
		<li><a href="kontakt" title="Kontakt">Kontakt</a></li>
		<li><a href="formularz_zgloszeniowy" title="formularz_zgloszeniowy">Dodaj</a></li>
		
	</nav>

	<article>
		<section>
			<form action="SzukajController" method="post">
				<br><br><label>Rasa:</label>
			<input type="text" name="gatunek"  placeholder="rasa"><br><br>			
	------------------------------------------------------------------
				<br><label>Płeć:</label>
					<select name="plec">
					  <option selected> wybierz</option>
					  <option value="samiec">samiec</option>
					  <option value="samica">samica</option>
					</select><br>
	------------------------------------------------------------------				
				<br><br><label>Wielkość:</label>
					<select name="wielkosc">
		 		  		<option selected> wybierz</option>
		 		  		<option value="duzy">duzy</option>
		 		  		<option value="sredni">sredni</option>
		 		  		<option value="maly">maly</option>
					</select><br>
	------------------------------------------------------------------				
				<br><br><label>Miejsce zaginięcia:</label>
			<input type="text" name="miejsceZaginiecia"  placeholder="miejsce zaginiecia"><br><br>
				
				<button type="submit">
				Szukaj
				</button>			
			</form><br>
				<table>
				<tr>
				<td>Imię</td>
				<td>Rasa</td>
				<td>Płeć</td>
				<td>Wielkość</td>
				<td>Miejsce Zaginięcia</td>
				</tr>
				</table>
			<c:forEach items="${listOfAnimals}" var="animalByName">
				<table>
				<tr>
				<td>${animalByName.name}</td>
				<td>${animalByName.rasa}</td>
				<td>${animalByName.plec}</td>
				<td>${animalByName.wielkosc}</td>
				<td>${animalByName.miejsceZaginiecia}</td>
				</tr>
				</table>
			</c:forEach>
			${message}
		</section>
	</article>
	<aside>
		<img src="images/pies.png">
	</aside>
</div>
<footer>Copyright &copy; 2017 Paweł Koźlak. Wszystkie prawa zastrzeżone</footer>
</body>
</html>