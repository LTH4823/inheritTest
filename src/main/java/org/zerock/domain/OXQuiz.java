package org.zerock.domain;

import lombok.Builder;

@Builder
public class OXQuiz extends QuizVO{

    @Override
    public String getDesc() {
        return "O or X ?";
    }
    @Override
    public String getKind() {return "OX 문제입니다.";}
}
