class Candidatos{
	int numero;
	String nome;
	int votos;

	public void mostrar_dados(){
		System.out.println("numero: " + this.numero+ " nome: "+
			this.nome + " votos : " + this.votos + 
			"  classificado: " + this.classificado ());

	}
	public boolean classificado(){
		return(votos >= 10);
	}

	public boolean classificado(int votosminimos){
		return(votos >= votosminimos);
	 }
}