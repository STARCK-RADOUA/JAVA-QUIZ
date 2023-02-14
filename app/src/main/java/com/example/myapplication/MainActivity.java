package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements QuesContrat.view{
    private QuesContrat.Presenter.Presenter1 press;
    private EditText et1;
    private Button bt1;
    private TextView tv1;
    private ProgressBar pb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName6);
        bt1= findViewById(R.id.button6);
        tv1=findViewById(R.id.textView8);

        press=new QuesPresenter(new QuesModel(),this);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=et1.getText().toString();




                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                Bundle b =new Bundle();
                b.putString("name",val);
                intent.putExtra("score",b);
                startActivity(intent);





            }
        });

    }


    @Override
    public void getName(String string) {


    }

    @Override
    public void inital() {

    }

    @Override
    public void getQuestion(String string) {


    }

    @Override
    public void getAnswers(String string1, String string2, String string3) {

    }

    @Override
    public void getTrueAnswer(String trueAnsw) {

    }

    @Override
    public void buttonNext() {

    }
}