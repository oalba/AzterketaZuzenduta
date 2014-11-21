public class Ingrediente {
	private String nombreIngrediente;
	private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos;

	public void setNombreIngrediente (String ni){
		this.nombreIngrediente = ni;
	}
	public String getNombreIngrediente(){
		return nombreIngrediente;
	}

	public void setCantidadGramos (int cg){
		this.cantidadGramos = cg;
	}
	public int getCantidadGramos(){
		return cantidadGramos;
	}

	public void setCantidadUnidad (int cu){
		this.cantidadUnidad = cu;
	}
	public int getCantidadUnidad(){
		return cantidadUnidad;
	}

	public void setEnGramos (boolean eg){
		this.enGramos = eg;
	}
	public boolean getEnGramos(){
		return enGramos;
	}
}
