package com.example.ahmetkenangezici.dexcom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, graph.class));
            }
                                   }
        );
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view){
                                           startActivity(new Intent(MainActivity.this, Instruction.class));
                                       }
                                   }
        );
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view){
                                           startActivity(new Intent(MainActivity.this, training.class));
                                       }
                                   }
        );
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
                                       @Override
                                       public void onClick(View view){
                                           startActivity(new Intent(MainActivity.this, settings.class));
                                       }
                                   }
        );
    }
}
