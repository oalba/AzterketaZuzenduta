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
			ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

			for (int i = 0; i < numre; i++) {
				Receta receta = new Receta();
				Scanner sca = new Scanner(System.in);
				System.out.println("Introduce el nombre de la receta " + (i+1) + ": ");
				nomre = sca.next();
				receta.setNombreReceta(nomre);
				//fw.write(nomre + " ; ");
				System.out.print("Introduce el numero de ingredientes: \n");
				numin = sca.nextInt();
				//ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

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

					if (ug.equalsIgnoreCase("u")) {
						ing.setEnGramos(false);
						ing.setCantidadUnidad(cant);
						ing.setCantidadGramos(-1);
						System.out.println(ing.getEnGramos());
						System.out.println(ing.getCantidadUnidad());
						//fw.write(cant + " unidades #");
					 } else if (ug.equalsIgnoreCase("g")) {
						ing.setEnGramos(true);
						ing.setCantidadGramos(cant);
						ing.setCantidadUnidad(-1);
						System.out.println(ing.getEnGramos());
						System.out.println(ing.getCantidadGramos());
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
			try {
				File archivo = new File("./recetas.txt");
				FileWriter fw = new FileWriter(archivo, true);
				for (int k = 0; k < recetas.size(); k++) {
					//Receta recetas = recetas.get(k);
					ingredientes = recetas.get(k).getIngredientes();
					fw.write(recetas.get(k).getNombreReceta() + ";");
					for (int l = 0; l < ingredientes.size(); l++) {
						Ingrediente ing = new Ingrediente();
						//if (ing.getEnGramos()) {
							fw.write(ingredientes.get(l).getNombreIngrediente() + "*" + ingredientes.get(l).getCantidadGramos() + " gramos*" + ingredientes.get(l).getCantidadUnidad() + " unidades #");
							//fw.write(ingredientes.get(l).getNombreIngrediente() + "*" + ingredientes.get(l).getCantidadGramos() + " gramos #");
						// } else if (!ing.getEnGramos()) {
							//fw.write(ingredientes.get(l).getNombreIngrediente() + "*" + ingredientes.get(l).getCantidadUnidad() + " unidades #");
						//}
					}
					fw.write(";" + recetas.get(k).getPreparacion() + "\n");
				}
				fw.close();
			 } catch (IOException ioe) {
				System.out.println("Error E/S: "+ioe);
			}

			//fw.write("..." + "\n");
			//fw.close(); 
		 //}catch (IOException ioe) {
		//	System.out.println("Error E/S: "+ioe);
		
		//}
	}
}