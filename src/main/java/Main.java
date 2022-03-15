import org.zerock.UI.QuizUI;
import org.zerock.domain.SubQuiz;
import org.zerock.repository.GundamQuizRepositoryImpl;
import org.zerock.repository.QuizRepository;
import org.zerock.repository.SingerQuizRepositoryImpl;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


//        SubQuiz subQuiz =SubQuiz.builder().build();
//        subQuiz.setQuiz("임진왜란은 몇년도에");
//        subQuiz.setAnswer("2");
//        subQuiz.setArr(new String[]{"1492","1493","1943","1499"});
//
//        System.out.println(subQuiz.getQuiz());
//        System.out.println(subQuiz.getDesc());
//
//        String userAnswer ="2";
//
//        System.out.println(subQuiz.checkAnswer(userAnswer));

        Scanner scanner = new Scanner(System.in);

        QuizRepository repository = new GundamQuizRepositoryImpl(scanner);

        QuizUI quizUI = new QuizUI(repository,scanner);

        quizUI.play();
    }
}
