package org.javacloud.oops;

public class BookTest {
    public static void main(String[] args) {
        Books books=new Books("54C65","the subconcious mind","grek lee",550);
        BookService service=new BookService();
        service.getBookDetails(books);

    }
}
