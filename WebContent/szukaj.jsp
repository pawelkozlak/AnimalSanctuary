<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="includes/header.jsp"></jsp:include>

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
<jsp:include page="includes/footer.jsp"></jsp:include>