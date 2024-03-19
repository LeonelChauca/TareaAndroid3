package com.example.proyecto_tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.Collections;
import android.os.Handler;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Drawable[] img123;
   int contVolt=0;
   int contI=0;
   int contR=0;
   TextView a;
    TextView b;
   ImageButton cont;
   ArrayList<Drawable> imgList = new ArrayList<>();

    ImageButton[] btnImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Drawable drawableMemoCharlie = getResources().getDrawable(R.drawable.memocharlie);
        Drawable drawableMemoSally = getResources().getDrawable(R.drawable.memosally);
        Drawable drawableMemoSchroeder = getResources().getDrawable(R.drawable.memoschroeder);
        Drawable drawableMemoMarcia = getResources().getDrawable(R.drawable.memomarcia);
        Drawable drawableMemoRerun = getResources().getDrawable(R.drawable.memorerun);
        a=findViewById(R.id.textView3);
        b=findViewById(R.id.textView5);


        img123 = new Drawable[]{drawableMemoCharlie, drawableMemoCharlie,
                drawableMemoSally, drawableMemoSally,
                drawableMemoSchroeder, drawableMemoSchroeder,
                drawableMemoMarcia, drawableMemoMarcia,
                drawableMemoRerun, drawableMemoRerun};

        btnImages = new ImageButton[]{
                findViewById(R.id.imageButton),
                findViewById(R.id.imageButton2),
                findViewById(R.id.imageButton3),
                findViewById(R.id.imageButton4),
                findViewById(R.id.imageButton5),
                findViewById(R.id.imageButton6),
                findViewById(R.id.imageButton7),
                findViewById(R.id.imageButton8),
                findViewById(R.id.imageButton9),
                findViewById(R.id.imageButton10)
        };

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomizeImages();
                contI=0;
                a.setText(0+"");
                contR=0;
                b.setText(0+"");
            }
        });
    }

    private void randomizeImages() {
        Collections.addAll(imgList, img123);
        Collections.shuffle(imgList);
        for (int i = 0; i < btnImages.length; i++) {
            final int index = i;
            final Handler h = new Handler();
            btnImages[i].setImageDrawable(imgList.get(i));
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    btnImages[index].setImageResource(R.drawable.jmemoria);
                }
            }, 1500);
        }
    }
    public void img1(View v){
        ImageButton img= findViewById(v.getId());
        for (int i = 0; i < btnImages.length; i++) {
            if(btnImages[i]==img){
                final Handler h = new Handler();
                img.setImageDrawable(imgList.get(i));
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        contVolt=contVolt+1;
                        if(contVolt==1){
                            cont=img;
                        }
                        else if(contVolt==2){
                            if(cont.getDrawable()!=img.getDrawable()){
                                img.setImageResource(R.drawable.jmemoria);
                                cont.setImageResource(R.drawable.jmemoria);

                            }
                            else{
                                contR=contR+1;
                                b.setText(contR+"");
                            }
                            contI=contI+1;
                            a.setText(contI+"");
                            contVolt=0;
                        }

                    }
                }, 1000);
            }
        }
    }
}