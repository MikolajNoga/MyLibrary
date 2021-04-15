package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookActivity extends AppCompatActivity {

    private ImageView bookImage;
    private Button btnAddToCurrentlyReading, btnAddToWishlist, btnAddToAlreadyRead, btnAddToFavorite;
    private TextView txtBookName, txtAuthor, txtPages, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        initViews();

        //setData();
    }

    private void setData(Book book) {
        txtBookName.setText(book.getName());
        txtAuthor.setText(book.getAuthor());
        txtPages.setText(String.valueOf(book.getPages()));
        txtDesc.setText(book.getLongDec());
        Glide.with(this).asBitmap().load(book.getImageUrl()).into(bookImage);
    }

    private void initViews() {
        bookImage = findViewById(R.id.bookImg);

        btnAddToAlreadyRead = findViewById(R.id.btnAddToAlreadyRead);
        btnAddToCurrentlyReading = findViewById(R.id.btnAddToCurrentlyReading);
        btnAddToFavorite = findViewById(R.id.btnAddToFavorites);
        btnAddToWishlist = findViewById(R.id.btnAddToWishlist);

        txtAuthor = findViewById(R.id.txtAuthor);
        txtBookName = findViewById(R.id.authorNameTxt);
        txtDesc = findViewById(R.id.longDescTxt);
        txtPages = findViewById(R.id.numberOfPagesTxt);
    }
}