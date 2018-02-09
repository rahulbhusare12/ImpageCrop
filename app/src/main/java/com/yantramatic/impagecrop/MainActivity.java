package com.yantramatic.impagecrop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button btn_cature;
    private  int a,b,c,d,t;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
       
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_cature=findViewById(R.id.btn_cature);
        btn_cature.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                a=1;
                b-=2;
                d=7;
                t=6;
                c=a+c;
                c=a-b;
                c=d+t;
            
        
            }
        });
    }
}
