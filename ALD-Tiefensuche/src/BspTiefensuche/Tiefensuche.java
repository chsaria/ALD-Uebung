package BspTiefensuche;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Tiefensuche extends BaseTree<Film> {

	@Override
	/**
	 * Sortierkriterium im Baum: Länge des Films
	 */
	protected int compare(Film a, Film b) {

		return a.compareTo(b);
	}

	/**
	 * Retourniert die Titelliste der Film-Knoten des Teilbaums in symmetrischer Folge (engl. in-order, d.h. links-Knoten-rechts)
	 * @param node Wurzelknoten des Teilbaums
	 * @return Liste der Titel in symmetrischer Reihenfolge
	 */
	public List<String> getNodesInOrder(Node<Film> node) {

		List<String> flatList = new ArrayList<String>();
		

		
		return flatList;
	}
		
	/**
	 * Retourniert Titelliste jener Filme, deren Länge zwischen min und max liegt, in Hauptreihenfolge (engl. pre-order, d.h. Knoten-links-rechts)
	 * @param min Minimale Länge des Spielfilms
	 * @param max Maximale Länge des Spielfilms
	 * @return Liste der Filmtitel in Hauptreihenfolge
	 */
	public List<String> getMinMaxPreOrder(double min, double max) {

		return getMinMaxPreOrder(getRoot(), min, max);
	}
	
	private List<String> getMinMaxPreOrder(Node<Film> node, double min, double max){
		
		List<String> flatList = new ArrayList<String>();
		

		
		return flatList;
	}

}
