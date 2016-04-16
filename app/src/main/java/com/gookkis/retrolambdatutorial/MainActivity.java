package com.gookkis.retrolambdatutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        /*btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello Retrolambda", Toast.LENGTH_LONG).show();

            }
        });*/

        btn.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Hello Retrolambda", Toast.LENGTH_LONG).show());

    }
}
