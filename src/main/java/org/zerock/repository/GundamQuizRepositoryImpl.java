package org.zerock.repository;

import org.zerock.domain.OXQuiz;
import org.zerock.domain.QuizVO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GundamQuizRepositoryImpl implements QuizRepository{

    private QuizVO[] quizzes;
    private int a= 0;


    public GundamQuizRepositoryImpl(Scanner scanner) throws FileNotFoundException {
        quizzes = new QuizVO[5];
        File file = new File("./testquiz.txt");
        scanner = new Scanner(file);

        for (int i = 0; i < quizzes.length; i++) {
            String line = scanner.nextLine();
            String[] arr = line.split(",");
            String quiz = arr[0];
            String answer = arr[1];
            OXQuiz oxQuiz = OXQuiz.builder().build();
            oxQuiz.setQuiz(quiz);
            oxQuiz.setAnswer(answer);

            quizzes[i] = oxQuiz;
        }

//        OXQuiz quiz1 = OXQuiz.builder().build();
//        quiz1.setQuiz("성시경은 가수인가?");
//        quiz1.setAnswer("0");
//
//        quizzes[0] =quiz1;

        }

    @Override
    public QuizVO getNextQuiz() {
        return quizzes[a++];
    }

}
