package org.zerock.UI;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.zerock.domain.QuizVO;
import org.zerock.repository.QuizRepository;


import java.util.Scanner;
@AllArgsConstructor
public class QuizUI {

    private QuizRepository repository;
    private Scanner scanner;


//    public void ready(){
//        System.out.println("어떤 종류의 문제를 풀고 싶으신가요?");
//        String category = scanner.nextLine();
//
//        String className = "org.zerock.repository."+category+"QuizRepositoryImpl";
//
//        try {
//            repository = (QuizRepository) Class.forName(className).getConstructors()[0].newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        play();
//    }

    public void play(){

        QuizVO quiz = repository.getNextQuiz();

        System.out.println(quiz.getQuiz());
        System.out.println(quiz.getDesc());

        String userAnswer = scanner.nextLine();

        boolean corrent = quiz.checkAnswer(userAnswer);

        if (!corrent){
            System.out.println("집에가~~~!");
            return;
        }
        play();
    }
}
