package musical.inst;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List guitars;
	public Inventory() {
		guitars = new LinkedList();
	}
	public void addGuitar(String serialNumber, double price,GuitarSpec Spec) {
		Guitar guitar = new Guitar(serialNumber,price ,Spec);
			guitars.add(guitar);
	}
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
		}
	public List search(GuitarSpec searchSpec) {
		List matchingGuitar = new LinkedList();
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			//Ignore serialNumber since that is Unique.
			//ignore price since that is unique.
			GuitarSpec guitarSpec = guitar.getSpec();
			if(searchSpec.getBuilder()!=guitarSpec.getBuilder())
				continue;
			String model = searchSpec.getModel().toLowerCase();
			if((model!=null)&&(!model.equals(""))&&(!model.equals(guitarSpec.getModel().toLowerCase())))
				continue;
			if(searchSpec.getType()!=guitarSpec.getType())
				continue;
			if(searchSpec.getBackWood()!=guitarSpec.getBackWood())
				continue;
			if(searchSpec.getTopWood()!=guitarSpec.getTopWood())
				continue;
			matchingGuitar.add(guitar);
		}
		return matchingGuitar;
	}
}










































































