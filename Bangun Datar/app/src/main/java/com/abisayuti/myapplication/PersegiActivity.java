package com.abisayuti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //memanggil id dari widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button) findViewById(R.id.btnHitungPersegi);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        //aksi ketika di klik
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();




                //mengecek apakah edit text kosong
                //kondisi ketika kosong
                if(nPanjang.isEmpty()){
                    //memberikan Warning berupa error
                    etPanjang.setError("Panjang tidak boleh kosong");
                }else if(nLebar.isEmpty()) {
                    //memberikan Warning berupa error
                    etPanjang.setError("Lebar tidak boleh kosong");
                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * aPanjang) + (2 * aLebar);
                    int hasilHitungLuas = aPanjang * aLebar;

                    //menampilkan hasil hitung ke widget textview

                    txtHasil.setText("Keliling = " + hasilHitungKeliling + " Dan Luas = " +hasilHitungLuas );
                }
            }
        });
    }
}
