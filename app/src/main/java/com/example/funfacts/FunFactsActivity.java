package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our view variables
    private TextView mfactTextView;
    private Button mnextFactButton;
    private FactBook mfactBook = new FactBook();
    private  ColorWheel mcolorWheel = new ColorWheel();
    private RelativeLayout mrelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the Views from the layout file to the corresponding variables
        mfactTextView = findViewById(R.id.factTextView);
        mnextFactButton = findViewById(R.id.nextFactButton);
        mrelativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener nextFact = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update the fact TextView with new fact, and change the color
                mfactTextView.setText(mfactBook.getFact());
                int color = mcolorWheel.getColor();
                mrelativeLayout.setBackgroundColor(color);
                mnextFactButton.setTextColor(color);
            }
        };

        mnextFactButton.setOnClickListener(nextFact);

    }
}