package produit;

public class Poisson extends Produit {
	private String datePeche;
	public Poisson(Unite unite,String datePeche) {
		super("Poisson",unite);
		this.datePeche=datePeche;
	}
	@Override
	public String description() {
		return super.getNom()+" pechés le "+datePeche;
	}
	
}
