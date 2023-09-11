import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario pretendido: ");
        double salarioPretendido = sc.nextDouble();

        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
        analisarCandidato(salarioPretendido);


    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        String[]instrucao=  {"LIGAR PARA O CANDIDATO","LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA",
                "AGUARDANDO RESULTADO DEMAIS CANDIDATOS"};
        if(salarioBase>salarioPretendido){
            System.out.println(instrucao[0]);
        } else if (salarioBase == salarioPretendido) {
            System.out.println(instrucao[1]);
        } else{
            System.out.println(instrucao[2]);
        }
    }
}