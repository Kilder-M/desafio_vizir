package entidades;

public class Ligacao {
	private Tarifa tarifa;
	private double tempo;
	private PLANO plano;
	
	public enum PLANO {
		FALEMAIS_30("Fale Mais 30",30),
		FALEMAIS_60("Fale Mais 30",60),
		FALEMAIS_120("Fale Mais 30",120);
		
		String plano;
		Integer minutos;
		
		PLANO(String plano, Integer minutos){
			this.plano = plano;
			this.minutos = minutos;
		}
		
		public String getPLano() {
			return this.plano;
		}
		
		public void setPlano(String plano) {
			this.plano = plano;
		}
		
		public Integer getMinutos() {
			return this.minutos;
		}
		
		public void setMinutos(Integer minutos) {
			this.minutos = minutos;

	}

	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}

	public PLANO getPlano() {
		return plano;
	}

	public void setPlano(PLANO plano) {
		this.plano = plano;
	}
	
	
}
