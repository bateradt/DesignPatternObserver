package com.fib.ExercicioObserver;

import java.util.ArrayList;
import java.util.List;

interface IEscola {
	void executarAcao();
}

class BoletimEscolar implements IEscola {

	@Override
	public void executarAcao() {
		System.out.println("Gerando o boletim escolar dos alunos");
	}
}

class NotificacaoPais implements IEscola {

	@Override
	public void executarAcao() {
		System.out.println("Disparando notifica��o aos pais");
	}
}

class Matricula implements IEscola {

	@Override
	public void executarAcao() {
		System.out.println("Realizando as matriculas do pr�ximo ano");
	}
}

class Observer {

	List<IEscola> objetos = new ArrayList<>();

	public void registrar(IEscola escola) {
		objetos.add(escola);
	}

	public void gerarFimdeAno() {
		for (IEscola iEscola : objetos) {
			iEscola.executarAcao();
		}

	}

	/*
	 * Implementar dois métodos;
	 *
	 * O método registrar, que adiciona um objeto ao observador, para ser
	 * disparado na sequência de ações iniciada pelo método de start; O
	 * método "gerarFimdeAno" que dá o start para a rotina de encerramento do
	 * ano letivo
	 *
	 * obs.: é importante utilizar uma lista para armazenar os objetos que
	 * serão cadastrados
	 */
}

public class ExercicioObserver {
	public static void main(String args[]) {
		Observer o = new Observer();
		o.registrar(new BoletimEscolar());
		o.registrar(new NotificacaoPais());
		o.registrar(new Matricula());

		o.gerarFimdeAno();
	}
}
