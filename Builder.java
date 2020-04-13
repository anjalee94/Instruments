package musical.inst;

public enum Builder {
	
	FENDER, MARTINE, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString() {
		
	switch(this) {
	case FENDER: return "fender";
	case MARTINE: return "martine";
	case GIBSON: return "gibson";
	case COLLINGS: return "collings";
	case OLSON: return "olson";
	case RYAN: return "ryan";
	case PRS: return "prs";
	case ANY: return "any";
	}	
		return null;
	}
}