package com.example.mdshaddu07.shadan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    EditText e1,e2,e3;
    Integer c_quan,c_total,p_quan,p_total,d_quan,d_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view){

        c1 =(CheckBox)findViewById(R.id.c1);
        c2=(CheckBox)findViewById(R.id.c2);
        c3=(CheckBox)findViewById(R.id.c3);
        e1 =(EditText)findViewById(R.id.e1);
        e2 =(EditText)findViewById(R.id.e2);
        e3 =(EditText)findViewById(R.id.e3);


        int amt=0;
        StringBuilder result = new StringBuilder();
        result.append("Selected Items:");

        if(c1.isChecked() && e1.getText().toString().length()!=0){

            d_quan = Integer.parseInt(e1.getText().toString());
            d_total = d_quan * 80;
            result.append("\n Dosa : "+ d_total);
            amt+=d_total;
        }
        if(c2.isChecked()){

            p_quan = Integer.parseInt(e2.getText().toString());
            p_total = p_quan * 100;
            result.append("\nPasta : "+ p_total);
            amt+=p_total;
        }
        if(c3.isChecked()){

            c_quan = Integer.parseInt(e3.getText().toString());
            c_total = c_quan * 120;
            result.append("\nChilli Paneer : "+ c_total);
            amt+=c_total;
        }

        result.append(" \nTotal Amount : "+amt+" ");
        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

    }
}