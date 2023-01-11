import java.util.Scanner;
import java.util.Stack;

public class Question {
  private String subject;
  private String body; 
  private Stack<Alternative> alternatives= new Stack<Alternative>();
  public String getsubject(){
    return this.subject;
  }

  public String getBody(){
    return this.body;
  }

  public void setSubject(String subject){
    this.subject=subject;
  }

  public void setBody(String body){
    this.body=body;
  }
  void createAlternatives(int limit){
  
    Scanner sc = new Scanner(System.in);
  
    int i=1;
    while(i<=limit){
      Alternative alternative = new Alternative();
      
      System.out.println("Pergunta "+ i + "- Escreva o texto:");
      String body = sc.nextLine();
      alternative.setBody(body);

      System.out.println("Está é a alternativa correta? (Digite apenas 'S' ou 'N')");
      String isCorrect = sc.nextLine();

      if(isCorrect.equals("S")){
        alternative.setIsCorrect(true);
      }else if(isCorrect.equals("N")){
        alternative.setIsCorrect(false);
      }else{
      System.out.println("Desculpe não entendi :/");

        continue;
      }

      alternatives.push(alternative);
      i++;


    }
    sc.close();
  };
  // void displayQuestion(){
  //   System.out.println(this.getsubject());
  //   System.out.println(this.getBody());
  //   for(int i = 0 ; i<alternatives.size(); i++){
  //     System.out.println(alternatives);
  //   }
  // }
}
