package aparelho.iphone;

import aparelho.iphone.aparelhotelefonico.AparelhoTelefonico;
import aparelho.iphone.navegador.NavegadorInternet;
import aparelho.iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo ligação!");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz!");
	}
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina: " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba!");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando Página!");
	}
	
	public void tocar() {
		System.out.println("Tocando música!");
	}
	
	public void pausar() {
		System.out.println("Pausando música!");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música: " + musica);
	}
}
