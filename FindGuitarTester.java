package musical.inst;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		GuitarSpec WhatErinLikes = new GuitarSpec(Builder.FENDER,"stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
//		GuitarSpec WhatErinLikes1 = new GuitarSpec("",0,Builder.GIBSON,"stratocastor",Type.ACOUSTIC,Wood.ADIRONDACK,Wood.ALDER);
//		GuitarSpec WhatErinLikes2 = new GuitarSpec("",0,Builder.OLSON,"stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
				List matchguitar = inventory.search(WhatErinLikes);
				
				if(!matchguitar.isEmpty()) {
					System.out.println("Erin you might like this :");
					for(Iterator i = matchguitar.iterator(); i.hasNext();) {
						Guitar guitar = (Guitar) i.next();
						GuitarSpec Spec = guitar.getSpec();
					System.out.println("We have a " + 
							Spec.getBuilder() + " " +
							Spec.getModel() +" " + 
							Spec.getType() + "guitar:\n" + 
							Spec.getBackWood() + " back and sides,\n" +
							Spec.getTopWood() +" top.\nYou can have only for $: " + 
							guitar.getPrice() +"!");
					}}
				else {
					System.out.println("Sorry Erin we have nothing for you :(");
				}
	}
	private static void initializeInventory(Inventory inventory){
		Spec(Builder.FENDER,"stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
    inventory.addGuitar("V9512",1425.3,Spec);
//    inventory.addGuitar("V9513",1525.2,Builder.GIBSON,"stratocastor",Type.ACOUSTIC,Wood.ADIRONDACK,Wood.ALDER);
//    inventory.addGuitar("V9514",1625.4,Builder.OLSON,"stratocastor",Type.ELECTRIC,Wood.ALDER,Wood.ALDER);
        
	}
}




























