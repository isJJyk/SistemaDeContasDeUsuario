package program;
import Classes.ContaStreaming;
import Classes.PlanoPadrao;
import Classes.PlanoPremium;
import Enum.Planos;
import Enum.Qualidade;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Digite seu nome: ");
            String nome=sc.nextLine();

            System.out.println("Digite seu email: ");
            String email=sc.nextLine();

            System.out.println("Escolha seu tipo de conta");
            System.out.println("1-Plano Padrao(R$ 30,00)");
            System.out.println("2-Plano Premium(R$ 50,00)");
            System.out.println("opção:");
            int opcao= sc.nextInt();

            Planos planoEscolhido=null;
            if (opcao==1){
                planoEscolhido=Planos.PADRAO;
            } else if (opcao==2) {
                planoEscolhido=Planos.PREMIUM;

            }
            System.out.println("\nProcessando assinatura...\n");

            ContaStreaming contaCliente = null;


            if (planoEscolhido == Planos.PADRAO) {
                contaCliente = new PlanoPadrao(nome,email);
            } else if (planoEscolhido == Planos.PREMIUM) {
                contaCliente = new PlanoPremium(nome, email);
            }


            if (contaCliente != null) {
                System.out.println(contaCliente);
            } else {
                System.out.println("Opção inválida! Nenhuma conta foi criada.");
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }

    }
}
