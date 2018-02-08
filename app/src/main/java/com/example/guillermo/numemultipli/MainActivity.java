package com.example.guillermo.numemultipli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private TextView tabla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.ednum);
        tabla=findViewById(R.id.txttabla);
    }

    public void multable(View v){

        int numero1=Integer.parseInt(num1.getText().toString());
        String aux="";
        for(int i=1; i<=10; i++){
            aux+=numero1+" * "+i+" = "+(numero1*i)+"\n";
        }
        tabla.setText(aux);
    }
}
