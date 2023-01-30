package com.example.myapplication;

import android.os.Handler;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuesModel implements QuesContrat.Model {
    private QuesContrat.Presenter.Presenter1 press;
    private int count=0;



private String questions []={
        "What is mvp ?",
        "What is mvvm ?",
        "what is Git ?",
        "What is mvc ?",
        "Tap the strager","Choisissez la bonne réponse concernant Android"
        ," Qu’est-ce qu’une activité en Android",""
};


    private String trueanswers []={
            "Model View Presenter",
            "Model View View Model",
            "sys gestion de version",
            "Model View Control",
            "RelativeLayout"," Android est un système d’exploitation"};

private String answers [][]={
        {"Model View Partner","Model View Presenter","Model View Patcher"},
        {"Model View View Main","Maroc View Viking Model ","Model View View Model"},
        {"sys gestion de projet","sys gestion de version","Magic"},
        {"Model View Control","Model View Console","Model View Closed"},
        {"Values","RelativeLayout","Drawable"},{" Android est une application web","Android est un serveur web"," Android est un système d’exploitation"}
};
public String NAME[];
    @Override
    public void addName(String string){



    NAME[1]=string;
}

    @Override
    public String getName() {


return NAME[1];

    }


    @Override
    public String getQuestion(int o) {



        return questions[o];
    }


    @Override
    public List<String> getAnswers(int o) {
        List<String> anse =new ArrayList<String>(3);
        for (int i=0;i< 3;i++){
            anse.add(answers[o][i].toString());

        }
        return anse;


    }

    @Override
    public String getTrueAnswer(int o) {


        return trueanswers[o];

    }
}
