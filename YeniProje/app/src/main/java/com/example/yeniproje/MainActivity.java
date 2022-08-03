package com.example.yeniproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yeniproje.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    TableRow tr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());//layout ıcındekı tum viewlar nesne olarak karsımıza cıkacak.
        setContentView(binding.getRoot());//bagladıgımız seyı görünüme cevırıyor.


        Items items_data[] = new Items[]{

                new Items("114", "Optimum_Real", "0"),
                new Items("114", "Real_Optimum", "1"),
                new Items("124", "x", "0"),
                new Items("124", "y", "1"),
                new Items("142", "x", "0"),
                new Items("142", "y", "1"),
        };



        TableLayout tl = new TableLayout(this);



        for (Items items : items_data) {

            tr = new TableRow(this);

            TextView textView = new TextView(this);
            textView.setText(items.OtobusKodu);
            textView.setWidth(500);
            textView.setHeight(150);
            tr.addView(textView);

            TextView adı = new TextView(this);
            adı.setText(items.Adı);
            adı.setWidth(550);
            adı.setHeight(150);
            tr.addView(adı);

            TextView yonu = new TextView(this);
            yonu.setText(items.Yonu);
            tr.addView(yonu);


            String IlkDurak[]={"OPTIMUM AVM 1A","M1 AVM 1A","DR.M.ÖZSAN BUL. 10.DURAK(BALCALI HASTANESİ)","M1 AVM 1A",

                    "M1 AVM 1A","ESKİ VİLAYET"};
            String SonDurak[]={"M1 AVM 1B","OPTIMUM AVM 1B","M1 AVM 1B","ÇUKUROVA UNİ. 5A","ESKİ VİLAYET","M1 AVM 1A"};


            tr.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this,Duraklar.class);
                    String kodu = items.OtobusKodu;
                    String ad = items.Adı;
                    intent.putExtra("kodu",kodu);
                    intent.putExtra("adı",ad);
                    intent.putExtra("IlkDurak",IlkDurak[view.getId()]);
                    intent.putExtra("SonDurak",SonDurak[view.getId()]);

                    startActivity(intent);





                }
            });

            tl.addView(tr);


        }
        binding.tableLayout.addView(tl);




    }


}