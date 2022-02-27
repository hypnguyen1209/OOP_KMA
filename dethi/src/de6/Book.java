/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Doan
 */
public class Book {
    private String id;
    private String authors;
    private String title;
    private String category;

    public Book() {
    }

    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void witeToFile(Book b) throws IOException{
        File f = new File("book.dat");
        FileWriter fw = new FileWriter(f,true);
        fw.write(b.toString());
        fw.close();
    }

    @Override
    public String toString() {
        return "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '\n';
    }
    
    
}
