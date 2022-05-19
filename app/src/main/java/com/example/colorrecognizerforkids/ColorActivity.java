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
                        star.setColorFilter(Color.WHITE);
                        btnPrev.setBackgroundColor(Color.WHITE);
                        btnNext.setBackgroundColor(Color.WHITE);
                        break;
                    case "WHITE":
                        colorName.setText("BLACK");
                        colorName.setTextColor(Color.BLACK);
                        star.setColorFilter(Color.BLACK);
                        btnPrev.setBackgroundColor(Color.WHITE);
                        btnNext.setBackgroundColor(Color.WHITE);
                        break;
                    case "BLACK":
                        colorName.setText("GRAY");
                        colorName.setTextColor(Color.GRAY);
                        star.setColorFilter(Color.GRAY);
                        btnPrev.setBackgroundColor(Color.GRAY);
                        btnNext.setBackgroundColor(Color.GRAY);
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
                        star.setColorFilter(Color.YELLOW);
                        btnPrev.setBackgroundColor(Color.YELLOW);
                        btnNext.setBackgroundColor(Color.YELLOW);
                        break;
                    case "YELLOW":
                        colorName.setText("BLUE");
                        colorName.setTextColor(Color.BLUE);
                        star.setColorFilter(Color.BLUE);
                        btnPrev.setBackgroundColor(Color.BLUE);
                        btnNext.setBackgroundColor(Color.BLUE);
                        break;
                    case "BLUE":
                        colorName.setText("GREEN");
                        colorName.setTextColor(Color.GREEN);
                        star.setColorFilter(Color.GREEN);
                        btnPrev.setBackgroundColor(Color.GREEN);
                        btnNext.setBackgroundColor(Color.GREEN);
                        break;
                    case "GREEN":
                        colorName.setText("RED");
                        colorName.setTextColor(Color.RED);
                        star.setColorFilter(Color.RED);
                        btnPrev.setBackgroundColor(Color.RED);
                        btnNext.setBackgroundColor(Color.RED);
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
                        btnPrev.setBackgroundColor(Color.GREEN);
                        btnNext.setBackgroundColor(Color.GREEN);
                        break;
                    case "GREEN":
                        colorName.setText("BLUE");
                        colorName.setTextColor(Color.BLUE);
                        btnPrev.setBackgroundColor(Color.BLUE);
                        btnNext.setBackgroundColor(Color.BLUE);
                        break;
                    case "BLUE":
                        colorName.setText("YELLOW");
                        colorName.setTextColor(Color.YELLOW);
                        btnPrev.setBackgroundColor(Color.YELLOW);
                        btnNext.setBackgroundColor(Color.YELLOW);
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
                        btnPrev.setBackgroundColor(Color.GRAY);
                        btnNext.setBackgroundColor(Color.GRAY);
                        break;
                    case "GRAY":
                        colorName.setText("BLACK");
                        colorName.setTextColor(Color.BLACK);
                        btnPrev.setBackgroundColor(Color.WHITE);
                        btnNext.setBackgroundColor(Color.WHITE);
                        break;
                    case "BLACK":
                        colorName.setText("WHITE");
                        colorName.setTextColor(Color.WHITE);
                        btnPrev.setBackgroundColor(Color.WHITE);
                        btnNext.setBackgroundColor(Color.WHITE);
                        break;
                    case "WHITE":
                        colorName.setText("RED");
                        colorName.setTextColor(Color.RED);
                        btnPrev.setBackgroundColor(Color.RED);
                        btnNext.setBackgroundColor(Color.RED);
                        break;
                }
            }
        });
    }
}