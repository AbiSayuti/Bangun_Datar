package com.abisayuti.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText etPanjangSegitiga, etLebarSegitiga, etpanjangsisia, etpanjangsisib, etpanjangsisic;
    Button btnHitungSegitiga;
    TextView txtHasilsegitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);


        etPanjangSegitiga = (EditText)findViewById(R.id.etPanjangSegitiga);
        etLebarSegitiga = (EditText)findViewById(R.id.etLebar);
        etpanjangsisia = (EditText)findViewById(R.id.etpanjangsisia);
        etpanjangsisib = (EditText)findViewById(R.id.etpanjangsisib);
        etpanjangsisic = (EditText)findViewById(R.id.etpanjangsisic);
        btnHitungSegitiga = (Button) findViewById(R.id.btnHitungSegitiga);
        txtHasilsegitiga = (TextView) findViewById(R.id.txthasilsegitiga);

        btnHitungSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String nPanjang = etPanjangSegitiga.getText().toString();
                String nLebar = etLebarSegitiga.getText().toString();
                String nsisia = etpanjangsisia.getText().toString();
                String nsisib = etpanjangsisib.getText().toString();
                String nsisic = etpanjangsisic.getText().toString();

                if(nPanjang.isEmpty()){
                    //memberikan Warning berupa error
                    etPanjangSegitiga.setError("Panjang tidak boleh kosong");
                }else if(nLebar.isEmpty()) {
                    //memberikan Warning berupa error
                    etLebarSegitiga.setError("Lebar tidak boleh kosong");
                }else if(nsisia.isEmpty()) {
                    //memberikan Warning berupa error
                    etpanjangsisia.setError("Sisi A tidak boleh kosong");
                }else if(nsisic.isEmpty()) {
                    //memberikan Warning berupa error
                    etLebarSegitiga.setError("Sisi C tidak boleh kosong");
                }else if(nsisib.isEmpty()) {
                    //memberikan Warning berupa error
                    etpanjangsisib.setError("Sisi B tidak boleh kosong");

                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);
                    int aSisiA = Integer.parseInt(nsisia);
                    int aSisiB = Integer.parseInt(nsisib);
                    int aSisiC = Integer.parseInt(nsisic);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (aSisiA + aSisiB + aSisiC);
                    int hasilHitungLuas = 2 / aPanjang * aLebar;

                    txtHasilsegitiga.setText("Keliling = " + hasilHitungKeliling + " Dan Luas = " +hasilHitungLuas );

                }
            }
        });
    }
}
