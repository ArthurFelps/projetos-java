public class candidatura {
    public static void main(String[] args){
            analisarCandidato(1900);
            analisarCandidato(2000);
            analisarCandidato(3000);
    }

        static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000;
            if (salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
            }else if(salarioBase==salarioPretendido){
                System.out.println("Ligar para o candidato com contra proposta");
            }else{
                System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
            }
        }
}