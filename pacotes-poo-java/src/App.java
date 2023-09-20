public class App {
    public static void main(String[] args) throws Exception {
        //Pacotes(package): São subdiretorios a partir da pasta src do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto.

        //Existem algumas conveções para criação de pacotes já utilizados no mercado:
        /*
         * Nomenclatura: Vamos imaginar que sua empresa se chama Power Soft e ela esta desenvolvendo softwares comercial, governamental e um software livre ou se codigo aberto. Abaixo teriamos os pacotes sugeridos conforme tabela abaixo:
         * Comercial: com.powersoft
         * Governamental: gov.powersoft
         * Codigo Aberto: org.powersoft
         */

         //Indetificação: Uma das características de uma classe é a sua identificação: Cliente, NotaFiscal, TituloPagar. Porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (próprio nome) e agora o nome qualificado (endereçamento do pacote + nome), exemplo: Considere a classe Usuario, que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é com.controle.acesso.model.Usuario.
    }
}
