package com.example.colorrecognizerforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView color;
    TextView colorName;
    ImageButton btnPrev,btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        color=findViewById(R.id.color);
        colorName=findViewById(R.id.name);

        btnPrev=findViewById(R.id.btn_prev);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        btnNext=findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(colorName.equals("RED")){
                    color.srcCompat="@drawable/ic_baseline_star_24";
                }
            }
        });
    }

    
}