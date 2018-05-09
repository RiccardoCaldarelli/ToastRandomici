package com.example.riccardocaldarelli.toastrandomici;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    Button random;
    int MAX=100;
    int MIN=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = findViewById(R.id.start);
        random.setOnClickListener(new MyOnClickListener());


    }

    private class MyOnClickListener implements OnClickListener{

        @Override
        public void onClick(View v) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text = null;
            Random r = new Random();
            Toast toast;

            for(int x=0; x<10; x++)
            {
                int i1 = r.nextInt(MAX-MIN) + MIN;

                text = (CharSequence)String.valueOf(i1);
                toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.LEFT,0,0);
                toast.show();
            }



        }
    }
}
