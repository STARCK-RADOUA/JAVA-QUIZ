package com.example.myapplication;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;


import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity2 extends AppCompatActivity implements QuesContrat.view.view2,View.OnClickListener{
    private QuesContrat.Presenter.Presenter1 press;
    private Button bt1,bt2,bt3,next;
    private TextView scr,name,quest;
    private int count=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        scr=findViewById(R.id.score);
        name=findViewById(R.id.name);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                press.count();
                bt1.setBackgroundTintList(ColorStateList.valueOf(0XFF8A2BE2));
                bt2.setBackgroundTintList(ColorStateList.valueOf(0XFF8A2BE2));
                bt3.setBackgroundTintList(ColorStateList.valueOf(0XFF8A2BE2));


                press.sTart2();
            }
        });

        quest=findViewById(R.id.quest);
        String msg =getIntent().getStringExtra("name");
        name.setText("Hello "+msg);




        press =new QuesPresenter(new QuesModel(),this);
        press.sTart2();
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);




    }


    @Override
    public void getName(String string) {name.setText(string);

    }

    @Override
    public void scoreAddView(int string) {
        scr.setText(Integer.toString(string));

    }

    @Override
    public void getQuestion(String string) {
        quest.setText(string);

    }

    @Override
    public void getAnswers(List<String> list) {
        bt1.setText(list.get(0).toString());
        bt2.setText(list.get(1).toString());
        bt3.setText(list.get(2).toString());

    }

    @Override
    public void corectAns(int trueAnsw) {
        if(trueAnsw==10){


        Toast.makeText(this, "Nice", Toast.LENGTH_SHORT).show();}
        if(trueAnsw==20){

        Toast.makeText(this, "Good", Toast.LENGTH_SHORT).show();}
        if(trueAnsw==30){
        Toast.makeText(this, "Great", Toast.LENGTH_SHORT).show();}
        if(trueAnsw==50){
        Toast.makeText(this, "Good Choice", Toast.LENGTH_SHORT).show();}
        if(trueAnsw==60){
        Toast.makeText(this, "super", Toast.LENGTH_SHORT).show();}
        if(trueAnsw==70){
        Toast.makeText(this, "hero", Toast.LENGTH_SHORT).show();}





    }

    @Override
    public void getFragment() {

    }

    @Override
    public void incorectAns(String string) {
        Toast.makeText(this, "Great", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Great", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Great", Toast.LENGTH_SHORT).show();



    }



    @Override
    public void onClick(View view) {
        String STR =press.corectAnswer();
        if (bt3.getText().toString()==STR){
            bt3.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));

            if (bt3.isPressed()){
                press.scoreAdd();}




        }else {
            bt3.setBackgroundTintList(ColorStateList.valueOf(Color.RED));

        }
        if (bt1.getText().toString()==STR){
            bt1.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
            if (bt1.isPressed()){
                press.scoreAdd();}




        }else {
            bt1.setBackgroundTintList(ColorStateList.valueOf(Color.RED));


        }
        if (bt2.getText().toString()==STR){
            bt2.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));

            if (bt2.isPressed()){
                press.scoreAdd();}




        }else {
            bt2.setBackgroundTintList(ColorStateList.valueOf(Color.RED));

        }



    }
}