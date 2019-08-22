package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timeClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generally set up initial value
        timeClicked = 0;

        //wiring the widgets links the xml to the
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked (View view) {
        Toast.makeText(this, "YOU DID IT", Toast.LENGTH_LONG).show();
        //increase the timesClicked
        timeClicked++;
        //show value
        buttonClickerButton.setText("Score: " + timeClicked);

        textViewScore.setText("Score: " + timeClicked);

        changeBackgroundColor();
    }

    private void changeBackgroundColor()
    {
        int r = (int) (256 * Math.random());
        int g = (int) (256 * Math.random());
        int b = (int) (256 * Math.random());
        int color = Color.rgb(r,g,b);
        constraintLayout.setBackgroundColor(color);
        //set the text color to be the opposite of your background color
        //remember the negative of a color is 255-color
        int negColor = Color.rgb(255-r,255-g,255-b);
        textViewScore.setTextColor(negColor);
    }

}