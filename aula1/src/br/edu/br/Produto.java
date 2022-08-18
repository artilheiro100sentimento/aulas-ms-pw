package br.edu.br;

public class Produto {

	    private int codigo;
		private String descricao;
		private double valor;
		
		//construtor é formado pelo nome da classe não é void e não
		//tem retorno e ele é chamado na instanciação
		public Produto() {
			System.out.println("Construtor iniciado !");
		}
		
		//sobrecarga - criando novo com argumentos diferentes
		public Produto(int codigo,String descricao,double valor) {
			this.codigo= codigo;
			this.descricao= descricao;		
			this.valor= valor;
			System.out.println("Construtor Cheio!");
			
					
		}
		
}

	


