package com.example.projetopi;


import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        constraintLayout = findViewById(R.id.layout);


//        constraintLayout.setBackgroundColor(Color.rgb(255,34,52));
//        editText.setBackgroundColor(Color.argb(60,24,121,213));

    }
}
