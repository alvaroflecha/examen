
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // Nombre del alimento
    private String nombreAlimento;
    //Cantidad de proteinas por cada 100 gr
    private float proteinas;
    //Cantidad de carbohidratos por cada 100 gr
    private float carbohidratos;
    //Cantidad de grasas por cada 100 gr
    private float grasas;
    //Cantidad de calorias de un alimento
    private float calorias;
    
    
    
    

    /**
     * Constructor for objects of class Alimento
     */
    public Alimento(String nombreAlimento,float proteinas,float carbohidratos, float grasas )
    {
        // constructor
        this.nombreAlimento = nombreAlimento;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        this.calorias = calorias;
        
    }

    /**
     * Visualizamos la informacion nutricional de los alimentos
     */
    public void muestraDatos()
    {   if((proteinas>=0 && proteinas<=100)&&(carbohidratos>=0 && carbohidratos<=100) && (grasas>=0 && grasas<=100))
        {
            System.out.println("Nombre: " + nombreAlimento);
            System.out.println("Proteinas por cada 100 gramos: " + proteinas);
            System.out.println("Carbohidratos por cada 100 gramos: " + carbohidratos);
            System.out.println("Grasas por cada 100 gramos: " + grasas);
            System.out.println("Calorias: " ); //+ calorias.getCalorias());
            System.out.println("Componente/s mayoritario/s : ");
        }
        
        else
        {
            System.out.println("Has introducido una cantidad erronea para 100 gramos de alimento");
        }
        

    
    }   
    
    
    /**
     * Devuelve la cantidad de calorias que tiene un alimento
     */
    public float getCalorias()
    {
        calorias= ((proteinas*4)+(carbohidratos*4)+(grasas*9));
        return calorias;
    }
    
    /**
     * Muestra cual es el componente mayoritario de un alimento 
     */
    public float componenteMayoritario()
    {
        if((proteinas>=carbohidratos)||(proteinas>=grasas))
        {
      
        }
        return componenteMayoritario();
    }
}
