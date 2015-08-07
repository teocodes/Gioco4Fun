package com.gioco.model;

import java.util.ArrayList;
import java.util.List;

public class SettingsPageModel implements Model{

	private int numeroSquadre;
	private int turni;
	private List<Squadra> listaSquadre;
	
	public SettingsPageModel(){
		this.numeroSquadre = 0;
		this.turni = 0;
		listaSquadre = new ArrayList<Squadra>();
	}
	
	public int getNumeroSquadre() {
		return numeroSquadre;
	}
	public void setNumeroSquadre(int numeroSquadre) {
		this.numeroSquadre = numeroSquadre;
	}
	
	public int getTurni() {
		return turni;
	}
	public void setTurni(int turni) {
		this.turni = turni;
	}
	
	public boolean isLast(){
		return listaSquadre.size() >= getNumeroSquadre();
	}
	
	public void addSquadra(String nome) {
			listaSquadre.add(new Squadra(0, getTurni(), nome));
	}
	
	public List<Squadra> getListaSquadre() {
		return listaSquadre;
	}
	
	public void reset(){
		setNumeroSquadre(0);
		setTurni(0);
		listaSquadre.clear();
	}
}
