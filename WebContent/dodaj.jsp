<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<jsp:include page="includes/header.jsp"></jsp:include>
	<article>
		
		<section>
			<h1>${message}</h1> <br><br><br>
			<form action="MainController" method="post">
			<div class="formularz">
			
			<label>Zgłaszam:</label>
			<select name="rodzaj">
			      <option value="znalezione">Znalezione</option>
				  <option value="zaginione">Zaginione</option>
				  <option value="doOddania">Do oddania</option>
			</select><br>
	------------------------------------------------------------------
			<br><h1>Dane zwierzaka:</h1><br>
			<label>Imię:</label> <input type="text" name="imie"><br><br>
	------------------------------------------------------------------
	
			<br><label>Gatunek:</label>
			<select name="gatunek">
				<p>
			      <option value="inne">inne</option>
				  <option value="kot">kot</option>
				  <option value="pies">pies</option>
				<p>
			</select><br>
	------------------------------------------------------------------
			<br><br><label>Płeć:</label>
			<select name="plec">
			      <option value="samiec">samiec</option>
				  <option value="samica">samica</option>
			</select><br>
	------------------------------------------------------------------
			<br><br><label>Wielkość:</label>
			<select name="wielkosc">
		 		  <option value="duzy">duzy</option>
		 		  <option value="sredni">sredni</option>
		 		  <option value="maly">maly</option>
			</select><br>
	------------------------------------------------------------------
			<br><br><label>Informace dodatkowe(obroża, znaki szczególne):</label>
			<br><textarea name="infoDodatkowe" rows="4" cols="30"></textarea><br>
	------------------------------------------------------------------
			<br><br><h1>Okoliczności zaginięcia</h1><br>
				<label>Miejsce/Rejon:</label> <input type="text" name="miejsce"><br>
				<label>Dodatkowe informacje:</label> <input type="text" name="dodatkoweInformacje"><br><br><br>
	------------------------------------------------------------------
			<br><h1>Osoba zgłaszająca</h1><br>
				<label>Imię i nazwisko:</label> <input type="text" name="imieNazwisko"><br>
				<label>Telefon:</label> <input type="text" name="telefon"><br></p>
				<label>Wyrażam zgode na przetwarzanie danych osobowych:</label><br> 
				<input type="checkbox"  name="zgoda" required><br><br><br>			
			</div>
				<input type="submit"  value="Dodaj zwierze" />
			</form>
		</section>
	</article>
	<aside>
		<img src="images/pies.png">
	</aside>
	
<jsp:include page="includes/footer.jsp"></jsp:include>