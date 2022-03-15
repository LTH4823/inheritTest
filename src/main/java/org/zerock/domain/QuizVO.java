package org.zerock.domain;

import lombok.Setter;

@Setter
public abstract class QuizVO {

    protected String kind;
    protected String quiz;
    protected String answer;

    public abstract String getDesc();
    public abstract String getKind();
    public String getQuiz(){return this.quiz;}
    public boolean checkAnswer(String userAnswer){ return this.answer.equals(userAnswer); }

}
