package by.htp.les10.main;

/*
Создать класс Book, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими 
конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
import by.htp.les10.entity.Book;
import by.htp.les10.entity.Library;
import by.htp.les10.logic.LibraryLogic;
import by.htp.les10.view.LibraryViewer;
public class Main {
	public static void main(String []args) {
		Library library = new Library();
		LibraryLogic logic = new LibraryLogic();
		LibraryViewer view = new LibraryViewer();
		
		library.add(new Book());
		library.add(new Book(1, "War and peace", "L. N. Tolstoy", "Eksmo", 2016, 80, 40, "Hard"));
		library.add(new Book(2, "Harry Potter", "J. K. Rowling", "Eksmo", 2016, 90, 45, "Thin"));
		

		
		view.printAll("All books of L. N. Tolstoy:", logic.authorList("L. N. Tolstoy", library));
		
		view.printAll("All books of The Eksmo publisher:", logic.publisherList("Eksmo", library));
		
		view.printAll("All books published after 2015:", logic.yearMargin(2015, library));
	}

}
