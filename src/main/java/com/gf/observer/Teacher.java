package com.gf.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name){
        this.name = name;
    }
    public void update(Observable o, Object arg) {
        GPer gPer =  (GPer)o;
        Question question = (Question)arg;
        System.out.println("============================================");

        System.out.println(name+"老师，您好 \n"+"您收到了一个来自" +gPer.getName() +"的提问"+question.getContent()+"\n"
        +"提问者"+question.getUserName());
    }
}
