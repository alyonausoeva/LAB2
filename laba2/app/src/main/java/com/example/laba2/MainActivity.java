package com.example.laba2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button enter;
    EditText rad1;
    EditText rad2;

    TextView answer;
    double temp;
    String tempAnswer;
    int R1;
    int R2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter = findViewById(R.id.button);
        rad1 = findViewById(R.id.rad1);
        rad2 = findViewById(R.id.rad2);

        answer = findViewById(R.id.answer);

        enter.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((rad1.length() != 0) &&
                        (rad2.length() != 0))
                {
                    R1 = Integer.parseInt(rad1.getText().toString());
                    R2 = Integer.parseInt(rad2.getText().toString());

                }

                temp = (3.14*(R1*R1 - R2*R2));
                tempAnswer = Double.toString(temp);
                answer.setText(tempAnswer);
            }
        });
    }
}
