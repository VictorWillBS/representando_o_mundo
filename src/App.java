import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Question question = new Question();
        System.out.println("Olá, você deseja criar um pergunta?( Insira 'S' para começar)");
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        if(!res.equals("S") ){
        System.out.println("Que pena, acho que você não quis continuar :( ");
        return;
        }
        System.out.println("Digite a Matéria da Pergunta.");
        String subject = sc.nextLine();
        question.setSubject(subject);
        System.out.println("Digite o Corpo da Pergunta");
        String body = sc.nextLine();
        question.setBody(body);
        System.out.println("Deseja criar quantas alternativas? (Digite apenas números)");
        int limAlternatives = sc.nextInt();
        question.createAlternatives(limAlternatives);
        sc.close();
        // question.displayQuestion();
        System.out.println("Pergunta criada com sucesso!");
    }
}
