package com.example.javahello;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lib.Dice;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View btnroll = findViewById(R.id.btnRoll);
        btnroll.setOnClickListener(diceRoll());
        Dice dice = new Dice();
        dice.Roll(6);

    }

    private View.OnClickListener diceRoll() {
        return v -> {
            int diceRoll = Dice.Roll(6);
            ImageView Droll = (ImageView)findViewById(R.id.imageRoll);
            TextView resultTextView = findViewById(R.id.text_roll);

            int drawableResource;
            switch (diceRoll) {
                case 1:
                    drawableResource = R.drawable.dice_1;
                    break;
                case 2:
                    drawableResource = R.drawable.dice_2;
                    break;
                case 3:
                    drawableResource = R.drawable.dice_3;
                    break;
                case 4:
                    drawableResource = R.drawable.dice_4;
                    break;
                case 5:
                    drawableResource = R.drawable.dice_5;
                    break;
                case 6:
                    drawableResource = R.drawable.dice_6;
                    break;
                default:
                    drawableResource = 0; // Set a default drawable if needed
                    break;
            }
            Log.d("DiceRoll", "Dice roll result: " + diceRoll);

            Droll.setImageResource(drawableResource);
            resultTextView.setText("Dice Roll Result: " + diceRoll);
        };


    }
}