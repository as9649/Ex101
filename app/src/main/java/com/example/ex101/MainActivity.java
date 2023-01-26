package com.example.ex101;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Random;

/**
 * @author Eden Shvartz <edens1003@gmail.com>
 * @date 26/01/23
 *
 */
public class MainActivity extends AppCompatActivity {
    /**
     * The Btn 1.
     */
    Button btn1, /**
     * The Btn 2.
     */
    btn2, /**
     * The Btn 3.
     */
    btn3, /**
     * The Btn 4.
     */
    btn4, /**
     * The Btn 5.
     */
    btn5;
    /**
     * The Ll.
     */
    LinearLayout LL;
    /**
     * The constant rnd.
     */
    public static Random rnd=new Random();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        LL = findViewById(R.id.LL);
        AlertDialog.Builder adb1=new AlertDialog.Builder(this);
        adb1.setMessage("this is my message");
        AlertDialog ad1=adb1.create();

        AlertDialog.Builder adb2=new AlertDialog.Builder(this);
        adb2.setTitle("Argentina");
        adb2.setIcon(R.drawable.argentina);
        adb2.setMessage("this is my message (2)");
        AlertDialog ad2=adb2.create();

        AlertDialog.Builder adb3=new AlertDialog.Builder(this);
        adb3.setTitle("Israel");
        adb3.setIcon(R.drawable.israel);
        adb3.setMessage("this is my message (3)");
        adb3.setCancelable(false);
        adb3.setNeutralButton("exit", (dialogInterface, i) -> {
            dialogInterface.cancel();});
        AlertDialog ad3=adb3.create();

        AlertDialog.Builder adb4=new AlertDialog.Builder(this);
        adb4.setMessage("change color");
        adb4.setCancelable(false);
        adb4.setPositiveButton("ok", (dialogInterface, i) -> {
            LL.setBackgroundColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));});
        adb4.setNeutralButton("exit", (dialogInterface, i) -> {dialogInterface.cancel();});
        AlertDialog ad4=adb4.create();

        AlertDialog.Builder adb5=new AlertDialog.Builder(this);
        adb5.setMessage("change color");
        adb5.setCancelable(false);
        adb5.setNegativeButton("ok", (dialogInterface, i) -> {
            LL.setBackgroundColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));});
        adb5.setNeutralButton("exit", (dialogInterface, i) -> {dialogInterface.cancel();});
        adb5.setPositiveButton("white", (dialogInterface, i) -> {LL.setBackgroundColor(Color.WHITE);});
        AlertDialog ad5=adb5.create();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ad1.show();}});

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ad2.show();}});

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ad3.show();}});

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ad4.show();}});

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ad5.show();}});


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("next");
        menu.add("back");
        return true;
    }
}