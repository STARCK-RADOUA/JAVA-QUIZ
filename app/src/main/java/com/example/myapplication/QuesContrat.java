package com.example.myapplication;

import java.util.List;

public interface QuesContrat {

interface view {
    void getName(String string);
    void inital();
    void getQuestion(String string);
    void getAnswers(String string1,String string2,String string3);
    void getTrueAnswer(String trueAnsw);
    void buttonNext();
    interface view2{void getName(String string);
        void scoreAddView(int string);
        void getQuestion(String string);
        void getAnswers(List<String> list);
        void corectAns(int trueAnsw);
        void getFragment();
        void incorectAns(String string);}
}
interface Presenter{
    interface Presenter1{

       void sTart();
        void sTart2();
       int getCount();
       String corectAnswer();
       String count();
       void scoreAdd();
       int getScore();

       void onDestory();

    }


}
interface Model {
    void addName(String string);
    String getName();
    String getQuestion(int o);
    List<String> getAnswers(int o);
    String getTrueAnswer(int o);


}
}
