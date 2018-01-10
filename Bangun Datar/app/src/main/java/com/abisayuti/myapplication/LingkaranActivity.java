package com.abisayuti.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText etjarijari;
    Button btnHitunglingkaran;
    TextView txtHasillingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        etjarijari = (EditText)findViewById(R.id.etjarijari);
        btnHitunglingkaran = (Button) findViewById(R.id.btnhitunglingkaran);
        txtHasillingkaran = (TextView) findViewById(R.id.txthasillingkaran);

        btnHitunglingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String njarijari = etjarijari.getText().toString();

                if(njarijari.isEmpty()){
                    //memberikan Warning berupa error
                    etjarijari.setError("Jari jari  tidak boleh kosong");
                }else{
                    //mengubah nilai dari String ke integer terlebih dahulu
                    int ajarijari = Integer.parseInt(njarijari);



                    int hasilHitungKeliling = (2 * 22 / 7 * ajarijari);
                    int hasilHitungLuas = 22 /7 * ajarijari * ajarijari;

                    //menampilkan hasil hitung ke widget textview

                    txtHasillingkaran.setText("Keliling = " + hasilHitungKeliling + " Dan Luas = " +hasilHitungLuas );
                }
            }
        });
    }
}


