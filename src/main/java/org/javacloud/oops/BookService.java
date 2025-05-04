package org.javacloud.oops;

public class BookService {
    public void getBookDetails(Books books){
        if(books.getId()!=null)
            System.out.println("Book id is "+books.getId());

        if(books.getTitle()!=null)
            System.out.println("Book Title is "+books.getTitle());

        if(books.getAuthor()!=null)
            System.out.println("Book Author is "+books.getAuthor());
        if(books.getPrice()!=0)
            System.out.println("Book price is "+books.getPrice());

    }
}
