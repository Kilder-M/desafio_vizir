package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entidades.Ligacao.PLANO;
import entidades.Tarifa;

public class TarifaService {

	// Método para retornar uma lista das tarifas pré definidas

	public List<Tarifa> getTarifa() {

		List<Tarifa> tarifas = new ArrayList<>();

		tarifas.add(new Tarifa("011", "016", 1.90));
		tarifas.add(new Tarifa("016", "011", 2.90));
		tarifas.add(new Tarifa("011", "017", 1.70));
		tarifas.add(new Tarifa("017", "011", 2.70));
		tarifas.add(new Tarifa("011", "018", 0.90));
		tarifas.add(new Tarifa("018", "011", 1.90));

		return tarifas;

	}

	public Map<String, Double> calcular(PLANO plano, Double tarifa, Integer minutos ){
		
		Map<String, Double> resultado = new HashMap<>();
		
		Double comPlano = minutos <= plano.getMinutos() ? 0.0 : (minutos - plano.getMinutos()) * tarifa;
		Double semPlano = minutos * tarifa;
		comPlano = minutos > plano.getMinutos() ? comPlano + getTarifaExtra(comPlano) : comPlano;
		resultado.put("COM_PLANO", comPlano);
		resultado.put("SEM_PLANO", semPlano);
		return resultado;
		
		
	}
	
	public Double getTarifaExtra(Double Valorplano) {
		return Valorplano * (10.0 / 100.0);
		
	}
}