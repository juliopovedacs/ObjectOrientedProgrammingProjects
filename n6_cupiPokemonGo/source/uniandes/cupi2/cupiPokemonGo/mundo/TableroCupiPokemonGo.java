package uniandes.cupi2.cupiPokemonGo.mundo;

import java.util.Properties;

public class TableroCupiPokemonGo {
	
	//---------------------------------------------------------------------------------------
	// Atributos
	//---------------------------------------------------------------------------------------
	
	private boolean juegoCargado;
	
	private int numeroFilas;
	
	private int numeroColumnas;
	
	private Casilla[][] casillas;
	
	private int numeroMovimientos;
	
	private int numeroPokemonesCapturados;
	
	//---------------------------------------------------------------------------------------
	// Constructores
	//---------------------------------------------------------------------------------------
	
	public TableroCupiPokemonGo()
	{
		juegoCargado = false;
		numeroFilas = 0;
		numeroColumnas = 0;
		numeroMovimientos = 0;
		numeroPokemonesCapturados = 0;
	}
	
	//---------------------------------------------------------------------------------------
	// Metodos
	//---------------------------------------------------------------------------------------
	
	public void cargarTableroCupiPokemonGo(Properties pPropiedades) throws Exception
	{
		try 
		{ 
			String numFilas = pPropiedades.getProperty("mapa.tamanho");
			numeroFilas = Integer.parseInt(numFilas);


			String numColumnas = pPropiedades.getProperty("mapa.tamanho");
			numeroColumnas = Integer.parseInt(numColumnas);     

			casillas = new Casilla[numeroFilas][numeroColumnas];
			
			String numMovimientos = pPropiedades.getProperty("mapa.movimientos");
			numeroMovimientos = Integer.parseInt(numMovimientos); 
			
			juegoCargado = true;

		} 
		catch(Exception e) 
		{ 
			//Lanzamiento de posibles excepciones producidas al cargar el archivo properties. 
			e.printStackTrace();
			throw new Exception("Error, las propiedades tienen un formato inv�lido." );  
		} 
	}
	
	public boolean getJuegoCargado()
	{
		return juegoCargado;
	}
	
	public void setJuegoCargado(boolean pJuegoCargado)
	{
		juegoCargado = pJuegoCargado;
	}
	
	public int getNumeroFilas()
	{
		return numeroFilas;
	}
	
	public void setNumeroFilas(int pNumeroFilas)
	{
		numeroFilas = pNumeroFilas;
	}
	
	public int getNumeroColumnas()
	{
		return numeroColumnas;
	}
	
	public void setNumeroColumnas(int pNumeroColumnas)
	{
		numeroColumnas = pNumeroColumnas;
	}
	
	//---------------------------------------------------------------------------------------
	// Puntos de extension
	//---------------------------------------------------------------------------------------
	
	public String metodo1( )
	{
		return "Respuesta 1";
	}

	public String metodo2( )
	{
		return "Respuesta 2";
	}

}
