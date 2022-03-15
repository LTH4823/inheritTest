package org.zerock.domain;

public class ObjQuiz extends QuizVO{
    @Override
    public String getDesc() {
        return "이 문제는 주관신 문제입니다.";
    }
    @Override
    public String getKind() {return "주관식 문제입니다.";}
}
