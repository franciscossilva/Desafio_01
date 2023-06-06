import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class jogoadvinhacao {
 public static void main(String[]args){
     Scanner entrada = new Scanner(System.in);
     Random geradornumero = new Random();
     int pontuacaofinal= 0;
     boolean jogardenovo= true;

     while (jogardenovo){
         int numerosorteado = geradornumero.nextInt(10)+1;
         int pontuaçaoturno = 0;
         List<Integer> numerosacertados= new ArrayList<>();
         List<Integer> numerosnaoacertados = new ArrayList<>();

         System.out.println("Olá bem vindo ao jogo ! Favor inserir um numero de 1 a 10: " );
         int respostajogador = entrada.nextInt();


         if (respostajogador == numerosorteado) {
             //Caso o jogador acerte o numero
             System.out.println("Que sorte, parabens você acertou! ");
             numerosacertados.add(respostajogador);
         }  else if (respostajogador == numerosorteado + 1 || respostajogador == numerosorteado - 1) {
             // caso o jogador quase acerte, em margem de 1 para mais e para menos
             System.out.println("Quase acertou ;) o numero sorteado foi " + numerosorteado);
             pontuaçaoturno += 5;
             numerosnaoacertados.add(respostajogador);
             // caso o jogador erre, ja perde automaticamente
         }else {System.out.println("Infelizmente você errou :(  o numero sorteado foi: "+numerosorteado);
             numerosnaoacertados.add(respostajogador);}

         pontuacaofinal+=pontuaçaoturno;
         System.out.println("A sua pontuaçao nesse turno é: "+pontuaçaoturno);
         System.out.println("Sua pontuação final é : "+pontuacaofinal);

         System.out.println("Numeros acertados: "+numerosacertados);
         System.out.println("Numeros nao acertados: "+numerosnaoacertados);

         System.out.println("Deseja jogar de novo? 'S' para Sim e 'N' para Não: ");
         String resposta= entrada.next();
         if (!resposta.equalsIgnoreCase("s"))
         {jogardenovo = false;}}
     //Pontuação final será mostrada caso o jogador nao queira jogar mais.

     System.out.println("Agradeço por jogar! Sua pontuação é : "+ pontuacaofinal);
     entrada.close();}}