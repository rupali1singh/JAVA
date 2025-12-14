import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] =new String[5];
    public QuestionService(){

        questions[0] = new Question(1,"what","java","cpp","pyhton","ruby","java");
        questions[1] = new Question(1,"what","java","cpp","pyhton","ruby","java");
        questions[2] = new Question(1,"what","java","cpp","pyhton","ruby","java");
        questions[3] = new Question(1,"what","java","cpp","pyhton","ruby","java");
        questions[4] = new Question(1,"what","java","cpp","pyhton","ruby","java");
    }
    public void playQuiz(){
    int i=0;
        for(Question q : questions) {
            System.out.println("Question no. "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection){
            System.out.println(s);
        }
    }
}