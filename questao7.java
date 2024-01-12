
public abstract class Aviao {

   protected Voar voarForma;
   protected PousarForma;

   abstract void performanceVoar();
   abstract void performancePousar();

   public setVoarLayout(VoarLayout layout) { 
       this.voarLayout = layout; 
   }

   public setPouarLayout(PouarLayout layout) { 
       this.pouarLayout = layout; 
   }

   public abstract informaDados(); 

}


class Boeing757 extends Aviao {

  @Override  
  public abstract informaDados(){
      
  } 

}

interface Voar {
    public void voar();
}

interface Pousar {
    public void pousar();
}

class VoarDia implements Voar {
    
    @Override
    public void voar() {
      
    }
}

class VoarNoite implements Voar {
    
    @Override
    public void voar() {
     
    }
}

class PousarDia implements Pousar {
    
    @Override
    public void pousar() {
    
    }
}

class PousarNoite implements Pousar {
    @Override
    public void pousar() {
    
    }
}


public class SimuladorBoeing757 {

     public static main(String[] args){
        
     } 
}
