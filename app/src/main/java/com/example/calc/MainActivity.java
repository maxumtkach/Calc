package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnPoint = findViewById(R.id.btn_point);


        textView = findViewById(R.id.text_view_edit);
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);
        btn4.setOnClickListener(onClickListener);
        btn5.setOnClickListener(onClickListener);
        btn6.setOnClickListener(onClickListener);
        btn7.setOnClickListener(onClickListener);
        btn8.setOnClickListener(onClickListener);
        btn9.setOnClickListener(onClickListener);
        btn0.setOnClickListener(onClickListener);
        btnPoint.setOnClickListener(onClickListener);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn1:
                    textView.setText("" + btn1.getText().toString());
                    break;
                case R.id.btn2:
                    textView.setText("" + btn2.getText().toString());
                    break;
                case R.id.btn3:
                    textView.setText("" + btn3.getText().toString());
                    break;
                case R.id.btn4:
                    textView.setText("" + btn4.getText().toString());
                    break;
                case R.id.btn5:
                    textView.setText("" + btn5.getText().toString());
                    break;
                case R.id.btn6:
                    textView.setText("" + btn6.getText().toString());
                    break;
                case R.id.btn7:
                    textView.setText("" + btn7.getText().toString());
                    break;
                case R.id.btn8:
                    textView.setText("" + btn8.getText().toString());
                    break;
                case R.id.btn9:
                    textView.setText("" + btn9.getText().toString());
                    break;
                case R.id.btn0:
                    textView.setText("" + btn0.getText().toString());
                    break;
                case R.id.btn_point:
                    textView.setText("" + btnPoint.getText().toString());
                    break;
            }
        }
    };


}
