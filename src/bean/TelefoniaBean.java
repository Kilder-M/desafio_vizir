package bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Ligacao.PLANO;
import entidades.Tarifa;
import services.TarifaService;

@ManagedBean
@SessionScoped
public class TelefoniaBean {
	private TarifaService service = new TarifaService();
	private Double tarifa;
	private PLANO plano;
	private Integer minutos;
	private String planoCalculado;
	private Double comPlano;
	private Double semPlano;
	
	
	
	public String calcular() {
		Map<String, Double> resultado = service.calcular(plano, tarifa, minutos);
		setComPlano(resultado.get("COM_PLANO"));
		setSemPlano(resultado.get("SEM_PLANO"));
		return null;
	}
	
	
	public List<PLANO> getPlanos() {
		return Arrays.asList(PLANO.values());
	}
	
	public List<Tarifa> getTarifas(){
		return service.getTarifa();
	}
	
	
	public TarifaService getService() {
		return service;
	}
	public void setService(TarifaService service) {
		this.service = service;
	}
	public Double getTarifa() {
		return tarifa;
	}
	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	public PLANO getPlano() {
		return plano;
	}
	public void setPlano(PLANO plano) {
		this.plano = plano;
	}
	public Integer getMinutos() {
		return minutos;
	}
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	public String getPlanoCalculado() {
		return planoCalculado;
	}
	public void setPlanoCalculado(String planoCalculado) {
		this.planoCalculado = planoCalculado;
	}
	public Double getComPlano() {
		return comPlano;
	}
	public void setComPlano(Double comPlano) {
		this.comPlano = comPlano;
	}
	public Double getSemPlano() {
		return semPlano;
	}
	public void setSemPlano(Double semPlano) {
		this.semPlano = semPlano;
	}
	
	
	
	
}
