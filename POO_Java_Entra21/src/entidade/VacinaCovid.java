package entidade;

public class VacinaCovid {

		//Declaração dos atribudots da classe, para criar o objeto.
		private String paisOrigen;
		private int estagioPesquisa;
		private String dataInicioPesquisa;
		private String nomePesquisador;
		
		//Getters and Setters
		public String getPaisOrigen() {
			return paisOrigen;
		}
		public void setPaisOrigen(String paisOrigen) {
			this.paisOrigen = paisOrigen;
		}
		public int getEstagioPesquisa() {
			return estagioPesquisa;
		}
		public void setEstagioPesquisa(int estagioPesquisa) {
			this.estagioPesquisa = estagioPesquisa;
		}
		public String getDataInicioPesquisa() {
			return dataInicioPesquisa;
		}
		public void setDataInicioPesquisa(String dataInicioPesquisa) {
			this.dataInicioPesquisa = dataInicioPesquisa;
		}
		public String getNomePesquisador() {
			return nomePesquisador;
		}
		public void setNomePesquisador(String nomePesquisador) {
			this.nomePesquisador = nomePesquisador;
		}			
}