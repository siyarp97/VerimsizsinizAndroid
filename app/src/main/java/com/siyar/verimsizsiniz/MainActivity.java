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
        EditText t2= (EditText)findViewById(R.id.t2);
        EditText yapilan= (EditText)findViewById(R.id.yapilan);
        EditText kalanGun= (EditText)findViewById(R.id.kalanGun);
        EditText birimOrt= (EditText)findViewById(R.id.birimOrt);
        EditText saat= (EditText)findViewById(R.id.saat);
        EditText ayTam= (EditText)findViewById(R.id.ayTam);
        EditText ayGun= (EditText)findViewById(R.id.ayGun);

        TextView t1Sonucu = (TextView) findViewById(R.id.t1Sonuc);
        TextView t2Sonucu = (TextView) findViewById(R.id.t2Sonuc);
        TextView adetHedefSonucu = (TextView) findViewById(R.id.adetHedefSonuc);
        TextView verimlilikSonucu = (TextView) findViewById(R.id.verimlilikSonuc);
        TextView t1TamamlananSonucu = (TextView) findViewById(R.id.t1TamamlananSonuc);
        TextView t2TamamlananSonucu = (TextView) findViewById(R.id.t2TamamlananSonuc);
        TextView ayTamamlananSonucu = (TextView) findViewById(R.id.ayTamamlananSonuc);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double t1Veri = Double.parseDouble(t1.getText().toString());
                double yapilanVeri = Double.parseDouble(yapilan.getText().toString());
                double kalanGunVeri = Double.parseDouble(kalanGun.getText().toString());
                double birimOrtVeri = Double.parseDouble(birimOrt.getText().toString());
                double t2Veri = Double.parseDouble(t2.getText().toString());
                double saatVeri = Double.parseDouble(saat.getText().toString());
                double ayTamVeri = Double.parseDouble(ayTam.getText().toString());
                double ayGunVeri = Double.parseDouble(ayGun.getText().toString());



                //FORMÜLLER --------------------------------------------

                double t1Formul = (t1Veri - yapilanVeri) / kalanGunVeri;
                t1Sonucu.setText(""+t1Formul+"");

                double t2Formul = (t2Veri - yapilanVeri) / kalanGunVeri;
                t2Sonucu.setText(""+t2Formul+"");

                double adetHedefFormul = (t2Formul/birimOrtVeri);
                adetHedefSonucu.setText(""+adetHedefFormul+"");

                double verimlilikFormul = (t2Formul/saatVeri);
                verimlilikSonucu.setText(""+verimlilikFormul+"");

                double t1TamamlananFormul = (t1Veri/ayGunVeri);
                t1TamamlananSonucu.setText(""+t1TamamlananFormul+"");

                double t2TamamlananFormul = (t2Veri/ayGunVeri);
                t2TamamlananSonucu.setText(""+t2TamamlananFormul+"");

                double ayTamFormul = (ayTamVeri/ayGunVeri);
                ayTamamlananSonucu.setText(""+ayTamFormul+"");


            }
        });
    }

}
