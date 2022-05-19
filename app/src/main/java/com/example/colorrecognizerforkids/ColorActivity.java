package com.example.colorrecognizerforkids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    ImageView star;
    TextView colorName;
    ImageButton btnPrev,btnNext;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        star=findViewById(R.id.color);
        colorName=findViewById(R.id.name);

        layout=findViewById(R.id.constraintLayout);

        btnPrev=findViewById(R.id.btn_prev);
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color= (String) colorName.getText();
                switch (color){
                    case "RED":
                        colorName.setText("WHITE");
                        colorName.setTextColor(Color.WHITE);
                        layout.setBackgroundColor(Color.LTGRAY);
                        break;
                    case "WHITE":
                        colorName.setText("BLACK");
                        colorName.setTextColor(Color.BLACK);
                        break;
                    case "BLACK":
                        colorName.setText("GRAY");
                        colorName.setTextColor(Color.GRAY);
                        break;
                    case "GRAY":
                        colorName.setText("BROWN");
                        colorName.setTextColor(Color.parseColor("#964B00"));
                        break;
                    case "BROWN":
                        colorName.setText("ORANGE");
                        colorName.setTextColor(Color.parseColor("FFA500"));
                        break;
                    case "ORANGE":
                        colorName.setText("PINK");
                        colorName.setTextColor(Color.parseColor("FFCOCB"));
                        break;
                    case "PINK":
                        colorName.setText("PURPLE");
                        colorName.setTextColor(Color.parseColor("#6A0DAD"));
                        break;
                    case "PURPLE":
                        colorName.setText("YELLOW");
                        colorName.setTextColor(Color.YELLOW);
                        break;
                    case "YELLOW":
                        colorName.setText("BLUE");
                        colorName.setTextColor(Color.BLUE);
                        break;
                    case "BLUE":
                        colorName.setText("GREEN");
                        colorName.setTextColor(Color.GREEN);
                        break;
                    case "GREEN":
                        colorName.setText("RED");
                        colorName.setTextColor(Color.RED);
                        layout.setBackgroundColor(Color.WHITE);
                        break;
                }
            }
        });

        btnNext=findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String color= (String) colorName.getText();
                switch (color){
                    case "RED":
                        colorName.setText("GREEN");
                        colorName.setTextColor(Color.GREEN);
                        break;
                    case "GREEN":
                        colorName.setText("BLUE");
                        colorName.setTextColor(Color.BLUE);
                        break;
                    case "BLUE":
                        colorName.setText("YELLOW");
                        colorName.setTextColor(Color.YELLOW);
                        break;
                    case "YELLOW":
                        colorName.setText("PURPLE");
                        colorName.setTextColor(Color.parseColor("#6A0DAD"));
                        break;
                    case "PURPLE":
                        colorName.setText("PINK");
                        colorName.setTextColor(Color.parseColor("FFCOCB"));
                        break;
                    case "PINK":
                        colorName.setText("ORANGE");
                        colorName.setTextColor(Color.parseColor("FFA500"));
                        break;
                    case "ORANGE":
                        colorName.setText("BROWN");
                        colorName.setTextColor(Color.parseColor("#964B00"));
                        break;
                    case "BROWN":
                        colorName.setText("GRAY");
                        colorName.setTextColor(Color.GRAY);
                        break;
                    case "GRAY":
                        colorName.setText("BLACK");
                        colorName.setTextColor(Color.BLACK);
                        break;
                    case "BLACK":
                        colorName.setText("WHITE");
                        colorName.setTextColor(Color.WHITE);
                        layout.setBackgroundColor(Color.LTGRAY);
                        break;
                    case "WHITE":
                        colorName.setText("RED");
                        colorName.setTextColor(Color.RED);
                        layout.setBackgroundColor(Color.WHITE);
                        break;
                }
            }
        });
    }
}