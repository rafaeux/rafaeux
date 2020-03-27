import java.util.Scanner;
public class CoronaTrabalho {
public String r1 = "Coronavírus é uma família de vírus que causam infecções respiratórias." +
"\nO novo agente do coronavírus (SARS-CoV-2) foi descoberto em 31 de dezembro de 2019, após casos registrados na China, e provoca a doença chamada de coronavírus (COVID-19)." +
"\nOs coronavírus humanos foram isolados pela primeira vez em 1937. No entanto, apenas em 1965, o vírus foi descrito como coronavírus, em decorrência do perfil na microscopia, parecendo uma coroa." +
"\nA maioria das pessoas é infectada com os coronavírus comuns ao longo da vida, sendo as crianças pequenas mais propensas a se infectarem com o tipo mais comum do vírus." +
"\nOs coronavírus mais comuns que infectam humanos são o alpha coronavírus 229E e NL63 e beta coronavírus OC43, HKU1.";
public String r2 = "Os sinais e sintomas do coronavírus são principalmente respiratórios, semelhantes a um resfriado." +
"\nPodem, também, causar infecção do trato respiratório inferior, como as pneumonias." + 
"\nNo entanto, o novo coronavírus (SARS-CoV-2) ainda precisa de mais estudos e investigações para caracterizar melhor os sinais e sintomas da doença." +
"\nAté então, os seus principais sintomas são caracterizados por febre alta, tosse e dificuldade para respirar." +
"\nSe você apresentar febre a partir de 37,8°C e dificuldade para respirar, procure atendimento médico imediatamente." +
"\nSe entrou em contato com pacientes confirmados ou retornou de viagem nos últimos dias, permaneça em casa em observação por no mínimo 7 dias." +
"\nHavendo sintomas (tosse, febre a partir de 37.8°C, coriza) permaneça em isolamento por 14 dias.";
public String r3 = "As formas de transmissão do novo coronavírus ainda estão em processo de investigação, mas já se sabe que acontece de pessoa para pessoa." +
"\nQualquer pessoa que tenha contato próximo (cerca de 1 metro) com alguém com sintomas respiratórios está em risco de ser exposta à infecção." +
"\nAlguns vírus são altamente contagiosos (como sarampo), enquanto outros são menos." +
"\nAinda não está claro com que facilidade o coronavírus se espalha de pessoa para pessoa, mas já se sabe que a transmissão é menos intensa que do vírus da gripe." +
"\nA transmissão dos coronavírus costuma ocorrer por contato pessoal com secreções contaminadas, como:\n" +
"\nGotículas de saliva;" + "\nEspirro;" + "\nTosse;" + "\nCatarro;" + "\nContato pessoal próximo, como toque ou aperto de mão;" +
"\nContato com objetos ou superfícies contaminadas, seguido de contato com a boca, nariz ou olhos.\n" +
"\nO período médio de incubação por coronavírus é de 5 dias, com intervalos que chegam a 12 dias, período em que os primeiros sintomas levam para aparecer desde a infecção." +
"\nA transmissibilidade dos pacientes infectados por SARSCoV é, em média, de 7 dias após o início dos sintomas." +
"\nNo entanto, dados preliminares do coronavírus (SARS-CoV-2) sugerem que a transmissão possa ocorrer mesmo sem o aparecimento de sinais e sintomas." +
"\nAté o momento, não há informações suficientes de quantos dias anteriores ao início dos sinais e sintomas uma pessoa infectada passa a transmitir o vírus.";
public String r4 = "O diagnóstico do coronavírus é feito com a coleta de materiais respiratórios (aspiração de vias aéreas ou indução de escarro)." +
"\nNa suspeita de coronavírus, é necessária a coleta de uma amostra, que será encaminhada com urgência para o Laboratório Central de Saúde Pública (Lacen)." +
"\nPara confirmar a doença, é necessário realizar exames de biologia molecular que detecte o RNA viral." +
"\nO diagnóstico do coronavírus é feito com a coleta de amostra, que está indicada sempre que ocorrer a identificação de caso suspeito." +
"\nOs casos graves devem ser encaminhados a um Hospital de Referência para isolamento e tratamento. Na Bahia, essa unidade é o Instituto Couto Maia (ICOM)." +
"\nOs casos leves devem ser acompanhados pela Atenção Primária em Saúde (APS) e instituídas medidas de precaução domiciliar.";
public String r5 = "Não existe tratamento específico para infecções causadas por coronavírus humano." +
"\nÉ indicado repouso e consumo de bastante água, além de algumas medidas adotadas para aliviar os sintomas, conforme cada caso, como, por exemplo:\n" +
"\n- Uso de medicamento para dor e febre (antitérmicos e analgésicos);" +
"\n- Uso de umidificador no quarto ou tomar banho quente para auxiliar no alívio da dor de garanta e tosse.\n" +
"\nAssim que os primeiros sintomas surgirem, é fundamental procurar ajuda médica imediata para confirmar diagnóstico e iniciar o tratamento." +
"\nTodos os pacientes que receberem alta durante os primeiros 7 dias do início do quadro (qualquer sintoma independente de febre)," +
"devem ser alertados para a possibilidade de piora tardia do quadro clínico e sinais de alerta de complicações, como:" +
"\n- aparecimento de febre (podendo haver casos iniciais sem febre), elevação ou reaparecimento de febre ou sinais respiratórios, " +
"taquicardia (aumento dos batimentos cardíacos), dor pleurítica (dor no peito), fadiga (cansaço) e dispneia (falta de ar).";
public String r6 = "- Lave as mãos com frequência;" +
"\n- Evite contato com pessoas que estejam com sintomas da gripe;" +
"\n- Use lençol descartável para higiene nasal;" +
"\n- Cubra sempre o nariz e a boca com a dobra do cotovelo ao espirrar e tossir;" +
"\n- Evite tocar nos olhos, nariz e boca;" +
"\n- Mantenha seus ambientes bem ventilados.";
    public void encerramentoQuiz(){
        System.out.println("\n------------------------------");
        System.out.println("Obrigado por utilizar a informação a favor da sua saúde. Você e as outras pessoas agradecem.\nAté mais!");
        System.out.println("------------------------------");
    }
    public void perguntasCorona(){
        CoronaTrabalho C = new CoronaTrabalho();
        Scanner ler = new Scanner(System.in);
        int pergunta;
        int resposta;
        int prosseguir;
        System.out.println("------------------------------");
        System.out.println("* Coronavirus - Perguntas e respostas *");
        System.out.println("------------------------------\n");
        System.out.println("Qual é a sua dúvida?\n" +
"\n[1] - O que é coronavírus? (COVID-19)\n[2] - Quais são seus sintomas?\n[3] - Como é feita a sua transmissão?\n[4] - Como é feito o diagnóstico?\n[5] - Existe tratamento?\n[6] - Como se previnir?\n[0] - Encerrar programa");
        System.out.print("\nDigite aqui: ");
        pergunta = ler.nextInt();
        while(pergunta<0 || pergunta>6){
            System.out.print("Digite uma opção válida: ");
            pergunta = ler.nextInt();
        }
        System.out.println("\n-----------------------------");
        switch(pergunta){
            case 1:
                System.out.println(r1);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 2:
                System.out.println(r2);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 3:
                System.out.println(r3);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 4:
                System.out.println(r4);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 5:
                System.out.println(r5);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 6:
                System.out.println(r6);
                System.out.println("-----------------------------");
                System.out.println("\nEscolha o que fazer agora:\n[1] - Voltar\n[2] - Encerrar");
                System.out.print("Digite aqui: ");
                prosseguir = ler.nextInt();
                while(prosseguir<1 || prosseguir>2){
                    System.out.println("Digite uma opção válida: ");
                    prosseguir = ler.nextInt();
                }
                switch(prosseguir){
                    case 1:
                        C.perguntasCorona();
                    break;
                    case 2:
                        C.encerramentoQuiz();
                    break;
                }
            break;
            case 0:
                System.out.println("Obrigado por utilizar a informação a favor da sua saúde. Você e as outras pessoas agradecem.\nAté mais!");
                System.out.println("------------------------------");
            break;
        }  
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        CoronaTrabalho C = new CoronaTrabalho();
        C.perguntasCorona();
    }
}