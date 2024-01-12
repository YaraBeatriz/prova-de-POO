public class SimuladorBoeing757 {

    private Boeing757 boeing757;

    public SimuladorBoeing757() {
        this.boeing757 = new Boeing757();
    }

    public void realizarVooNoite() {
        this.boeing757.setVoar(new VoarNoite());
        this.boeing757.voar();
    }

    public void realizarPousoNoite() {
        this.boeing757.setPousar(new PousarNoite());
        this.boeing757.pousar();
    }

    public static void main(String[] args) {
        SimuladorBoeing757 simuladorBoeing757 = new SimuladorBoeing757();

        simuladorBoeing757.realizarVooNoite();
        simuladorBoeing757.realizarPousoNoite();
    }
}

class Boeing757 implements Aviao {

    private Voar voar;
    private Pousar pousar;

    public Boeing757() {
        this.voar = new VoarDia();
        this.pousar = new PousarDia();
    }

    public void setVoar(Voar voar) {
        this.voar = voar;
    }

    public void setPousar(Pousar pousar) {
        this.pousar = pousar;
    }

    public void voar() {
        this.voar.voar();
    }

    public void pousar() {
        this.pousar.pousar();
    }

    @Override
    public void informarDados() {
        System.out.println("Boeing 757");
    }
}

class VoarNoite implements Voar {

    @Override
    public void voar() {
        System.out.println("Voando à noite");
    }
}

class PousarNoite implements Pousar {

    @Override
    public void pousar() {
        System.out.println("Pousando à noite");
    }
}
