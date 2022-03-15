package org.zerock.repository;

import org.zerock.domain.QuizVO;

import java.util.ArrayList;

//모든 호출은 인터페이스를 보고 한다
//public을 생략해줘도 된다
public interface QuizRepository {
     QuizVO getNextQuiz();
}
