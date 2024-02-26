package main;

public class Procedure {
	 private String procedureName;
	    private String date;
	    private String practitionerName;
	    private double charges;

	    
	    public Procedure() {
	    }
	    
	    public Procedure(String procedureName, String date) {
	        this.procedureName = procedureName;
	        this.date = date;
	    }

	    
	    public Procedure(String procedureName, String date, String practitionerName, double charges) {
	        this.procedureName = procedureName;
	        this.date = date;
	        this.practitionerName = practitionerName;
	        this.charges = charges;
	    }

	 
	    public String getProcedureName() {
	        return procedureName;
	    }

	    public void setProcedureName(String procedureName) {
	        this.procedureName = procedureName;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }

	    public String getPractitionerName() {
	        return practitionerName;
	    }

	    public void setPractitionerName(String practitionerName) {
	        this.practitionerName = practitionerName;
	    }

	    public double getCharges() {
	        return charges;
	    }

	    public void setCharges(double charges) {
	        this.charges = charges;
	    }

	    public String toString() {
	    	String procedureInfo = "    Procedure Information:\n";
	        procedureInfo += "    Procedure Name: " + procedureName + "\n";
	        procedureInfo += "    Date: " + date + "\n";
	        procedureInfo += "    Practitioner Name: " + practitionerName + "\n";
	        procedureInfo += "    Charges: $" + charges;
	        return procedureInfo;
	       
	    }
	}
