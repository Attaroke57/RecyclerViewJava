package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.AdapterListener {
    private Adapter adapter;
    private RecyclerView rvfilm;
    private ArrayList <Data> DataFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataFilm = new ArrayList<>();
        adapter = new Adapter(getApplicationContext(), DataFilm,MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvfilm = findViewById(R.id.rvFilm);
        rvfilm.setHasFixedSize(true);
        rvfilm.setLayoutManager(mLayoutManager);
        rvfilm.setAdapter(adapter);
        AddData();

    }
    public void AddData() {

        // Start AddData
        Data film1 = new Data();
        film1.setJudul("The Super Mario Bros. Movie");
        film1.setRilis("Apr 05, 2023");
        film1.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg");
        DataFilm.add(film1);

        Data film2 = new Data();
        film2.setJudul("Shazam! Fury of the Gods");
        film2.setRilis("Mar 16, 2023");
        film2.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/A3ZbZsmsvNGdprRi2lKgGEeVLEH.jpg");
        DataFilm.add(film2);

        Data film3 = new Data();
        film3.setJudul("Cocaine Bear");
        film3.setRilis("Mar 17, 2023");
        film3.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/gOnmaxHo0412UVr1QM5Nekv1xPi.jpg");
        DataFilm.add(film3);

        Data film4 = new Data();
        film4.setJudul("65");
        film4.setRilis("Mar 08, 2023");
        film4.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/rzRb63TldOKdKydCvWJM8B6EkPM.jpg");
        DataFilm.add(film4);

        Data film5 = new Data();
        film5.setJudul("John WIck: Chapter 4");
        film5.setRilis("Mar 22, 2023");
        film5.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/vZloFAK7NmvMGKE7VkF5UHaz0I.jpg");
        DataFilm.add(film5);

        Data film6 = new Data();
        film6.setJudul("The Pope's Exorcist");
        film6.setRilis("Apr 19, 2023");
        film6.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/9JBEPLTPSm0d1mbEcLxULjJq9Eh.jpg");
        DataFilm.add(film6);

        Data film7 = new Data();
        film7.setJudul("Dungeons & Dragons: Honor Among Thieves");
        film7.setRilis("Mar 29, 2023");
        film7.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/6LuXaihVIoJ5FeSiFb7CZMtU7du.jpg");
        DataFilm.add(film7);

        Data film8 = new Data();
        film8.setJudul("Champions");
        film8.setRilis("Mar 10, 2023");
        film8.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/yVgtsoXyTZBww7SWE4JE1U4Wcel.jpg");
        DataFilm.add(film8);

        Data film9 = new Data();
        film9.setJudul("Scream VI");
        film9.setRilis("Mar 08, 2023");
        film9.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/aePBN8ffLCHoUXp8lkA5P29CXdx.jpg");
        DataFilm.add(film9);

        Data film10 = new Data();
        film10.setJudul("The Woman King");
        film10.setRilis("Mar 10, 2023");
        film10.setImage("https://www.themoviedb.org/t/p/w220_and_h330_face/438QXt1E3WJWb3PqNniK0tAE5c1.jpg");
        DataFilm.add(film10);

        // End AddData
    }

    @Override
    public void onDataSelected(Data data) {

    }
}