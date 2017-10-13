package com.example.chandrassekhar.gridlayout;

import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.chandrassekhar.gridlayout.R.id.btn1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        button1= (Button)findViewById(R.id.btn1);
        button2= (Button)findViewById(R.id.btn2);
        button3= (Button)findViewById(R.id.btn3);
        button4= (Button)findViewById(R.id.btn4);
        button5= (Button)findViewById(R.id.btn5);
        button6= (Button)findViewById(R.id.btn6);
        button7= (Button)findViewById(R.id.btn7);
        button8= (Button)findViewById(R.id.btn8);
        button9= (Button)findViewById(R.id.btn9);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.btn1:
                break;
            case R.id.btn2:
                break;
            case R.id.btn3:
                break;
            case R.id.btn4:
                break;
            case R.id.btn5:
                break;
            case R.id.btn6:
                break;
            case R.id.btn7:
                break;
            case R.id.btn8:
                break;
            case R.id.btn9:
                break;

        }
    }
}
