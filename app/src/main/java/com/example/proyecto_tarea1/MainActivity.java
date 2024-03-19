package com.example.proyecto_tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

   Drawable[] img123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Drawable drawableMemoCharlie = getResources().getDrawable(R.drawable.memocharlie);
        Drawable drawableMemoSally = getResources().getDrawable(R.drawable.memosally);
        Drawable drawableMemoSchroeder = getResources().getDrawable(R.drawable.memoschroeder);
        Drawable drawableMemoMarcia = getResources().getDrawable(R.drawable.memomarcia);
        Drawable drawableMemoRerun = getResources().getDrawable(R.drawable.memorerun);

        img123 = new Drawable[]{drawableMemoCharlie, drawableMemoSally, drawableMemoSchroeder, drawableMemoMarcia, drawableMemoRerun};
    }

    public void img1(View v){
        final Handler h=new Handler();
        final ImageButton img=findViewById(R.id.imageButton);
        Random random=new Random();
        int rd1=random.nextInt(5);
        img.setImageDrawable(img123[rd1]);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setImageResource(R.drawable.jmemoria);
            }
        },1000);


    }
    public void img2(View v){
        final Handler h=new Handler();
        final ImageButton img=findViewById(R.id.imageButton2);
        Random random=new Random();
        int rd1=random.nextInt(5);
        img.setImageDrawable(img123[rd1]);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setImageResource(R.drawable.jmemoria);
            }
        },1000);


    }
    public void img3(View v){
        final Handler h=new Handler();
        final ImageButton img=findViewById(R.id.imageButton3);
        Random random=new Random();
        int rd1=random.nextInt(5);
        img.setImageDrawable(img123[rd1]);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                img.setImageResource(R.drawable.jmemoria);
            }
        },1000);


    }
}