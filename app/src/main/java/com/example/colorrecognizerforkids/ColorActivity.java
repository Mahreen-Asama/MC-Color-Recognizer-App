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
                        btnPrev.setBackgroundColor(Color.BLACK);
                        btnNext.setBackgroundColor(Color.BLACK);
                        btnPrev.setColorFilter(Color.WHITE);
                        btnNext.setColorFilter(Color.WHITE);
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
                        colorName.setTextColor(Color.rgb(165,42,42));
                        star.setColorFilter(Color.rgb(165,42,42));
                        btnPrev.setBackgroundColor(Color.rgb(165,42,42));
                        btnNext.setBackgroundColor(Color.rgb(165,42,42));
                        break;
                    case "BROWN":
                        colorName.setText("ORANGE");
                        colorName.setTextColor(Color.rgb(255,165,0));
                        star.setColorFilter(Color.rgb(255,165,0));
                        btnPrev.setBackgroundColor(Color.rgb(255,165,0));
                        btnNext.setBackgroundColor(Color.rgb(255,165,0));
                        break;
                    case "ORANGE":
                        colorName.setText("PINK");
                        colorName.setTextColor(Color.rgb(255,20,147));
                        star.setColorFilter(Color.rgb(255,20,147));
                        btnPrev.setBackgroundColor(Color.rgb(255,20,147));
                        btnNext.setBackgroundColor(Color.rgb(255,20,147));
                        break;
                    case "PINK":
                        colorName.setText("PURPLE");
                        colorName.setTextColor(Color.rgb(93,63,211));
                        star.setColorFilter(Color.rgb(93,63,211));
                        btnPrev.setBackgroundColor(Color.rgb(93,63,211));
                        btnNext.setBackgroundColor(Color.rgb(93,63,211));
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
                        colorName.setTextColor(Color.rgb(0,128,0));
                        star.setColorFilter(Color.rgb(0,128,0));
                        btnPrev.setBackgroundColor(Color.rgb(0,128,0));
                        btnNext.setBackgroundColor(Color.rgb(0,128,0));
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
                        colorName.setTextColor(Color.rgb(0,128,0));
                        star.setColorFilter(Color.rgb(0,128,0));
                        btnPrev.setBackgroundColor(Color.rgb(0,128,0));
                        btnNext.setBackgroundColor(Color.rgb(0,128,0));
                        break;
                    case "GREEN":
                        colorName.setText("BLUE");
                        colorName.setTextColor(Color.BLUE);
                        btnPrev.setBackgroundColor(Color.BLUE);
                        btnNext.setBackgroundColor(Color.BLUE);
                        star.setColorFilter(Color.BLUE);
                        break;
                    case "BLUE":
                        colorName.setText("YELLOW");
                        colorName.setTextColor(Color.YELLOW);
                        btnPrev.setBackgroundColor(Color.YELLOW);
                        btnNext.setBackgroundColor(Color.YELLOW);
                        star.setColorFilter(Color.YELLOW);
                        break;
                    case "YELLOW":
                        colorName.setText("PURPLE");
                        colorName.setTextColor(Color.rgb(41,5,67));
                        star.setColorFilter(Color.rgb(41,5,67));
                        btnPrev.setBackgroundColor(Color.rgb(41,5,67));
                        btnNext.setBackgroundColor(Color.rgb(41,5,67));
                        break;
                    case "PURPLE":
                        colorName.setText("PINK");
                        colorName.setTextColor(Color.rgb(100,7,57));
                        star.setColorFilter(Color.rgb(100,7,57));
                        btnPrev.setBackgroundColor(Color.rgb(100,7,57));
                        btnNext.setBackgroundColor(Color.rgb(100,7,57));
                        break;
                    case "PINK":
                        colorName.setText("ORANGE");
                        colorName.setTextColor(Color.rgb(100,64,0));
                        star.setColorFilter(Color.rgb(100,64,0));
                        btnPrev.setBackgroundColor(Color.rgb(100,64,0));
                        btnNext.setBackgroundColor(Color.rgb(100,64,0));
                        break;
                    case "ORANGE":
                        colorName.setText("BROWN");
                        colorName.setTextColor(Color.rgb(165,42,42));
                        star.setColorFilter(Color.rgb(165,42,42));
                        btnPrev.setBackgroundColor(Color.rgb(165,42,42));
                        btnNext.setBackgroundColor(Color.rgb(165,42,42));
                        break;
                    case "BROWN":
                        colorName.setText("GRAY");
                        colorName.setTextColor(Color.GRAY);
                        btnPrev.setBackgroundColor(Color.GRAY);
                        btnNext.setBackgroundColor(Color.GRAY);
                        star.setColorFilter(Color.GRAY);
                        break;
                    case "GRAY":
                        colorName.setText("BLACK");
                        colorName.setTextColor(Color.BLACK);
                        btnPrev.setBackgroundColor(Color.BLACK);
                        btnNext.setBackgroundColor(Color.BLACK);
                        star.setColorFilter(Color.BLACK);
                        btnPrev.setColorFilter(Color.WHITE);
                        btnNext.setColorFilter(Color.WHITE);
                        break;
                    case "BLACK":
                        colorName.setText("WHITE");
                        colorName.setTextColor(Color.WHITE);
                        btnPrev.setBackgroundColor(Color.WHITE);
                        btnNext.setBackgroundColor(Color.WHITE);
                        star.setColorFilter(Color.WHITE);
                        break;
                    case "WHITE":
                        colorName.setText("RED");
                        colorName.setTextColor(Color.RED);
                        btnPrev.setBackgroundColor(Color.RED);
                        btnNext.setBackgroundColor(Color.RED);
                        star.setColorFilter(Color.RED);
                        break;
                }
            }
        });
    }
}