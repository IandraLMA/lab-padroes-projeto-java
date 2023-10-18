package one.digitalinnovation.gof.builder;

public class BookBuilder {
    private Book book;

    private BookBuilder(){
        this.book = new Book();
    }

    public static BookBuilder builder(){
        return new BookBuilder();
    }

    public Book build(){
        return this.book;
    }

    public BookBuilder title(String title){
        this.book.setTitle(title);
        return this;
    }
    public BookBuilder author(String author){
        this.book.setAuthor(author);
        return this;
    }
    public BookBuilder gender(String gender){
        this.book.setGender(gender);
        return this;
    }
}
