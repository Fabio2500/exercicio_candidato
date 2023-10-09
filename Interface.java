import java.util.Scanner;

class Interface{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        Candidatos c[];
         
        String estetica;
		String escolha;
		int voto_minimo=0;
		int soma_voto=0;
		int mais_votado=0;
		String mais_votado_nome="";
		String sobrenome[];

        System.out.println("quantos candidatos terá na eleição?");
        c = new Candidatos[sc.nextInt()];

        for(int i = 0 ; i < c.length ; i++){
        c[i] = new Candidatos();

        System.out.println("digite o numero do candidato "+(i+1)+":");
        c[i].numero = sc.nextInt();
        System.out.println("\n");
        sc.nextLine();
        System.out.println("digite o nome do candidato:");
        c[i].nome = sc.nextLine();
        System.out.println("\n");
        System.out.println("digite a quantidade de votos:");
        c[i].votos = sc.nextInt();
        soma_voto += c[i].votos;
        if(c[i].votos > mais_votado){ 
        mais_votado = c[i].votos;
        mais_votado_nome = c[i].nome;
        }
        }
        System.out.println("deseja utilizar o metódo automatico de classificação ou o manual?");
        escolha = new String(sc.next());
        if(escolha.equals("manual")){
        System.out.println("digite a quantidade minima de votos:");
        voto_minimo = sc.nextInt();
        }
        System.out.println("\n");
        sc.nextLine();
        System.out.println("deseja ver em formato de tabela ou apenas os dados?");
        estetica = sc.nextLine();

        if(estetica.equals("apenas os dados")){
        for(int i = 0 ; i < c.length ; i++ ){
        System.out.println("\n");
        c[i].mostrar_dados();

        }
        System.out.println("soma dos votos: " + soma_voto);
        System.out.println("média: " + soma_voto/c.length);
        System.out.println("o candidato mais votado foi " + mais_votado_nome + " com " + mais_votado + " votos");
        }else{
        System.out.println("item:"+" \t"+"numero:"+"\t"+"nome:"+"   \t"+"votos:"+"  \t"+"classificado:"+"   \t");
        for(int i = 0; i < c.length;i++){
        if(escolha.equals("manual")){
        if(c[i].classificado(voto_minimo) == true){ 
        System.out.println((i+1) +" \t"+c[i].numero+"\t"+c[i].nome+" \t"+c[i].votos+" \t"+"sim, excedeu em "+(c[i].votos - voto_minimo)+" de votos"+"   \t");
        
        }else{
            System.out.println((i+1) +" \t"+c[i].numero+"\t"+c[i].nome+" \t"+c[i].votos+" \t"+"não, faltou "+(voto_minimo - c[i].votos)+" de votos"+"   \t");
        }
    }
        if(escolha.equals("automatico")){
        if(c[i].classificado() == true){
        System.out.println((i+1) +" \t"+c[i].numero+"\t"+c[i].nome+" \t"+c[i].votos+" \t"+"sim, excedeu em "+(c[i].votos - 10)+" de votos"+"   \t");
        }else{
        System.out.println((i+1) +" \t"+c[i].numero+"\t"+c[i].nome+" \t"+c[i].votos+" \t"+"não, faltou "+(10 - c[i].votos)+" de votos"+"   \t");
        }
    }
        System.out.println("\n");   
      }

      
      System.out.println("soma dos votos: " + soma_voto);
      System.out.println("média: " + soma_voto/c.length);
      System.out.println("o candidato mais votado foi " + mais_votado_nome + " com " + mais_votado + " votos");

   }
}
}


