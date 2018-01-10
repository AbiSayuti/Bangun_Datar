package com.abisayuti.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {


    EditText etPanjang5;
    Button btnHitung5;
    TextView txtHasil5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        etPanjang5 = (EditText)findViewById(R.id.etPanjang5);
        btnHitung5 = (Button) findViewById(R.id.btnHitungPersegi5);
        txtHasil5 = (TextView) findViewById(R.id.txthasil5);

        btnHitung5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String nPanjang = etPanjang5.getText().toString();


                if(nPanjang.isEmpty()){
                    //memberikan Warning berupa error
                    etPanjang5.setError("Sisi tidak boleh kosong");

                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int aPanjang = Integer.parseInt(nPanjang);


                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = 4 * aPanjang;
                    int hasilHitungLuas = ;

                    //menampilkan hasil hitung ke widget textview

                    txtHasil.setText("Keliling = " + hasilHitungKeliling + " Dan Luas = " +hasilHitungLuas );
                }
            }
        });
    }
}
