package com.example.loginfacebook;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import java.util.ArrayList;

public class halamanutama extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halamanutama);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        addData();
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(halamanutama.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Fadila", "1890467892873", "085741960341","fadila@gmail.com","Memasak"));
        mahasiswaArrayList.add(new Mahasiswa("Budi", "1890467892877", "085944827290", "budiDoremi@gmail.com", "Berenang"));
        mahasiswaArrayList.add(new Mahasiswa("Farhan", "1274873597259", "087809294398", "farhan@gmail.com", "Lari"));
        mahasiswaArrayList.add (new Mahasiswa("Risa", "179849743252005" , "0859005003395", "risa@gmail.com", "Bermain gitar"));
    }
}