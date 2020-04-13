package musical.inst;
import musical.inst.GuitarSpec;

public class Guitar {
	private String serialNumber;
	private double price;
	private  GuitarSpec Spec;
	
	public Guitar(String serialNumber, double price ,GuitarSpec Spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.Spec = Spec;
		
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float newPrice) {
		this.price = newPrice;
	}
	public GuitarSpec getSpec() {
		return Spec;
	}


}






















