package com.abisayuti.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajargenjangActivity extends AppCompatActivity {


    EditText etAlasJajargenjang, etsisiB, etTinggiJajargenjang;
    Button btnHitungJajargenjang;
    TextView txtHasilJajargenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajargenjang);

        etsisiB = (EditText)findViewById(R.id.etSisiBJajargenjang);
        etAlasJajargenjang = (EditText)findViewById(R.id.etAlasJajargenjang);
        etTinggiJajargenjang = (EditText)findViewById(R.id.etTinggiJajargenjang);
        btnHitungJajargenjang = (Button) findViewById(R.id.btnHitungJajargenjang);
        txtHasilJajargenjang = (TextView) findViewById(R.id.txthasiljajargenjang);

        btnHitungJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String nsisiBJajargenjang = etsisiB.getText().toString();
                String nTinggiJajargenjang = etTinggiJajargenjang.getText().toString();
                String nAlasJajargenjang = etAlasJajargenjang.getText().toString();

                //mengecek apakah edit text kosong
                //kondisi ketika kosong
                if(nsisiBJajargenjang.isEmpty()){
                    //memberikan Warning berupa error
                    etsisiB.setError("Sisi B tidak boleh kosong");
                }else if(nAlasJajargenjang.isEmpty()) {
                    //memberikan Warning berupa error
                    etAlasJajargenjang.setError("Alas tidak boleh kosong");
                }else if(nTinggiJajargenjang.isEmpty()) {
                    //memberikan Warning berupa error
                    etTinggiJajargenjang.setError("Tinggi tidak boleh kosong");

                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int aAlas = Integer.parseInt(nAlasJajargenjang);
                    int aSisiB = Integer.parseInt(nsisiBJajargenjang);
                    int aTinggiJajargenjang = Integer.parseInt(nTinggiJajargenjang);

                    //kondisi ketika panjang dan lebar nya tidak kosong

                    int hasilHitungKelilingjajargenjang = 2 * (aAlas + aSisiB);
                    int hasilHitungLuasjajargenjang = aAlas * aTinggiJajargenjang;

                    //menampilkan hasil hitung ke widget textview

                    txtHasilJajargenjang.setText ("Keliling = " + hasilHitungKelilingjajargenjang + " Dan Luas = " +hasilHitungLuasjajargenjang );
                }
            }
        });
    }
}
