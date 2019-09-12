
public abstract class Pessoa implements Observer {
	public abstract void reagir (Entregavel n);

    public Pessoa (Subject s) {
        this.s = s;
    }

    private Subject s;

    public Subject getS() {
        return s;
    }

    public void querSair () {
        Random gerador = new Random ();
        boolean sair = gerador.nextDouble() <= 0.1;
        if (sair) {
            getS().removeObserver(this);
        }
    }

}
