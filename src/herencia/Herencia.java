package herencia;

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            
          Abuelo abuelo = new Abuelo();  
          Padre padre = new Padre();
          Hija hija = new Hija();
          
          abuelo.metodoAbuelo();
          System.out.println("");
          
          padre.metodoPadre();
          System.out.println("");
          
          hija.metodoHija();
          System.out.println("");
          
          hija.metodoPadre();
          System.out.println("");
                  
          padre.metodoAbuelo();
          
        
}
}