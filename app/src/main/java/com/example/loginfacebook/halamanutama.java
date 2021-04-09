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
        mahasiswaArrayList.add(new Mahasiswa("Fadila", "1890467892873", "085741960341","Fadila@gmail.com","Rebahan:v"));
        mahasiswaArrayList.add(new Mahasiswa("Budi", "1890467892877", "085944827290", "BudiDoremi@gmail.com", "Makan ayam"));
        mahasiswaArrayList.add(new Mahasiswa("cak jon", "1274873597259", "087809294398", "cak jon@gmail.com", "Jual sate"));
        mahasiswaArrayList.add (new Mahasiswa("Mput", "179849743252005" , "0859005003395", "Mput@gmail.com", "Bermain gitar"));
    }
}