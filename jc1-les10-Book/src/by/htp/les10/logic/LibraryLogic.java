package by.htp.les10.logic;

/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
import by.htp.les10.entity.Book;
import by.htp.les10.entity.Library;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogic {
	public List<Book> authorList(String author, Library library){
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getElements();
		
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getAuthor().equals(author)) {
				result.add(book);
			}
		}
		return result;
	}
	
	public List<Book> publisherList(String publisher, Library library){
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getElements();
		
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getPublisher().equals(publisher)) {
				result.add(book);
			}
		}
		return result;
	}
	
	public List<Book> yearMargin(int year, Library library){
		List<Book> result = new ArrayList<Book>();
		List<Book> books = library.getElements();
		
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getYear() >= year) {
				result.add(book);
			}
		}
		return result;
	}



}
