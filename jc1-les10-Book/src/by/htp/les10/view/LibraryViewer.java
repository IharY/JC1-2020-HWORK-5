package by.htp.les10.view;

import java.util.List;

import by.htp.les10.entity.Book;
//import by.htp.les10.entity.Library;

public class LibraryViewer {
	public void printAll(String massage, List <Book> books) {
		System.out.println("--------------------------------------");
		System.out.println("massage");
		System.out.println("--------------------------------------");
		
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			System.out.println(book.toString());
		}
	}

}
