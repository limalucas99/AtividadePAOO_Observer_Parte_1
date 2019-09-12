public class Editora implements Subject {
	 private Collection <Observer> observers;
	    Entregavel entregavel;
	    Editora (){
	        observers = new ArrayList<>();
	    }

	   @Override
	    public void addObserver(Observer observer) {
	        observers.add(observer);
	    }

	    @Override
	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	    @Override
	    public void notifyObservers() {
	        List <Observer> aux = new ArrayList <>();
	        aux.addAll(observers);
	        for (Observer o: aux) {
	            o.update(entregavel);
	            System.out.println();
	        }

	    }
    
}
