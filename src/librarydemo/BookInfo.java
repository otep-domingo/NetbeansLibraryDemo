/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydemo;

/**
 *
 * @author joseph
 */
public class BookInfo {

    private int bookId;
    private String bookTitle;
    private String bookStatus;

    public BookInfo(int id, String title, String status) {
        bookId = id;
        bookTitle = title;
        bookStatus = status;
    }

    public int getId() {
        return bookId;
    }

    public String getTitle() {
        return bookTitle;
    }

    public String getStatus() {
        return bookStatus;
    }
}

