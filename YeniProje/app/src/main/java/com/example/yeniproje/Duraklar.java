package com.example.yeniproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.yeniproje.databinding.ActivityDuraklarBinding;
import com.example.yeniproje.databinding.ActivityMainBinding;

public class Duraklar extends AppCompatActivity {

    private ActivityDuraklarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDuraklarBinding.inflate(getLayoutInflater());//layout ıcındekı tum viewlar nesne olarak karsımıza cıkacak.
        View view=binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();
        String id=intent.getStringExtra("kodu");
        String ad =intent.getStringExtra("adı");
        binding.textViewbus.setText(id+"-"+ad);
        String ilkDurak= intent.getStringExtra("IlkDurak");
        String sonDurak= intent.getStringExtra("SonDurak");
        binding.textView18.setText(ilkDurak);
        binding.textView19.setText(sonDurak);















    }

}