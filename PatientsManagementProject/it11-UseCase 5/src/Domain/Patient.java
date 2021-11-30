package Class_Diagram.Domain;

import java.util.Vector;
import Class_Diagram.Domain.Disease;

public class Patient {
	private String _state;
	public Vector<Disease> _contract = new Vector<Disease>();
}