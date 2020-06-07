package com.example.internshipproject_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    Button reset;
    TextView textView,text2;
    int value;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=findViewById(R.id.button_reset);
       reset=findViewById(R.id.button_click);
        textView=findViewById(R.id.text);
        edit1=findViewById(R.id.edit1);
        text2=findViewById(R.id.text2);
    }
    public void pressed(View view){
        value=Integer.parseInt(textView.getText().toString());
        value++;
        textView.setText(""+value);
        text2.setText(edit1.getText().toString());
    }
    public void rpressed(View view){
        textView.setText(""+1);
        text2.setText("");
    }
}
