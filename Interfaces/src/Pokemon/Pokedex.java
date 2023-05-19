package Pokemon;

import java.util.*;

public class Pokedex 
{
	private LinkedList<Pokemon> listaPokemons;
	private HashMap<Pokemon, LinkedList<Pokemon>> combates;
	private Principal controlador;


	public Pokedex(Principal controlador)
	{
		
	}


	public boolean guardaPokemon(Pokemon pok) {
		
		boolean pokemonAñadido = false;
		
			if(!listaPokemons.contains(pok)) {
				listaPokemons.add(pok);
				pokemonAñadido = true;
			}	
		return pokemonAñadido;
	}


	public LinkedList<Pokemon> getListaPokemons() {
		return listaPokemons;
	}


	public void setListaPokemons(LinkedList<Pokemon> listaPokemons) {
		this.listaPokemons = listaPokemons;
	}


	public HashMap<Pokemon, LinkedList<Pokemon>> getCombates() {
		return combates;
	}


	public void setCombates(HashMap<Pokemon, LinkedList<Pokemon>> combates) {
		this.combates = combates;
	}


	public void borraPokemon(String pok) {
		
		for(Pokemon Snorlax : listaPokemons){
			if(Snorlax.getNombre().equals(pok)) {
				listaPokemons.remove(Snorlax);
			}
		}
		
		}

	public boolean guardaCombate(String ganador, String perdedor) {
		
		boolean combateGuardado = false;
		
		for(Pokemon piplup : combates.keySet()) {
			for(Pokemon p  : combates.get(piplup)) {
				
			}
		}
		
		return combateGuardado;
		// false si ese combate ya estaba.
	}


	public String getListadoTodos() {

		return listaPokemons.toString();
	}


	public String getListadoAlfabeticoMayores(int mínimo) {
		
		return listaPokemons.toString();
	}


	public String getListadoMayores(int mínimo) {
		// TODO Auto-generated method stub
	}


	public String getListadoCombates() {
		// TODO Auto-generated method stub
	}


}
