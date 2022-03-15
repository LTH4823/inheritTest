package org.zerock.domain;

import lombok.Builder;
import lombok.Setter;

import java.util.Arrays;

@Builder
@Setter
public class SubQuiz extends QuizVO{

    private String[] arr;

    @Override
    public boolean checkAnswer(String userAnswer){
        boolean condition1 = super.checkAnswer(userAnswer);

        if(condition1){
            return true;
        }

        int userIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(userAnswer.equals(arr[i])){
                userIdx = i;
                break;
            }
        }


        boolean condition2 = userIdx +1 == Integer.parseInt(answer);

        if(condition2){
            return true;
        }

        return false;
    }

    @Override
    public String getDesc() {
        return Arrays.toString(arr);
    }

    @Override
    public String getKind() {return "객관식 문제입니다.";}
}
