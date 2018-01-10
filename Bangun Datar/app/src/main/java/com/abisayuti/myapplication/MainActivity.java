package com.abisayuti.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button

    Button btnPersegi, btnSegitiga, btnLingkaran, btnJajargenjang, btnPersegiPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil id persegi
        btnPersegi= (Button)findViewById(R.id.btnPersegi);
//        btnSegitiga= (Button)findViewById(R.id.btnSegitiga);
//


        //agar button btnPersegi bia di klik
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //agar bisa pindah avctivity maka kita harus menambahkan startactivity
                startActivity(a1);
            }
        });

        btnSegitiga= (Button)findViewById(R.id.btnSegitiga);


        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a2 = new Intent(getApplicationContext(), SegitigaActivity.class);
                //agar bisa pindah avctivity maka kita harus menambahkan startactivity
                startActivity(a2);
            }
        });


        btnLingkaran= (Button)findViewById(R.id.btnLingkaran);


        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a4 = new Intent(getApplicationContext(), LingkaranActivity.class);
                //agar bisa pindah avctivity maka kita harus menambahkan startactivity
                startActivity(a4);
            }
        });

        btnJajargenjang= (Button)findViewById(R.id.btnJajargenjang);


        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a3 = new Intent(getApplicationContext(), JajargenjangActivity.class);
                //agar bisa pindah avctivity maka kita harus menambahkan startactivity
                startActivity(a3);
            }
        });

        btnPersegiPanjang= (Button)findViewById(R.id.btnPersegiPanjang);


        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a5 = new Intent(getApplicationContext(), PersegiPanjangActivity.class);
                //agar bisa pindah avctivity maka kita harus menambahkan startactivity
                startActivity(a5);
            }
        });


    }
}
