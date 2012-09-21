import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	
private static BufferedReader buff;

public static void main(String args[]) throws IOException{
	
	//On affiche un message d'accueil
	System.out.println("Système de lecture d'images PGM");
	
	//On lit le fichier Image qui est mis dans la source
	String fichier = "image.pgm";
	FileInputStream fil = new FileInputStream(fichier);
	InputStreamReader inp = new InputStreamReader(fil);
	buff = new BufferedReader(inp);
	
	//On affiche les caractéristiques du fichier
	String intro=buff.readLine();
	System.out.println("Le code d'intro est: " + intro);
	
	String comment= buff.readLine();
	System.out.println("Les commentaires sont: " + comment);
	
	String taille=buff.readLine();
	System.out.println("La largeur et la hauteur de l'image sont: " + taille);
		
	String z= buff.readLine();
	
	String[][] a = new String[512][512];
	int i;
	int j;
	for (i=0; i<512; i++){
		for (j=0; j<512; j++){
			a[i][j]= buff.readLine();
		}
	}
	
	// On affiche sous forme de tableau
	int k;
	for (k=0; k<512; k++){
	System.out.println(Arrays.toString(a[k]));
	}
	
	
	/**On affiche le fichier
	String ligne;
		while((ligne=buff.readLine())!=null){
		System.out.println(ligne);
	
	}
	*/		

	
}

}
