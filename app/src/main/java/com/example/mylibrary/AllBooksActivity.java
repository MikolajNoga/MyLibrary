package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BooksRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BooksRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"1Q84", "Haruki Murakami", 1350, "https://dziupla.sowa.pl/f/bnwbvqo958z23.jpg",
                "A work of maddening brilliance", "Long description"));
        books.add(new Book(2,"The Myth of Sisyphus", "Alber Camus", 250, "https://emp-scs-uat.img-osdw.pl/img-p/1/kipwn/d576082e/std/2bc-452/814263459o.jpg",
                "Camus compares the absurdity of man's life with the situation of Sisyphus, a figure of Greek mythology who was condemned to repeat forever the same meaningless task of pushing a boulder up a mountain, only to see it roll down again.",
                "Long Description"));
        adapter.setBooks(books);
    }
}