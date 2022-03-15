package org.zerock.repository;

import org.zerock.domain.OXQuiz;
import org.zerock.domain.QuizVO;

public class SingerQuizRepositoryImpl implements QuizRepository{

    private QuizVO[] quizzes;

    public SingerQuizRepositoryImpl(){
        quizzes = new QuizVO[1];
        OXQuiz quiz1 = OXQuiz.builder().build();
        quiz1.setQuiz("성시경은 가수인가?");
        quiz1.setAnswer("0");

        quizzes[0] =quiz1;

    }

    @Override
    public QuizVO getNextQuiz() {
        return quizzes[0];
    }


}
