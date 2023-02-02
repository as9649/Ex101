package com.example.ex101;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Random;

/**
 * @author Eden Shvartz
 *
 */
public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;
    LinearLayout LL;
    Intent si;
    public static Random rnd=new Random();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        si=new Intent(getApplicationContext(), MainActivity2.class);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        LL = findViewById(R.id.LL);
        AlertDialog.Builder adb1=new AlertDialog.Builder(this);
        adb1.setMessage("message (1)");
        AlertDialog ad1=adb1.create();

        AlertDialog.Builder adb2=new AlertDialog.Builder(this);
        adb2.setTitle("Argentina");
        adb2.setIcon(R.drawable.argentina);
        adb2.setMessage("message (2)");
        AlertDialog ad2=adb2.create();

        AlertDialog.Builder adb3=new AlertDialog.Builder(this);
        adb3.setTitle("Israel");
        adb3.setIcon(R.drawable.israel);
        adb3.setMessage("message (3)");
        adb3.setCancelable(false);
        adb3.setNeutralButton("exit", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog ad3=adb3.create();

        AlertDialog.Builder adb4=new AlertDialog.Builder(this);
        adb4.setMessage("change color");
        adb4.setCancelable(false);
        adb4.setPositiveButton("ok", (dialogInterface, i) -> LL.setBackgroundColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))));
        adb4.setNeutralButton("exit", (dialogInterface, i) -> dialogInterface.cancel());
        AlertDialog ad4=adb4.create();

        AlertDialog.Builder adb5=new AlertDialog.Builder(this);
        adb5.setMessage("change color");
        adb5.setCancelable(false);
        adb5.setNegativeButton("ok", (dialogInterface, i) -> LL.setBackgroundColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))));
        adb5.setNeutralButton("exit", (dialogInterface, i) -> dialogInterface.cancel());
        adb5.setPositiveButton("white", (dialogInterface, i) -> LL.setBackgroundColor(Color.WHITE));
        AlertDialog ad5=adb5.create();


        btn1.setOnClickListener(view -> ad1.show());

        btn2.setOnClickListener(view -> ad2.show());

        btn3.setOnClickListener(view -> ad3.show());

        btn4.setOnClickListener(view -> ad4.show());

        btn5.setOnClickListener(view -> ad5.show());


    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        startActivity(si);
        return true;
    }
}