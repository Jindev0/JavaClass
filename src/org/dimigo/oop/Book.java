package org.dimigo.oop;

public class Book {
    // 필드선언
    private String title = "Word Master";
    private String author = "이투스북";
    private int page = 300;

    // 기본 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String toString() {
        return "책 제목 : " + this.title + " " + "저자명 : " + this.author + " " + "페이지 수 : " + this.page;
    }
}
