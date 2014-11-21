import java.util.*;
public class Receta {
	private String nombreReceta;
	ArrayList<Ingrediente> ingredientes;
	private String preparacion;

	public void setNombreReceta (String nr){
		this.nombreReceta = nr;
	}
	public String getNombreReceta(){
		return nombreReceta;
	}
	public void setIngredientes (ArrayList<Ingrediente> ing){
		this.ingredientes = ing;
	}
	public ArrayList<Ingrediente>  getIngredientes(){
		return ingredientes;
	}
	public void setPreparacion (String prep){
		this.preparacion = prep;
	}
	public String getPreparacion(){
		return preparacion;
	}
}
