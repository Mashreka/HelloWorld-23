package com.example.helloworld;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            ConstraintLayout cl = findViewById(R.id.main);

            TextView tv =findViewById(R.id.label);
            tv.setText("Jag heter Mashreka!");
            tv.setTextSize(26);

            Button b =findViewById(R.id.button);
            Button b2 =new Button (MainActivity.this);
            b2.setX(300);
            b2.setY(400);
            cl.addView(b2);

            b2.setText("dont click");
            b.setText("Click here");

            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "HEJSAN",Toast.LENGTH_LONG).show();
                    Log.i ("Mashreka","click!!");

                }
            });
                b.setBackgroundColor(Color.rgb(255,0,0));
                Log.i("Mashreka","" +Color.rgb(255,255,0));
                String text ="Hello World?";
            Log.println(Log.DEBUG,"Mashreka",text);
            Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();


            return insets;
        });
    }
}