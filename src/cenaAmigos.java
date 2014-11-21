import java.util.*;
import java.io.*;
public class cenaAmigos {
	public static void main(String[] args) {
		//try{
			//FileWriter fw = new FileWriter("/home/zubiri/AriketakJava/AzterketaZuzenduta/src/recetas.txt", true);
			String nomre, nomin, ug, prep, ingres;
			int numre, numin, cant;
			Scanner sc = new Scanner(System.in);
			System.out.print("\nIntroduce el numero de recetas que quieres introducir: \n");
			numre = sc.nextInt();
			ArrayList<Receta> recetas = new ArrayList<Receta>();

			for (int i = 0; i < numre; i++) {
				Receta receta = new Receta();
				Scanner sca = new Scanner(System.in);
				System.out.println("Introduce el nombre de la receta " + (i+1) + ": ");
				nomre = sca.next();
				receta.setNombreReceta(nomre);
				//fw.write(nomre + " ; ");
				System.out.print("Introduce el numero de ingredientes: \n");
				numin = sca.nextInt();
				ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

				for (int j = 0; j < numin; j++) {
					Ingrediente ing = new Ingrediente();
					System.out.print("Introduce el nombre del ingrediente " + (j+1) + ": \n");
					nomin = sca.next();
					ing.setNombreIngrediente(nomin);
					//fw.write(nomin + " * ");
					System.out.print("La cantidad se medira en unidades(u) o en gramos(g)? \n");
					ug = sca.next();
					System.out.print("Introduce la cantidad de " + nomin + ": \n");
					cant = sca.nextInt();

					if (ug == "u") {
						ing.setEnGramos(true);
						ing.setCantidadUnidad(cant);
						//fw.write(cant + " unidades #");
					 } else if (ug == "g") {
						ing.setEnGramos(false);
						ing.setCantidadGramos(cant);
						//fw.write(cant + " gramos #");				
					}

					ingredientes.add(ing);
				}

				receta.setIngredientes(ingredientes);
				System.out.println("Introduce la preparacion de la receta (" + nomre + "): ");
				prep = sca.next();
				receta.setPreparacion(prep);
				//fw.write(" ; " + prep);
				recetas.add(receta);

			} 
			File archivo = new File("/home/zubiri/AriketakJava/AzterketaZuzenduta/src/recetas.txt");
			FileWriter fw = new FileWriter(archivo);
			for (int k = 0; k < recetas.size(); k++) {
				Receta recetaes = recetas.get(k);
				for (int l = 0; l < ingredientes.size(); l++) {
				//for (int l = 0; l < recetaes.getIngredientes().size(); l++) {

					
				}
			}

			//fw.write("..." + "\n");
			//fw.close(); 
		 //}catch (IOException ioe) {
		//	System.out.println("Error E/S: "+ioe);
		
		//}
	}
}