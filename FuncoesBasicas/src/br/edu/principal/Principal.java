package br.edu.principal;

import br.edu.funcoesBasicas.operacoes;

public class Principal {

	public static void main(String[] args) {
		
		int x = operacoes.RecebaX();
		int y = operacoes.RecebaY();
		
		operacoes.soma(x, y);
		operacoes.sub(x, y);
		operacoes.mult(x, y);
		operacoes.div(x, y);
		}

}
