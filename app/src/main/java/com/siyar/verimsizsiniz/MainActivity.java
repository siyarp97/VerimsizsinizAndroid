package com.siyar.verimsizsiniz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buton = (Button) findViewById (R.id.button);
        EditText t1= (EditText)findViewById(R.id.t1);
        //EditText t2= (EditText)findViewById(R.id.t2);
        EditText yapilan= (EditText)findViewById(R.id.yapilan);
        EditText kalanGun= (EditText)findViewById(R.id.kalanGun);
        //EditText birimOrt= (EditText)findViewById(R.id.birimOrt);
        //EditText saat= (EditText)findViewById(R.id.saat);
        //EditText ayTam= (EditText)findViewById(R.id.ayTam);
        //EditText ayGun= (EditText)findViewById(R.id.ayGun);

        TextView t1Sonucu = (TextView) findViewById(R.id.t1Sonuc);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t1Veri = Double.parseDouble(t1.getText().toString());
                double yapilanVeri = Double.parseDouble(yapilan.getText().toString());
                double kalanGunVeri = Double.parseDouble(kalanGun.getText().toString());

                double t1Formul = (t1Veri - yapilanVeri) / kalanGunVeri;
                t1Sonucu.setText(""+t1Formul+"");

            }
        });
    }

}
