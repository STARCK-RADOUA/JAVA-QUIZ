package com.example.myapplication;

import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;
import static android.content.Intent.parseIntent;

import android.content.Intent;
import android.provider.Settings;

import java.util.Random;

public class QuesPresenter implements QuesContrat.Presenter.Presenter1 {
    private QuesContrat.Model mdl;
    private QuesContrat.view vw;
    private QuesContrat.view.view2 vw2;
    private int count=0;

    public QuesPresenter(QuesContrat.Model mdl, QuesContrat.view.view2 vw2) {
        this.mdl = mdl;
        this.vw2 = vw2;
    }

    public QuesPresenter(QuesContrat.Model mdl, QuesContrat.view vw) {
        this.mdl = mdl;
        this.vw = vw;
    }

    @Override
    public void sTart() {





    }
    private int score=0;

    @Override
    public void sTart2() {
        vw2.getQuestion(mdl.getQuestion(count));
        vw2.getAnswers(mdl.getAnswers(count));











    }


    @Override
    public int getCount() {
        return score;


    }

    @Override
    public String corectAnswer() {

      return   mdl.getTrueAnswer(count);

    }

    @Override
    public String count() {

        count++;

        return null;
    }

    @Override
    public void scoreAdd() {
        score+=10;
        vw2.corectAns(getCount());

        vw2.scoreAddView(getCount());

    }


    @Override
    public void onDestory() {

    }
}






