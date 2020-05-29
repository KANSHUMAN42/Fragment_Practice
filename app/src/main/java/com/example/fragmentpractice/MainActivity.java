package com.example.fragmentpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);

        HomeFragmenta homeFragmenta=new HomeFragmenta();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentmain,homeFragmenta);
        transaction.commit();


            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    SecondFragment secondFragment=new SecondFragment();
                    FragmentTransaction transactiona=getSupportFragmentManager().beginTransaction();
                    transactiona.replace(R.id.fragmentmain,secondFragment);
                    transactiona.commit();
                }
            });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstFragment fragment=new FirstFragment();
                FragmentTransaction transactionb=getSupportFragmentManager().beginTransaction();
                transactionb.replace(R.id.fragmentmain,fragment);
                transactionb.commit();
            }
        });








    }
}
